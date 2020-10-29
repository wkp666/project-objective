package com.jk.service;

import com.jk.entity.ClassEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provider")
public interface ClassService {
    @RequestMapping("findClass")
    public List<ClassEntity> findClass();
    @RequestMapping("deleteClass")
    public void deleteClass(@RequestParam Integer id);
    @RequestMapping("selectClassById")
    public ClassEntity selectClassById(@RequestParam Integer id);
    @RequestMapping("addClass")
    public void addClass(@RequestBody ClassEntity clist);
}
