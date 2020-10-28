package com.db.service.Impl;


import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;

    public void initOrder(String userId) {
        System.out.println("用户id: " + userId);
        // 1.查询用户地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);

        for (UserAddress userAddress: addressList) {
            System.out.println(userAddress.getUserAddress());
        }

    }
}
