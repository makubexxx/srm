package com.ctbu.srm.modules.user.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ctbu.srm.entity.domain.UserExtend;
import com.ctbu.srm.modules.user.mapper.UserExtendMapper;
import com.ctbu.srm.modules.user.service.IUserExtendService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户扩展信息 服务实现类
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-12
 */
@Service
public class UserExtendServiceImpl extends ServiceImpl<UserExtendMapper, UserExtend> implements IUserExtendService {
	
}
