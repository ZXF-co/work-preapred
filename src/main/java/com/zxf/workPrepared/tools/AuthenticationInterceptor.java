package com.zxf.workPrepared.tools;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.zxf.workPrepared.entity.LoginUser;
import com.zxf.workPrepared.service.LoginUserService;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 拦截器
 *
 * @author zhouxiaofa
 * @date 2022/9/27 17:29
 */
@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Resource
    private LoginUserService loginUserService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) {
        String token = httpServletRequest.getHeader("token");
        // 不是映射到方法,直接通过
        if(!(o instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) o;
        Method method = handlerMethod.getMethod();
        // 检查是否有PassToken注解,有则跳过验证
        if(method.isAnnotationPresent(SharedAnnotation.PassToken.class)) {
            SharedAnnotation.PassToken passToken = method.getAnnotation(SharedAnnotation.PassToken.class);
            if(passToken.required()) {
                return true;
            }
        }
        // 检查是否有LoginToken注解
        if(method.isAnnotationPresent(SharedAnnotation.LoginToken.class)) {
            SharedAnnotation.LoginToken loginToken = method.getAnnotation(SharedAnnotation.LoginToken.class);
            if(loginToken.required()) {
                if(null == token) {
                    throw new RuntimeException("无Token");
                }
                // 获取登录用户账号
                String userId;
                try {
                    userId = JWT.decode(token).getAudience().get(0);
                } catch (JWTDecodeException e) {
                    throw new RuntimeException("401");
                }
                LoginUser loginUser = loginUserService.findById(userId);
                if(null == loginUser) {
                    throw new RuntimeException("登录用户不存在!");
                }
                JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(loginUser.getPassword())).build();
                try {
                    jwtVerifier.verify(token);
                } catch (JWTVerificationException e) {
                    throw new RuntimeException("401");
                }
                return true;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
