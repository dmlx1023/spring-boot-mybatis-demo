package com.zycat.springbootmybatisdemo.service;

import com.zycat.springbootmybatisdemo.domain.UsrMmenus;

/**
 * @Description
 * @Author duanmulixiang
 * @create 2018-06-26 7:06
 * @Version 1.0
 **/
public interface UserService {

    public UsrMmenus queryMenu(String menuid);
}
