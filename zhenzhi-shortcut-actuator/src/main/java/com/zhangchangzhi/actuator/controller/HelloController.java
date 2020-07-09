package com.zhangchangzhi.actuator.controller;

import com.zhangchangzhi.actuator.domain.BaseResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello,World!";
    }

    @RequestMapping("/login")
    public BaseResponse login(String stationId) {
        return new BaseResponse(true,101,stationId);
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public BaseResponse getUser(@PathVariable Long id) {
        return new BaseResponse(true,101,"userId:"+id);
    }
}
