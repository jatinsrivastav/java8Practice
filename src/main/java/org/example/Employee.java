package org.example;

public class Employee {
    private int salary;
    private String name ;
    private String dept;



    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Employee(int salary, String name, String dept) {
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
