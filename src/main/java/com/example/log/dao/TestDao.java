package com.example.log.dao;

import com.example.log.entity.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {
    List<Test> findAllLogs();

    void save(Test test);
}
