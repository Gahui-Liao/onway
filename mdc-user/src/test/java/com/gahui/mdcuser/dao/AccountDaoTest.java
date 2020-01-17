package com.gahui.mdcuser.dao;

import com.gahui.mdcuser.JUnitTestBase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/1/16
 **/
@Slf4j
public class AccountDaoTest extends JUnitTestBase {

    @Autowired
    AccountDao accountDao;

    @Test
    public void listAccount() {
        log.info("AccountDetailDto======>{}",accountDao.listAccount());
    }
}
