package com.db.service.Impl;

import bean.UserAddress;
import service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "北京市","1","李老师","010","Yes");
        UserAddress address2 = new UserAddress(2, "上海市","2","王老师","011","No");

        return Arrays.asList(address1, address2);
    }
}
