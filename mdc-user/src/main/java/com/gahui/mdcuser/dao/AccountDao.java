package com.gahui.mdcuser.dao;

import com.gahui.mdcuser.dto.AccountDetailDto;
import com.gahui.mdcuser.mapper.AccountMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/1/16
 **/
@Repository("accountDao")
public interface AccountDao extends AccountMapper {
    /**
     * @title: listAccount
     * @description: 配合pagehelper分页查询账户信息
     * @author liaojiaxi 2020/1/16 17:11
     *
     * @return
     */
    List<AccountDetailDto> listAccount();
}
