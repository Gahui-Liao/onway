package com.gahui.mdcuser.dto;

import com.gahui.mdcuser.entity.Address;
import com.gahui.mdcuser.entity.Cert;
import com.gahui.mdcuser.entity.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/1/16
 **/
@Getter
@Setter
@ToString
public class AccountDetailDto {

    private Long accountId;

    private String accountCode;

    private String accountName;

    private String accountPassword;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private Cert certInfo;

    private User userInfo;

    private List<Address> addressList;
}
