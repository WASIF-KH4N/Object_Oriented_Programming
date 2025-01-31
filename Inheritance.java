                                            // S I N G L E | I N H E R I T A N C E
/*class Inheritance {
    void Method_A(){
        System.out.println("Parent Class(Inheritance)...");
    }
}
class B extends Inheritance{
    String Method_B(){
       return "Child Class(B)...";
    }
    public static void main(String []args){
        B b1 = new B();
        b1.Method_A();
      // System.out.print( b1.Method_A());   error   java: 'void' type not allowed here
       System.out.print(b1.Method_B());
        //b1.Method_A(); show compile time error without using inheritance.
        Inheritance i1= new Inheritance();
        i1.Method_A();
       // i1.Method_B();  Show error
    }
}*/

                                            // M U L T I L E V E L | I N H E R I T A N C E
/*class Inheritance {
    int sum(int a, int b) {
        System.out.println("Inheritance <Super class>");
        return a + b;
    }
}
class B extends Inheritance{
        void Method_B(){
            System.out.println("Method_B called");
        }
        B(){
            System.out.println("Constructor<B>");
        }

}
class C extends B{
      int mul(int x,int y) {
          System.out.println("sub-class (C called)");
          return x * y;
      }
          public static void main(String []args){
         Inheritance i1 = new Inheritance();
         System.out.println(i1.sum(3,7));
         //i1.Method_B(); error
         //System.out.println(i1.mul(1,4));
          System.out.println("---------------------------------------")  ;

          B b1 = new B();
         // Constructors and private accessibility cannot inherit
         System.out.println(b1.sum(2,5));
        // b1.sum(1,2); Inheritance <Super class>
         b1.Method_B();
        // System.out.println(b1.mul(4,1)) error
           System.out.println("---------------------------------------") ;

           C c1 = new C();
           System.out.println(c1.sum(10,20));
           c1.Method_B();
           System.out.println(c1.mul(10,5));


          }

       }*/

                                               // H E I R A R C H I C A L | I N H E R I T A N C E
/*class Inheritance{
    void Inheritance(){
        System.out.println("Inheritance");
    }
}

class X extends  Inheritance{
     void X(){
         System.out.println("X");
     }
}

class Y extends Inheritance{
    void Y(){
       System.out.println("Y");
    }
    private void add(){
        System.out.print(" adding");
    }

    public static void main(String[] args) {
        Inheritance i1 = new Inheritance();
        i1.Inheritance();
        // i1.X(); error
        // i1.y(); error
        System.out.println("---------------------------------------");

        X x1 = new X();
        x1.Inheritance();
        x1.X();
       // x1.Y(); error
        System.out.println("---------------------------------------");

        Y y1 = new Y();
        y1.Inheritance();
       // y1.X(); error
        y1.Y();
        y1.add();

    }
}*/