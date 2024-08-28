package com.sam.packages.staticExample;

public class Employee {
    String name;
    int age;
    int salary;
    boolean married;

   //Static variables are common to all the object of specific class.
    static long Employer;


    public Employee(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;

        // To access static variable which is common to all obj we use class name.variable
        Employee.Employer += 1;

    }
}

