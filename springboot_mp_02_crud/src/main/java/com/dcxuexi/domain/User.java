package com.dcxuexi.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * @Title User
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/21 21:12
 * @Version 1.0.0
 */
@TableName(value = "platform_user")
//当数据库名与实体类名不一致或不符合驼峰命名时，需要在此注解指定表名
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(type = IdType.AUTO)
    private  Integer userId;
    private  String email;
    private  String userName;
    private  String branchName;

    public User(String userName,String email){
        this.setUserName(userName);
        this.setEmail(email);
    }

//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getBranchName() {
//        return branchName;
//    }
//
//    public void setBranchName(String branchName) {
//        this.branchName = branchName;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "userId=" + userId +
//                ", email='" + email + '\'' +
//                ", userName='" + userName + '\'' +
//                ", branchName='" + branchName + '\'' +
//                '}';
//    }
}
