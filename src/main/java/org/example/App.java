package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(83);
        numbers.add(88);
        numbers.add(77);

        Collections.sort(numbers);
        System.out.println("Ascending order");
        System.out.println(numbers);
        /*Comparator<Integer> com = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };*/

        Collections.sort(numbers, ((o1, o2) -> o1%10 > o2%10 ? 1:-1 ));
        System.out.println("Ascending order based on last number");
        System.out.println(numbers);

        List <Student> studentlist = new ArrayList<>();
        studentlist.add(new Student(22,"jks"));
        studentlist.add(new Student(213,"aks"));
        studentlist.add(new Student(29,"bks"));

        /*Comparator<Student> student = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge()%10 > o2.getAge()%10 )
                    return 1;
                else {
                  return -1;
                }
            }
        };*/
     Collections.sort(studentlist,((o1, o2) -> o1.getAge()%10 >o2.getAge()%10 ? 1:-1));
     System.out.println(studentlist);
    }
}
