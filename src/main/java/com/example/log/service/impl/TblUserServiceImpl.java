package com.example.log.service.impl;

import com.example.log.dao.TblUserMapper;
import com.example.log.entity.TblUser;
import com.example.log.service.TblUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TblUserServiceImpl implements TblUserService {

    @Resource
    private TblUserMapper tblUserMapper;

    @Override
    public List<TblUser> findAll() {
        return tblUserMapper.selectAll();
    }
}
