public class ConstructorAndValues {
    public static void main(String[] args) {


        Details Kunal = new Details("Kunal",13,88.5f);
        Kunal.greetings();
        System.out.println(Kunal.name);
        System.out.println(Kunal.id);
        System.out.println(Kunal.marks);

        Kunal.changeName("Rahul");

        Details Rahul = new Details("Rahul", 15, 85.2f);
        Rahul.greetings();

        System.out.println(Rahul.id);
        System.out.println(Rahul.name);
        System.out.println(Rahul.marks);



    }
}
class Details {
    String name;
    int id;
    float marks;

    void greetings(){
        System.out.println("Hey, my name is " + this.name);
    }
    void changeName(String newName){
        name = newName;
    }
    Details(String Name, int ID, float Marks){
        this.name = Name;
        this.id = ID;
        this.marks = Marks;

    }
}
