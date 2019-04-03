package com.ctbu.srm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/3 19:24
 * @Email 308348194@qq.com
 */
@Data
@RequiredArgsConstructor
@Entity
@Table(name="tb_teacher")//设置数据库中表名字
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    @NonNull
    private String passWord;
    @Column(nullable = false, unique = true)
    @NonNull
    private String email;
    @Column(nullable = true, unique = true)
    @NonNull
    private String nickName;
    @Column(nullable = false)
    @NonNull
    private String regTime;

    //省略getter settet方法、构造方法

}
