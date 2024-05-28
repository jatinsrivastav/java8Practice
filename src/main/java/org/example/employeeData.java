package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class employeeData {
    public  static void  main (String args[]){

        List <Employee> employees = new ArrayList<>();
        employees.add(new Employee(9000, "jks", "me"));
        employees.add(new Employee(6000, "aks", "she"));
        employees.add(new Employee(5000, "adds", "sddhe"));


        employees.stream().filter(i->i.getSalary()> 6000).forEach(i->System.out.println(i));
        List <Employee> employees1 =employees.stream().filter(i->i.getSalary()> 6000)
                .collect(Collectors.toList());
        System.out.println(employees1);




    }
}
