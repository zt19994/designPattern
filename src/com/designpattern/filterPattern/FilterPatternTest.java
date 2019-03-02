package com.designpattern.filterPattern;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhongtao on 2018/12/12
 */
public class FilterPatternTest {

    /**
     * 测试过滤器模式
     */
    @Test
    public void testFilterPattern() {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Peter", "MALE", 24));
        persons.add(new Person("Mary", "FEMALE", 22));
        persons.add(new Person("Bob", "MALE", 18));
        persons.add(new Person("Lina", "FEMALE", 20));
        persons.add(new Person("Luna", "FEMALE", 21));

        FilterCriteria maleFilter = new MaleFilter();
        List<Person> males = maleFilter.filterCriteria(persons);
        System.out.println("男的：" + males);

        FilterCriteria ageGreaterThan20 = new AgeGreaterThan20Filter();
        List<Person> ageThan20 = ageGreaterThan20.filterCriteria(persons);
        System.out.println("年龄大于20的人：" + ageThan20);

        FilterCriteria maleAndAgeGreaterThan20 = new MaleAndAgeGreaterThan20Filter();
        List<Person> personList = maleAndAgeGreaterThan20.filterCriteria(persons);
        System.out.println("男的且年龄大于20的人：" + personList);
    }
}
