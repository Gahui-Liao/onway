package com.gahui.mdcuser;

import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: 单元测试基类
 * @author: liaojiaxi
 * @date: 2020/1/16
 **/
@SpringBootTest
@MapperScan(basePackages = {"com.gahui.mdcuser.mapper","com.gahui.mdcuser.dao"})
@RunWith(SpringRunner.class)
public class JUnitTestBase {
}
