package com.ctbu.srm.modules.user.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctbu.srm.entity.domain.Permission;
import com.ctbu.srm.entity.dto.PermissionDto;

import java.util.List;

/**
 * <p>
  * 权限表 Mapper 接口
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
public interface PermissionMapper extends BaseMapper<Permission> {


    List<PermissionDto> findAll();
}