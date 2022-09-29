package com.zxf.workPrepared.service.impl;

import com.zxf.workPrepared.entity.User;
import com.zxf.workPrepared.mapper.UserMapper;
import com.zxf.workPrepared.model.dto.UserQueryDto;
import com.zxf.workPrepared.tools.SharedQuery;
import com.zxf.workPrepared.query.impl.UserQueryImpl;
import com.zxf.workPrepared.service.UserService;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * User服务实现
 *
 * @author zhouxiaofa
 * @date 2022/9/21 15:16
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findUser(String userId) {
        return userMapper.find(userId);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAll();
    }

    @Override
    public void updateUser(User user) {
        userMapper.update(user);
    }

    @Override
    public List<User> selectUsers(UserQueryDto userQueryDto) {
        UserQueryImpl userQuery = new UserQueryImpl();
        userQuery.id(userQueryDto.getId());
        userQuery.name(userQueryDto.getName());
        userQuery.phone(userQueryDto.getPhone());
        userQuery.gender(userQueryDto.getGender());
        return userMapper.selectUser(userQuery);
    }

    @Override
    public void addPost(SharedQuery sharedQuery) {
        userMapper.addPost(sharedQuery);
    }

    @Override
    public String toExcel() {
        List<User> userList = userMapper.findAll();
        if(CollectionUtils.isEmpty(userList)) {
            return "failed!";
        }
        String filePath = "C:\\Users\\zxf\\desktop";
        String fileName = "test.xlsx";
        OutputStream outputStream = null;
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("数据导出");
        // 标题行
        XSSFRow titleRow = xssfSheet.createRow(0);
        String[] title = new String[]{"ID", "Name", "Gender", "Age", "Phone", "Description", "State", "CreateUserId", "CreateUserName", "CreateDate", "Revision"};
        // 每列小标题
        for (int i = 0; i < title.length; i++) {
            XSSFCell xssfCell = titleRow.createCell(i);
            xssfCell.setCellValue(title[i]);
        }
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            // 数据从第2行开始
            XSSFRow xssfRow = xssfSheet.createRow(i + 1);
            for (int j = 0; j < title.length; j++) {
                XSSFCell xssfCell = xssfRow.createCell(j);
                String key = title[j];
                switch (key) {
                    case "ID":
                        xssfCell.setCellValue(user.getId());
                        break;
                    case "Name":
                        xssfCell.setCellValue(user.getName());
                        break;
                    case "Gender":
                        xssfCell.setCellValue(user.getGender());
                        break;
                    case "Age":
                        xssfCell.setCellValue(user.getAge());
                        break;
                    case "Phone":
                        xssfCell.setCellValue(user.getPhone());
                        break;
                    case "Description":
                        xssfCell.setCellValue(user.getDescription());
                        break;
                    case "State":
                        xssfCell.setCellValue(user.getState().name());
                        break;
                    case "CreateUserId":
                        xssfCell.setCellValue(user.getCreateUserId());
                        break;
                    case "CreateUserName":
                        xssfCell.setCellValue(user.getCreateUserName());
                        break;
                    case "CreateDate":
                        xssfCell.setCellValue(user.getCreateDate());
                        break;
                    case "Revision":
                        xssfCell.setCellValue(user.getRevision());
                        break;
                    default:
                        xssfCell.setCellValue("null");
                        break;
                }
            }
        }
        try {
            File file = new File(filePath + File.separator + fileName);
            outputStream = new FileOutputStream(file);
            xssfWorkbook.write(outputStream);
            outputStream.close();
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success!";
    }
}
