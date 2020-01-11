package com.gahui.mdcuser.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/1/9
 **/

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    @GetMapping("/hello")
    @ResponseBody
    public String test(){
        log.info("call usercontroller");
        return "hello sring-cloud!!!";
    }
}
