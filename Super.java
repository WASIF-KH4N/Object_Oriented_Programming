
                                                     // IN VARIABLES
/*class Super {
    int i = 20;
}
class B extends Super{
    int i=40;
    void main(int i){
        //System.out.println(i); 10
       // System.out.println(this.i); 40
        // System.out.println(super.i); 20
    }

    public static void main(String[] args) {
        B s1 = new B();
        s1.main(10);
    }
}*/

/*class A{                                          // IN METHODS
    void a1(){
        System.out.println("I am in method a1");
    }
}
class B extends A{
    void b1(){
       super.a1();
    }

    public static void main(String[] args) {
        B b = new B();
        //b.a1();
       // b.b1();  "I am in method a1"
       // b.b1(); "I am in method a1" super()

    }
}*/
                                                                 // IN METHODS
/*class A{
    void m1(){
        System.out.println("m1 (1)");
    }
}
class B extends A{
    void m1(){
        System.out.println("m1 (2)");
    }
     void show(){
        //m1
        super.m1();
     }

    public static void main(String[] args) {
        B b1 = new B();
      //  b1.show(); m1 (2)
       // b1.show(); m1 (1)

    }
}*/

                                                      // IN CONSTRUCTOR
/*class A{
    A(){
        System.out.println("A called");
    }
}

class B extends A{
    B(){
       // super();  if we dont write super() compiler automatically write super() and both statements execute
        System.out.println("B called");
    }

    public static void main(String[] args) {
      //  A b1 = new B();  both execute  // A called
                           //B called
      //  B b1 = new A(); error
      //  B b1 = new B();  both execute
        B b1 = new B();

    }
}*/