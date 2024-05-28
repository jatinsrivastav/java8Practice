package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ForEachdemo {

    public  static  void main (String args []){

        List<String> names = new ArrayList<>();
        names.add("jks");
        names.add("sks");
        names.add("ddd");


        names.stream().forEach(i-> System.out.println(i));
        System.out.println("separting with stream");
        names.forEach(i-> System.out.println(i)); // for each without stream

        System.out.println("start with j");
        names.stream().filter(s -> s.startsWith("j")).forEach(s -> System.out.println(s));

        Map<Integer, String> map = new HashMap<>();
        map.put(2,"kl");
        map.put(1,"ddd");

       map.forEach((k,v)->System.out.println(k +":" +v));
        System.out.println("storing in strem of map");
        map.entrySet().stream().forEach(i-> System.out.println(i));
        System.out.println("start with d");
        map.entrySet().stream().filter(s->s.getValue().startsWith("d")).forEach(s->System.out.println(s));

       Map<Integer, String> mapk= map.entrySet().stream().filter(s->s.getValue().startsWith("k")).
               collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        mapk.forEach((k,v)->System.out.println(k +":" +v));

    }
}
