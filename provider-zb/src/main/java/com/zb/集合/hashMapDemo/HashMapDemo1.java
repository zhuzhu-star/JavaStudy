package com.zb.集合.hashMapDemo;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
* @author ：zhubin
* @date ：Created in 2020/6/12 1:39 上午
* @description：
* @modified By：
* @version: 1.0
*/

    class Student {
        private Integer id;

        public Integer getId() {
            return id;
        }
        public Student(Integer id) {
            this.id = id;
        }
    }

@Component
public class HashMapDemo1 {
public static void main(String[] args){
    Map<Student,String> hashMap = new HashMap<Student, String>();
    Student s1 = new Student(1);
    Student s2 = new Student(1);
    hashMap.put(s1,"this is s1");
    System.out.println(hashMap.get(s2));
    System.out.println(hashMap);
    System.out.println(s1.equals(s2));
    Map<String,Integer> hashTable = new Hashtable<String, Integer>();
}
}
