package com.zb.javaBasic.hashCodeTest;

/**
 * @author ：zhubin
 * @date ：Created in 2020/9/17 1:02 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Person {

    private String name;

    private String age;

    public Person(String name, String age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        Person person = (Person) object;
        return person.getName().equals(getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
