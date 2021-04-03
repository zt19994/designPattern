package com.designpattern.filter;

import java.util.List;

/**
 * 过滤条件接口
 *
 * @author zhongtao on 2018/12/12
 */
public interface FilterCriteria {

    List<Person> filterCriteria(List<Person> persons);
}
