public class ClassesAndObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        //System.out.println(student1);
        //Values
        student1.name = "Kunal";
        student1.rno = 10;
        student1.marks = 88.5f;
        System.out.println(student1.name);
        System.out.println(student1.rno);
        System.out.println(student1.marks);
        System.out.println(student1.percentage);


    }
}
//class
class Student {
    String name;
    int rno;
    float marks;

    // If default value is given :
    float percentage = 81.5f;
}
