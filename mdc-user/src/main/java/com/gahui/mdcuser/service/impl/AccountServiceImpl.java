package com.gahui.mdcuser.service.impl;

import com.gahui.mdcuser.dao.AccountDao;
import com.gahui.mdcuser.dto.AccountDetailDto;
import com.gahui.mdcuser.mapper.AddressMapper;
import com.gahui.mdcuser.mapper.CertMapper;
import com.gahui.mdcuser.mapper.UserMapper;
import com.gahui.mdcuser.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/1/16
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource
    AccountDao accountDao;

    @Resource
    CertMapper certMapper;

    @Resource
    UserMapper userMapper;

    @Resource
    AddressMapper addressMapper;

    @Override
    public PageInfo<AccountDetailDto> listAccountDetail(Integer pageNow, Integer pageSize) {
        pageNow = pageNow == null ? 1 : pageNow;
        pageSize = pageSize == null ? 10 : pageSize;
        PageHelper.startPage(pageNow, pageSize);
        List<AccountDetailDto> accountDetailDtos = accountDao.listAccount();
//        for (AccountDetailDto detailDto : accountDetailDtos) {
//            Long accountId = detailDto.getAccountId();
//            //获取认证信息
//            CertExample certExample = new CertExample();
//            certExample.createCriteria().andAccountIdEqualTo(accountId);
//            Cert cert = certMapper.selectByExample(certExample).get(0);
//            //获取用户信息
//            UserExample userExample = new UserExample();
//            userExample.createCriteria().andAccountIdEqualTo(accountId);
//            User user = userMapper.selectByExample(userExample).get(0);
//            //获取收货地址信息
//            AddressExample addressExample = new AddressExample();
//            addressExample.createCriteria().andAccountIdEqualTo(accountId);
//            List<Address> addressList = addressMapper.selectByExample(addressExample);
//
//            detailDto.setCertInfo(cert);
//            detailDto.setUserInfo(user);
//            detailDto.setAddressList(addressList);
//        }
        return new PageInfo<>(accountDetailDtos);
    }
}
