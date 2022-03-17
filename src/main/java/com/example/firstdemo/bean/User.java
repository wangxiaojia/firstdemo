package com.example.firstdemo.bean;
import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: wxj
 * @Date: 2022/2/22 11:10
 */
@Entity(name="user")
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;
    @Column(name="dept_id")
    private Integer deptId;
    @Column(name="user_name")
    private String userName;
    @Column(name="nick_name")
    private String nickName;
    @Column
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
