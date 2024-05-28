package org.example;

import java.util.*;

public class MapImplemantion {

    public static void main (String args[]){
        Map<Integer, String> map = new HashMap<>();
        map.put(5,"jjj");
        map.put(3,"ijo");
        map.put(66,"maysuh");


        List<Map.Entry<Integer, String>> maplist = new ArrayList<>(map.entrySet());

        /*Collections.sort(maplist, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey()- o2.getKey(); // sorting based on the keys
            }
        });*/

        Collections.sort(maplist, ((o1, o2) -> o1.getKey()-o2.getKey()));


        // stream api
        System.out.println("sorting by stream");
        map.entrySet().stream().sorted((o1, o2) -> o1.getKey()- o2.getKey()).
                forEach(obj-> System.out.println(obj));

        for (Map.Entry<Integer, String> m1 : maplist){
            System.out.println(m1.getKey());  // printing the sorted value
        }
        // old style using entryset
        for(Map.Entry map1 : map.entrySet()){
            System.out.println(map1.getKey());
        }
    }
}
