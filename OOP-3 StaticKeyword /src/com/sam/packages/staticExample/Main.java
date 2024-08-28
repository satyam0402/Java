package com.sam.packages.staticExample;

public class Main {
    public static void main(String[] args) {

        Employee Raj = new Employee("Raj", 27, 80000,false);
        Employee Aryan = new Employee("Aryan", 25,60000, false);

        System.out.println(Raj.name);
        System.out.println(Raj.age);
        System.out.println(Raj.salary);
        System.out.println(Raj.married);
        System.out.println(Raj.Employer); //It will work but dont do it like this. Always use className.staticVariable!!
        System.out.println(Employee.Employer);

        System.out.println(Aryan.name);
        System.out.println(Aryan.age);
        System.out.println(Aryan.salary);
        System.out.println(Aryan.married);
        System.out.println(Aryan.Employer);//It will work but dont do it like this. Always use className.staticVariable!!
        System.out.println(Employee.Employer);




    }


}
