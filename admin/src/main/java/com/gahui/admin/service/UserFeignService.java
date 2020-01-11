package com.gahui.admin.service;

import com.gahui.admin.service.impl.FallBackServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/1/9
 **/
@FeignClient(value = "user-service",fallback = FallBackServiceImpl.class)
@Service
public interface UserFeignService {
    @GetMapping(value = "test/hello")
    String hello();
}
