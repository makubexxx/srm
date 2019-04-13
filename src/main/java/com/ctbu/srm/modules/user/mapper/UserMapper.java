package com.ctbu.srm.modules.user.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctbu.srm.entity.domain.User;
import com.ctbu.srm.entity.dto.UserDTO;

/**
 * <p>
  * 用户表 Mapper 接口
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 登录校验
     *
     * @param phone
     * @return
     */
    UserDTO getUserDTO(String phone);
}