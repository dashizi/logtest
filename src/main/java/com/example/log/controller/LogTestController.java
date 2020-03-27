package com.example.log.controller;

import com.example.log.entity.Test;
import com.example.log.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class LogTestController {
    @Autowired
    private TestService testService;

    @GetMapping("/logs")
    public Map findLogs(){
        Test test = new Test();
        test.setName("测试");
        test.setAge(17);
        testService.save(test);
        List<Test> list = testService.findAllLogs();
        return null;
    }
}
