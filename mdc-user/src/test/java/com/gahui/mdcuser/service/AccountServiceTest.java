package com.gahui.mdcuser.service;

import com.gahui.mdcuser.JUnitTestBase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/1/16
 **/
@Slf4j
public class AccountServiceTest extends JUnitTestBase {

    @Resource
    AccountService accountService;
    @Test
    public void listAccountDetail() {
        log.info(String.valueOf(accountService.listAccountDetail(1,10)));
    }
}
