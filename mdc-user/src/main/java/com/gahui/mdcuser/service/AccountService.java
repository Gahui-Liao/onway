package com.gahui.mdcuser.service;

import com.gahui.mdcuser.dto.AccountDetailDto;
import com.github.pagehelper.PageInfo;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/1/16
 **/
public interface AccountService {

    PageInfo<AccountDetailDto> listAccountDetail(Integer pageNow, Integer pageSize);
}
