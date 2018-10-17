package com.oservice.admin.modules.app.controller;

import com.oservice.admin.common.utils.Result;
import com.oservice.admin.modules.app.annotation.LoginCheck;
import com.oservice.admin.modules.app.annotation.LoginUserInfo;
import com.oservice.admin.modules.app.entity.UserEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * APP测试接口
 *
 * @author LingDu
 * @version 1.0
 */
@RestController
@RequestMapping("/app")
@Api("APP测试接口")
public class AppTestController {

    @LoginCheck
    @GetMapping("userInfo")
    @ApiOperation("获取用户信息")
    public Result userInfo(@LoginUserInfo UserEntity user){
        return Result.ok().put("user", user);
    }

    @LoginCheck
    @GetMapping("userId")
    @ApiOperation("获取用户ID")
    public Result userInfo(@RequestAttribute("userId") Integer userId){
        return Result.ok().put("userId", userId);
    }

    @GetMapping("notToken")
    @ApiOperation("忽略Token验证测试")
    public Result notToken(){
        return Result.ok().put("msg", "无需token也能访问。。。");
    }

}
