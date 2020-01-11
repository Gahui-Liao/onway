package com.gahui.admin.service.impl;

import com.gahui.admin.service.UserFeignService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/1/9
 **/
@Service
public class FallBackServiceImpl implements UserFeignService {

    @Override
    public String hello() {
        return "user service is not working!!!";
    }
}
