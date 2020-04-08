package com.example.log.controller;

import com.example.log.dao.TestGenerateMybatisMapper;
import com.example.log.entity.TblUser;
import com.example.log.entity.TestGenerateMybatis;
import com.example.log.service.TblUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LogTestController {

    private static final Logger logger  = LoggerFactory.getLogger(LogTestController.class);

    @Resource
    private TblUserService tblUserService;
    @Resource
    private TestGenerateMybatisMapper testGenerateMybatisMapper;

    @RequestMapping("/logs")
    public String findLogs(){
        logger.info("测试SLF4J");

        try {
            List<TblUser> users = tblUserService.findAll();
            for(TblUser user : users){
                System.out.println(user.toString());
            }
            TestGenerateMybatis testGenerateMybatis = testGenerateMybatisMapper.selectById(1L);
            logger.info("对象内容: [{}], [{}]", testGenerateMybatis.getDescription(), testGenerateMybatis.getGenerateDate());
        }catch (Exception e){
            e.printStackTrace();
            logger.error("错误： {}", e);
        }
        return "/view/upload.html";
    }
}
