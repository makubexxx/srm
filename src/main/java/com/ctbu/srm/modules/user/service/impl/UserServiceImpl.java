package com.ctbu.srm.modules.user.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctbu.srm.entity.domain.User;
import com.ctbu.srm.modules.user.mapper.UserMapper;
import com.ctbu.srm.modules.user.service.IUserService;
import com.ctbu.srm.util.ResultUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public ResultUtil list() {
        List<User> list = list(new QueryWrapper<User>().lambda()
                .eq(User::getUserStatus, "0"));
        return ResultUtil.success(list);
    }
}
