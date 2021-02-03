package com.sun.testproject.controller;

import com.sun.testproject.service.TestService;
import com.sun.testproject.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testproject/test")
@CrossOrigin
public class TestController {

    @Autowired
    private TestService testService ;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public TestEntity test(@RequestParam Integer id){
        System.out.println("id:" + id);
        return testService.getById(id);
    }

}