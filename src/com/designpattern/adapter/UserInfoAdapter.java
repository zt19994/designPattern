package com.designpattern.adapter;

/**
 * 获取用户类型的适配器
 *
 * @author zhongtao on 2018/12/4
 */
public class UserInfoAdapter implements UserInfo {

    UserDetailInfo userDetailInfo;

    public UserInfoAdapter(String type) {
        if (type.equals("ID")) {
            userDetailInfo = new UserInfoById();
        } else if (type.equals("PHONE")) {
            userDetailInfo = new UserInfoByPhone();
        }
    }

    @Override
    public void getInfoByType(String type, String search) {
        if (type.equals("ID")) {
            userDetailInfo.getInfoById(search);
        } else if (type.equals("PHONE")) {
            userDetailInfo.getInfoByPhone(search);
        }
    }
}
