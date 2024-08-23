public class ConstructorOverloading {
    public static void main(String[] args) {

        StudentConstructor randomConstructor = new StudentConstructor();

        System.out.println(randomConstructor.ID);
        System.out.println(randomConstructor.name);
        System.out.println(randomConstructor.marks);



    }
}
class StudentConstructor {
    String name;
    int ID;
    float marks;

    //Calling constructor from another constructor
    //Internally its like : new StudentConstructor(10,"Kunal",90.5f)
    StudentConstructor(){
    this (10,"Kunal",90.5f);
    }
    StudentConstructor (int id,String name,float marks){

        this.ID = id;
        this.name = name;
        this.marks = marks;

    }
}


