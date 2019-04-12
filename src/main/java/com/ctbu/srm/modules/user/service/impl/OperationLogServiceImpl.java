package com.ctbu.srm.modules.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ctbu.srm.entity.domain.OperationLog;
import com.ctbu.srm.modules.user.mapper.OperationLogMapper;
import com.ctbu.srm.modules.user.service.IOperationLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志 服务实现类
 * </p>
 *
 * @author liugh123
 * @since 2018-05-08
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {

}
