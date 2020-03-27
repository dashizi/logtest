package com.example.log.service;

import com.example.log.entity.Test;

import java.util.List;
import java.util.Map;

public interface TestService {
    List<Test> findAllLogs();

    void save(Test test);
}
