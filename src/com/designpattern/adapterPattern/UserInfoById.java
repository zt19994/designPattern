package com.designpattern.adapterPattern;

/**
 * 实现通过id获取用户信息
 *
 * @author zhongtao on 2018/12/4
 */
public class UserInfoById implements UserDetailInfo {
    @Override
    public void getInfoById(String id) {
        System.out.println("通过用户id获取用户信息，id号：" + id);
    }

    @Override
    public void getInfoByPhone(String phone) {

    }
}
