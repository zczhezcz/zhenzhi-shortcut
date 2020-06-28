package com.zhangchangzhi.actuator.controller;



import com.zhangchangzhi.actuator.domain.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
