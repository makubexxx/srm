package com.ctbu.srm.modules.user.service.impl;


import com.ctbu.srm.entity.domain.Permission;
import com.ctbu.srm.modules.user.mapper.PermissionMapper;
import com.ctbu.srm.modules.user.service.IPermissionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {
	
}
