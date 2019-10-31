package com.ray.mybatis_plus.service.emp.impl;

import com.ray.mybatis_plus.bean.emp.Worker;
import com.ray.mybatis_plus.dao.emp.WorkerMapper;
import com.ray.mybatis_plus.service.emp.WorkerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 灵工 服务实现类
 * </p>
 *
 * @author ray
 * @since 2019-10-31
 */
@Service
public class WorkerServiceImpl extends ServiceImpl<WorkerMapper, Worker> implements WorkerService {

}
