package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumeDemo {

    public static void main(String args[]) {
        Consumer consumer = (i) -> System.out.println("this is consuem " + i);
        consumer.accept(10);


        Predicate<Integer> predicate = i-> (i%2 ==0) ;
        System.out.println(predicate.test(6));


        List<Integer> numbers = Arrays.asList(2,5,7,8,90);
        numbers.stream().filter(i-> i%2 ==0).forEach(i-> System.out.println(i));  // predicate

      //Supplier

        List<Integer> nums1 = Arrays.asList();
        System.out.println(nums1.stream().findAny().orElse(7));

        List<String> nums2 = Arrays.asList();
        System.out.println(nums2.stream().findAny().orElseGet(()-> "hii"));



    }

}
