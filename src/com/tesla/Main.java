package com.tesla;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    private static final User EXISTED_USER = new User("existed", "");
    private static final User NOT_EXISTED_USER = new User("wrong", "");

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("два", "один", "три");

        Map<String, Integer> digestMap = new HashMap<>();
        digestMap.put("один", 1);
        digestMap.put("два", 2);
        digestMap.put("три", 3);

        strings.forEach(str -> System.out.println(digestMap.get(str)));
    }
}
