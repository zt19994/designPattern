package com.designpattern.structurePattern.adapter;

/**
 * 用户详情 两个接口 通过id或phone获取用户信息
 *
 * @author zhongtao on 2018/12/4
 */
public interface UserDetailInfo {

    void getInfoById(String id);

    void getInfoByPhone(String phone);
}
