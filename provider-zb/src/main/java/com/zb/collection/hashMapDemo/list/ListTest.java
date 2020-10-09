package com.zb.collection.hashMapDemo.list;

import java.util.*;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/6 4:18 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ListTest {
    public static void main(String[] args) {

        //ArrayList
        List<String> list = new ArrayList<String>();

        //LinkedList
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("1");
        linkedList.add("2");
        System.out.println(linkedList.size());
        //循环输出linkedList，可以看出他是有序插入的
        for(String s : linkedList) {
            System.out.println(s);
        }

        System.out.println(linkedList.get(0));
        //实现list的线程安全
        List<String> synList = Collections.synchronizedList(list);

        Iterator<String> iterator = list.iterator();
        System.out.println(iterator);
        while(iterator.hasNext()) {
            System.out.println("迭代器循环开始");
            iterator.remove();
            System.out.println(iterator.next());
        }
    }

}
