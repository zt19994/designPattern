package com.designpattern.filterPattern;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 过滤女性
 *
 * @author zhongtao on 2018/12/12
 */
public class FemaleFilter implements FilterCriteria {
    @Override
    public List<Person> filterCriteria(List<Person> persons) {
        return persons.stream().filter(person -> Objects.equals(person.getGender(), "FEMALE")).collect(Collectors.toList());
    }
}
