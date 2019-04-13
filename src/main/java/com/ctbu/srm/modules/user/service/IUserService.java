package com.ctbu.srm.modules.user.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ctbu.srm.entity.domain.User;
import com.ctbu.srm.util.ResultUtil;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
public interface IUserService extends IService<User> {

    ResultUtil list();
}
