package com.gahui.mdcuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Gahui_Liao 2020/1/9
 * @desc: 用户服务启动类
 */

@SpringBootApplication
/**
 * springboot 1.5.8以上版本下面注解其实不加也可以！
 * 置于原因，肯定是spring已经默认啦！
 */
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.gahui.mdcuser.mapper","com.gahui.mdcuser.dao"})
public class MdcUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdcUserApplication.class, args);
    }

}
