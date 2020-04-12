package com.yuxin.springcloud.controller;


import com.yuxin.springcloud.entity.Dept;
import com.yuxin.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 部门列表 前端控制器
 * </p>
 *
 * @author zc
 * @since 2020-04-11
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @PostMapping("/add")
    public void add(@RequestBody  Dept dept){
        deptService.save(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable Long id){
        return deptService.getById(id);
    }

    @GetMapping("/getList")
    public List<Dept> list(){
        return deptService.list();
    }

}
