package com.ctbu.srm.modules.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctbu.srm.entity.domain.RolePermission;
import com.ctbu.srm.modules.user.mapper.RolePermissionMapper;
import com.ctbu.srm.modules.user.service.IRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色权限表 服务实现类
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements IRolePermissionService {
	
}
