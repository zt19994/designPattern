package com.designpattern.behaviorPattern.filter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 过滤男性并且年龄大于20
 *
 * @author zhongtao on 2018/12/12
 */
public class MaleAndAgeGreaterThan20Filter implements FilterCriteria {
    @Override
    public List<Person> filterCriteria(List<Person> persons) {
        return persons.stream().filter(person -> Objects.equals(person.getGender(), "MALE"))
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.toList());
    }
}
