package com.designpattern.structurePattern.adapter;

/**
 * 客户需要的目标类
 *
 * @author zhongtao on 2018/12/4
 */
public class UserInfoSearch implements UserInfo {

    /**
     * 适配器
     */
    UserInfoAdapter userInfoAdapter;

    @Override
    public void getInfoByType(String type, String search) {
        if (type.equals("NAME")) {
            System.out.println("通过用户名获取用户信息，用户名：" + search);
        } else if (type.equals("ID") || type.equals("PHONE")) {
            userInfoAdapter = new UserInfoAdapter(type);
            userInfoAdapter.getInfoByType(type, search);
        } else {
            System.out.println("无效的搜索类型，searchType：" + type);
        }
    }
}
