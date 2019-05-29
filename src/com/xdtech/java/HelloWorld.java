package com.xdtech.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorld {
    static List<User> list = Arrays.asList(new User(23,"zhangsan"),new User(22,"lisi"),new User(17,"wangwu"));
    public static void main(String[] args) {
        list.stream().forEach(System.out::println);

        list.stream().map((e)->e.getName()).forEach(System.out::println);

        list.stream().filter((e)->e.getAge()>22).forEach(System.out::println);

        list.stream().sorted((x,y) -> Integer.compare(x.getAge(),y.getAge())).forEach(System.out::println);

        list.stream().sorted(Comparator.comparingInt((x) ->-x.getAge())).forEach(System.out::println);


    }


}
