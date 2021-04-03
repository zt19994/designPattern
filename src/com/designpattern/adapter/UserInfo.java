package com.designpattern.adapter;

/**
 * 通过不同的搜索类型获取用户信息
 *
 * @author zhongtao on 2018/12/4
 */
public interface UserInfo {

    void getInfoByType(String type, String search);
}
