package com.yuxin.springcloud.controller;

import com.yuxin.springcloud.entity.Dept;
import com.yuxin.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptClientController {
    @Autowired
    DeptClientService service;

    @PostMapping("/add")
    public void add(@RequestBody Dept dept){
        service.add(dept);
    }
    @GetMapping("/get/{id}")
    public Dept get(@PathVariable long id){
        return service.get(id);
    }
    @GetMapping("/getList")
    public List<Dept> getList(){
        return service.list();
    }
}
