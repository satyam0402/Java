package Inheritance;

public class Main {
    public static void main(String[] args) {
        BOX box1 = new BOX();
        BOX box2 = new BOX(3);
        BOX box3 = new BOX(1,2,3);
        BOX box4 = new BOX(box1);
        //BOX Constructor that does not take any argument:
        System.out.println(box1.l + " " + box1.w + " " + box1.h);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);
        System.out.println(box3.l + " " + box3.w + " " + box3.h);
        System.out.println(box4.l + " " + box4.w + " " + box4.h);
    }
}
