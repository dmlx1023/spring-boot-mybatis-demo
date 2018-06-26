package com.zycat.springbootmybatisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.zycat.springbootmybatisdemo.domain.UsrMmenus;
import com.zycat.springbootmybatisdemo.service.UserService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @Description login interface
 * @Author duanmulixiang
 * @create 2018-06-26 6:54
 * @Version 1.0
 **/
@RestController
@RequestMapping("/")
public class LoginController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "登录接口",notes = "这是使用用户名和密码登录的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "名称",required = true,paramType ="query",dataType = "String"),
            @ApiImplicitParam(name = "pwd",value = "密码",required = true,paramType = "query",dataType ="String")
    })
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public UsrMmenus login(@RequestParam(value = "name",required = true) String name, @RequestParam(value = "pwd",required = true) String pwd){
        return userService.queryMenu("MActivityApply");
    }
}
