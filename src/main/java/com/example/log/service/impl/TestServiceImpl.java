package com.example.log.service.impl;

import com.example.log.dao.TestDao;
import com.example.log.entity.Test;
import com.example.log.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TestServiceImpl implements TestService {
//    @Resource
//    private TestDao testDao;

    @Override
    public List<Test> findAllLogs() {
//        List<Test> list = testDao.findAllLogs();
        return null;
    }

    @Override
    public void save(Test test){
//        testDao.save(test);
    }
}
