package com.sam.packages.staticExample;

public class staticNonStatic {
    public static void main(String[] args) {


    }


    //Static function fun does not depend on any instance or object.
    //Non-static inside Static
    static void fun(){
        System.out.println("Static function");
        //greeting(); // Cant use as it requires instance.

        //how to make greeting run w/o it making it static
        //make an object
        staticNonStatic obj = new staticNonStatic();
        obj.greeting();


    }
    //Non-static inside non-static
    //Object for fun2 will be created in main that is going to  work for greetings too.
    void fun2(){
        greeting();
    }
    //Non-static function greeting belongs to an instance or object
    void greeting(){
        System.out.println("Non Static");
    }
}
