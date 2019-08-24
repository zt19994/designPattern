package com.designpattern.filter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 过滤男性
 *
 * @author zhongtao on 2018/12/12
 */
public class MaleFilter implements FilterCriteria {
    @Override
    public List<Person> filterCriteria(List<Person> persons) {
        //通过流来处理
        return persons.stream().filter(person -> Objects.equals(person.getGender(), "MALE")).collect(Collectors.toList());
    }
}
