package com.designpattern.adapterPattern;

import org.junit.Test;

/**
 * 测试适配器模式
 *
 * @author zhongtao on 2018/12/4
 */
public class UserInfoSearchTest {

    /**
     * 测试适配器模式
     */
    @Test
    public void testAdapter() {
        UserInfoSearch userInfoSearch = new UserInfoSearch();
        userInfoSearch.getInfoByType("ID", "123456");
        userInfoSearch.getInfoByType("PHONE", "13433202125");
        userInfoSearch.getInfoByType("NAME", "Peter");
        userInfoSearch.getInfoByType("EMAIL", "123@163.com");
    }
}
