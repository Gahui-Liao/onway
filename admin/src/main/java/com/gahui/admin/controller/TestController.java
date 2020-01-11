package com.gahui.admin.controller;

import com.gahui.admin.service.UserFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/admin")
@Slf4j
public class TestController {
    @Autowired
    UserFeignService userFeignService;

    @GetMapping("/hello")
    @ResponseBody
    public String test(){
        log.info("call admincontroller");
        return userFeignService.hello();
    }
}
