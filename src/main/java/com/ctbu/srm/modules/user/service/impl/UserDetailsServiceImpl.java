package com.ctbu.srm.modules.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.ctbu.srm.entity.dto.LoginUser;
import com.ctbu.srm.entity.dto.UserDTO;
import com.ctbu.srm.modules.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/13 10:58
 * @Email 308348194@qq.com
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String json) throws UsernameNotFoundException {
        LoginUser loginUser = JSON.parseObject(json, LoginUser.class);
        UserDTO userDTO = userMapper.getUserDTO(loginUser.getUserPhone());
        if (userDTO == null) {
            return null;
        }
        userDTO.setRemember(loginUser.getRemember());
        userDTO.setName(userDTO.getUsername());
        userDTO.setUserName(json);
        return userDTO;
    }
}
