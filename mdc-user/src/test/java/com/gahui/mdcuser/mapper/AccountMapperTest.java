package com.gahui.mdcuser.mapper;

import com.gahui.mdcuser.JUnitTestBase;
import com.gahui.mdcuser.entity.Account;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/1/16
 **/
@Slf4j
public class AccountMapperTest extends JUnitTestBase {
    @Resource
    AccountMapper accountMapper;
    @Test
    public void insert() {
        Account account = new Account();
        account.setAccountId(1L);
        account.setAccountCode("test");
        account.setAccountName("test");
        account.setAccountPassword("8888888");
        log.info("account={}",account.toString());
        accountMapper.insertSelective(account);
//        AccountExample example = new AccountExample();
//        example.createCriteria().andAccountIdEqualTo(1L);
//        accountMapper.deleteByExample(example);
    }
}
