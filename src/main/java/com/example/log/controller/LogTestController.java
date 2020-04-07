package com.example.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LogTestController {

    private static final Logger logger  = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/logs")
    public String findLogs(){
        logger.info("测试SLF4J");
//        try {
//            float i = 1 / 0;
//        }catch (Exception e){
//            e.printStackTrace();
//            logger.error("错误： {}", e);
//        }
        return "/view/upload.html";
    }
}
