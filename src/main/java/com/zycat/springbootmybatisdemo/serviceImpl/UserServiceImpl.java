package com.zycat.springbootmybatisdemo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zycat.springbootmybatisdemo.domain.UsrMmenus;
import com.zycat.springbootmybatisdemo.mapper.UsrMmenusMapper;
import com.zycat.springbootmybatisdemo.service.UserService;

/**
 * @Description
 * @Author duanmulixiang
 * @create 2018-06-26 9:00
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UsrMmenusMapper usrMmenusMapper;
    @Override
    public UsrMmenus queryMenu(String menuid ) {
        return  usrMmenusMapper.selectByPrimaryKey(menuid);
    }
}
