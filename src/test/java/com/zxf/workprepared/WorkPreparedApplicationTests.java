package com.zxf.workprepared;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class WorkPreparedApplicationTests {

    @Resource
    RedisTemplate<String, Object> redisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        String key = "test";
        String value = "testValue";
        redisTemplate.opsForValue().set(key, value);

        Object queryValue = redisTemplate.opsForValue().get(key);
        System.out.println(queryValue);
    }
}
