import java.sql.SQLOutput;

public class ConstructorAndThisDot {
    public static void main(String[] args) {

       //Student 1
        Student Kunal = new Student();

        System.out.println(Kunal.Name);
        System.out.println(Kunal.RollNo);
        System.out.println(Kunal.Marks);

        //Student 2

        Student Rahul = new Student();

        System.out.println(Rahul.Name);
        System.out.println(Rahul.RollNo);
        System.out.println(Rahul.Marks);

    }
}

    class Student {
        String Name;
        int RollNo;

        float Marks;
//We need a way to add values of the above properties Object by Object;
        //We need to use This. to access all the objects

        Student(){
            this.Name="Kunal";
            this.RollNo=13;
            this.Marks=89.5f;
        }

    }

