package com.yuxin.springcloud.service.impl;

import com.yuxin.springcloud.entity.Dept;
import com.yuxin.springcloud.mapper.DeptMapper;
import com.yuxin.springcloud.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门列表 服务实现类
 * </p>
 *
 * @author zc
 * @since 2020-04-11
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}
