package com.designpattern.adapter;

/**
 * 实现通过电话号码获取用户信息
 *
 * @author zhongtao on 2018/12/4
 */
public class UserInfoByPhone implements UserDetailInfo {
    @Override
    public void getInfoById(String id) {

    }

    @Override
    public void getInfoByPhone(String phone) {
        System.out.println("通过电话号码获取用户信息，电话号码：" + phone);
    }
}
