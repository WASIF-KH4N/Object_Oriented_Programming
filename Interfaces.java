/*interface I1 {
    public abstract void start(); // if we dont write public abstract in method,Compiler automatically write public static

    static void tyre() {              // static and default method with "body" should be used in interfaces
        System.out.println("Tyres");
    }

    default void display() {
    }
 public static final int a=2;          //public static final when initialized variables....
class car implements I1{
    public void start(){
        System.out.println("Start with key");
    }

    public static void tyre(){
        System.out.println(" 4 tyres <CAR>");
    }

    public  void display(){
        //default not used.....
        System.out.println(a);
    }
}

}
class bike implements I1{
    public void start(){
        System.out.println("Start with kick");
    }
     static void tyre(){
        System.out.println("2 tyres <BIKE>");
    }
    public static void main(String []args){
        //I1 i new I1(); cannot create object of interface just like abstraction
        car c1=new car();
        c1.start();
        c1.tyre();
        c1.display();
        bike b1 = new bike();
        b1.start();
        b1.tyre();

    }
}*/

// interfaces support "Multiple Inheritance"

/*interface i1{
   public abstract void display();
}
interface i2{
    public abstract void see();
}

class Show implements i1,i2 {
    // i1 i = new i1();
    // cannot create object of interface
    public void display() {
        System.out.println("display i1");
    }

    public void see() {
        System.out.println("see i2");
    }

    public static void main(String[] args) {

        Show s1 = new Show();
        s1.display();
        s1.see();
    }
}*/

