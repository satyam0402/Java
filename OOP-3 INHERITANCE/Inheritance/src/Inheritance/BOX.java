package Inheritance;

public class BOX {
     double l;
     double w;
     double h;


    BOX(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    //CUDE
    BOX(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }

    //if you pass 3 arguments it will call this constructor!
    BOX(double l, double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }

    //copy constructor
    BOX(BOX old){
        this.l= old.l;
        this.h= old.h;
        this.w= old.w;
    }

    public void info(){
        System.out.println("BOX info");
    }
}

