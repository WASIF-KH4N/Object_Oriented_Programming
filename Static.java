/*class Static {
   // int a =10; java: non-static variable a cannot be referenced from a static context
    static int a =20;
}
class A extends Static{
    public static void main(String[] args) {
        //System.out.println(Static.a);
        //oR
        System.out.println(a);
        // in static variables we dont need of object
    }
}*/

/*class Employee{
    String name;
    int id;
    static String Company_name="Folio3";  // use of static variables
    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    void info(){
        System.out.println(name+","+id+","+Company_name);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("wasif",2);
        e1.info();
        Employee e2 = new Employee("wajahat",3);
        e2.info();
    }
}*/

/*class CounterDemo{
   static int count=10; //11 12 13
   // int count=10; // 11 11 11
    CounterDemo(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        CounterDemo c1 = new CounterDemo();
        CounterDemo c2 = new CounterDemo();
        CounterDemo c3 = new CounterDemo();
    }
}*/

// STATIC METHOD BELONGS TO CLASS NOT OBJECT
// NORMAL METHOD BELONGS TO OBJECT NOT CLASS
 /*class A{
     static void show(){
         System.out.println(" show called");
     }
}
class B {
     static void snow(){
         System.out.println("snow called");

     }
    public static void main(String[] args) {
      A.show();
       snow();
    }
}*/

/*class A{
    //int a =10;
    static int a=10;
    static void test(){

        //System.out.println(a); error because of non static instance variables
       System.out.println(a); //no error
    }
}*/

/*class A{
    static void test(){
        //debug();
       // show(); Non-static method 'show()' cannot be referenced from a static context
        System.out.println("t e s t");
    }
    void show(){
        System.out.println("s h o w");
    }
    static void debug(){
        test();
        System.out.println(" D E B U G G I N G");
    }

    public static void main(String[] args) {
        //A a1 = new A();
       // a1.test();
       // show(); Error because its a non-static method......
       // test(); no error
        test();
        debug();
    }
}*/

/*class staticDemo{
   // int i=10;
     int i=10;
     static void display(){
        System.out.println(this.i); //static method cannot refer to "this" & "super" keyword
    }
}*/



//STATIC BLOCK EXECUTES AUTOMATICALLY WHEN THE CLASS IS LOADED IN THE MEMORY...
class Hello{
    /*static{
        System.out.println("HELLO wasiff");  //only excutes this block
        System.exit(0);//1
    }*/
    static{
        System.out.println("HELLO STATIC 1");//1
    }

    public static void main(String[] args) {
        System.out.println("HELLO MAIN METHOD");//4
    }
    static{
        System.out.println("HELLO STATIC 2");//2
    }
    static{
        System.out.println("HELLO STATIC 3");//3
    }
    //static block executes first.....
}