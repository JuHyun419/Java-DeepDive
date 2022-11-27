package com.example.java.deepdive.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapDive {

    public static void main(String[] args) {
        mapConstructor();
    }

    public static void mapOfException() {
        Map<String, Integer> immutableMap = Map.of();
        immutableMap.put("a", 2); // UnsupportedOperationException
    }

    public static void mapConstructor() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>(10);
        Map<String, Integer> map3 = new HashMap<>(10, 0.8f);
        Map<String, Integer> map4 = new HashMap<>(new HashMap<>());
    }

}
