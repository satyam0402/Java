public class ConstructorAndFunctions {
    public static void main(String[] args) {

        //Student 1
        Profile Kunal = new Profile();
        //Kunal.changeName("Raj");

        Kunal.greetings();

        System.out.println(Kunal.Name);
        System.out.println(Kunal.RollNo);
        System.out.println(Kunal.Marks);

        //Student 2

        Profile Rahul = new Profile();
        Rahul.changeName("Rahul");
        Rahul.greetings();

        System.out.println(Rahul.Name);
        System.out.println(Rahul.RollNo);
        System.out.println(Rahul.Marks);

    }
}



class Profile {
    String Name;
    int RollNo;

    float Marks;
//We need a way to add values of the above properties Object by Object;
    //We need to use This. to access all the objects
void greetings(){
    System.out.println("Hayo, My name is " + Name);
}
void changeName(String newName){
    Name = newName;
}
    Profile(){
        this.Name="Kunal";
        this.RollNo=13;
        this.Marks=89.5f;
    }

}