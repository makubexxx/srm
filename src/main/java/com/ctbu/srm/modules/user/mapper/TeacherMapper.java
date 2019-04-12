package com.ctbu.srm.modules.user.mapper;

import com.ctbu.srm.entity.domain.Teacher;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;

import java.sql.Savepoint;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-11
 */
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {



    @Select("SELECT * FROM tb_teacher WHERE user_name =#{user_name}")
    List<Teacher> selectByName(@Param("user_name") String user_name);

}
