                        //M E T H O D ** O V E R R I D I N G
                             // SAME METHOD NAME
                             // DIFFERNT CLASS NAME
                             // SAME ARGUMENT/PARAMETER
                             //* INHERITANCE(IS A RELATIONSHIP)


                                       //CASE 1
 /*class Polymorphism_Overriding {
    void eat(){
        System.out.println("EATING PIZZA");
    }
}
class Resturant extends Polymorphism_Overriding{
    void eat() {
        System.out.println("EATING BURGER");
    }
    public static void main(String []args){
        Resturant r1 = new Resturant();
        r1.eat(); // "EATING BURGER"
        Polymorphism_Overriding p1 = new Polymorphism_Overriding();
        p1.eat(); // "EATING PIZZA"
    }
}*/

                                       //CASE 2
/*class Polymorphism_Overriding{
    void drink(String a){
        System.out.println("Drinking water");
    }
}

class Flow extends Polymorphism_Overriding{
    void drink(String a){
        super.drink("wasif");
        System.out.println("Drinking juice");
    }
    public static void main(String[] args) {
        Flow f1 = new Flow();
        f1.drink("wasif"); //  "Drinking water" & "Drinking juice"
        Polymorphism_Overriding p1 = new Polymorphism_Overriding();
        p1.drink("wajahat"); // "Drinking water"
   }
}*/


/*class Polymorphism_Overriding{
 Object show(){
        System.out.println("1");
       return  null;
    }
}

class Num extends Polymorphism_Overriding{
  String show(){
        super.show();
        System.out.println("2");                         //object---------->String,number,character,boolean,Void
        return null;                                      // number ------->byte,long,short,int float,double
    }

    public static void main(String[] args) {
        Num n1 = new Num(); // 1
        n1.show();          // 2
    }
}*/

                           // OVERRIDING AND ACCESS MODIFIER
/*class  Polymorphism_Overriding{
     void animal(){
        System.out.println("LION");
    }
}
                                                    // both modifier are default -->NO I$$UE
class Sound extends Polymorphism_Overriding{        // parent class modifier should be weaker than child class
public void animal(){                           // COMIPLER ERROR-->attempting to assign weaker access privileges; was public
        System.out.println("ELEPHANT");             // Parent class public(Stronger) child class private(Weaker) -->Compile time error
    }                                              //  both public --> no error
                                                   // Parent class protected(weaker) child class public(stronger) -->No error


    public static void main(String[] args) {
        Polymorphism_Overriding p1 = new Polymorphism_Overriding();
        p1.animal();//LION

        Sound s1 = new Sound();
        s1.animal(); // Elephant
    }
}*/

                        // ABSTRACT CLASS AND METHOD OVERRIDING
/*abstract class Polymorphism_Overriding{
     abstract void test();

}
class Human extends Polymorphism_Overriding{
    void test(){
        System.out.println("Hello_2");
    }

    public static void main(String[] args) {
       // Polymorphism_Overriding p1 =  new Polymorphism_Overriding();
        //p1.test(); // abstract class cannot inherit & override
                     // We cant create abstract class objhect
        Human h1 = new Human();
        h1.test();

    }
}*/
                               // INTERFACES AND METHOD OVERRIDING
 /*interface I1{
     void display();
 }

 class Test implements I1{
     public void display(){                      // in interface method should be Strong modifier like public
         System.out.println("Hello Test");
     }

     public static void main(String[] args) {
         //I1 i = new I1();  // we cant create object of interface like abstract class
         //i.display();
         Test t1 = new Test();
         t1.display();
     }

 }*/
/*class Polymorphism_Overriding{
static void show(){
        System.out.println("1");
    }

}
class kick extends Polymorphism_Overriding{
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {        //private,static,final method cannot override........
        kick k1 = new kick();
        k1.show();
        //Polymorphism_Overriding p1 = new Polymorphism_Overriding();
        //p1.show();
    }
}*/



