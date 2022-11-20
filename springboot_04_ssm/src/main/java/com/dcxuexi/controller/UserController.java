package com.dcxuexi.controller;

import com.dcxuexi.domain.Result;
import com.dcxuexi.domain.ResultCode;
import com.dcxuexi.domain.User;
import com.dcxuexi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/8 21:22
 * @Version 1.0.0
 */
//统一每一个控制器方法返回值
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Result save(@RequestBody User user) {
        Boolean saveBoolean = userService.save(user);
        if (saveBoolean)
            return new Result("0000", ResultCode.SAVE_SUCCES,"保存成功");
        return new Result("保存失败", ResultCode.SAVE_FAIL,"保存失败");
    }

    @PutMapping
    public Result update(@RequestBody User user){
        System.out.println(user);
        Boolean updateBoolean = userService.update(user);
        if (updateBoolean)
            return new Result("0000", ResultCode.UPDATE_SUCCES,"修改成功");
        return new Result("0000", ResultCode.UPDATE_FAIL,"修改成功");

    }

    @DeleteMapping("/{userId}")
    public Result delete(@PathVariable Integer userId){
        Boolean deleteBoolean = userService.delete(userId);
        if (deleteBoolean)
            return new Result("0000", ResultCode.DELETE_SUCCES,"删除成功");
        return new Result("删除失败", ResultCode.DELETE_FAIL,"删除失败");
    }

    @GetMapping("/{userId}")
    public Result findByUserId(@PathVariable Integer userId){



        //手动添加一个错误信息
        //if(userId==10){
        //   int i = 10/0;
        //}
        User user = userService.findByUserId(userId);
        if (user != null){
            return new Result(user, ResultCode.SELECT_SUCCES,"查询成功");
        }
        return new Result(null, ResultCode.SELECT_FAIL,"查询失败");
    }

    @GetMapping
    public Result findAll(){
        List<User> userList = userService.findAll();
        if (userList != null){
            return new Result(userList, ResultCode.SELECT_SUCCES,"查询成功");
        }
        return new Result(null, ResultCode.SELECT_FAIL,"查询失败");
    }
}
