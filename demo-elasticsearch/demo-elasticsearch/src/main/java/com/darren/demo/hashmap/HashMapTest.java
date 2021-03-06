package com.darren.demo.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author : darren
 * @date : 2020/6/9
 */
public class HashMapTest {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>(16);

        LinkedHashMap linkedHashMap = new LinkedHashMap();

        linkedHashMap.put("darren", "ying");

        map.put("darren", "ying");

        Collections.synchronizedMap(map);

    }
}
