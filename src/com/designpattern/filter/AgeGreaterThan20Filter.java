package com.designpattern.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 年龄大于20
 *
 * @author zhongtao on 2018/12/12
 */
public class AgeGreaterThan20Filter implements FilterCriteria {
    @Override
    public List<Person> filterCriteria(List<Person> persons) {
        return persons.stream().filter(person -> person.getAge() > 20).collect(Collectors.toList());
    }
}
