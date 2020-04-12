package com.yuxin.springcloud.service;

import com.yuxin.springcloud.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 部门列表 服务类
 * </p>
 *
 * @author zc
 * @since 2020-04-11
 */
@FeignClient(value = "springcloud-provider-dept")
@RequestMapping("/dept")
public interface DeptClientService {
    @PostMapping("/add")
    public void add(@RequestBody Dept dept);

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable (value="id") Long id);

    @GetMapping("/getList")
    public List<Dept> list();
}
