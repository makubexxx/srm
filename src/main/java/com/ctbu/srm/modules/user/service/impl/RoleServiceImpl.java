package com.ctbu.srm.modules.user.service.impl;


import com.ctbu.srm.entity.domain.Role;
import com.ctbu.srm.modules.user.mapper.RoleMapper;
import com.ctbu.srm.modules.user.service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
	
}
