 /*class ClassAndObject {
   public  void eat() {
       System.out.println("Eating");
        }
        public static void main(String args[]){
       System.out.println("Object Oriented Programming");
            ClassAndObject c1 = new ClassAndObject();
            c1.eat();
            c1.run();
            System.out.println("JAVA");
            ClassAndObject c2 = new ClassAndObject();
            c2.run();
            c2.eat();
          // c2.fly(); //Compile time error
            Bird b1 = new  Bird();
            b1.fly();




            }
     void run(){
         System.out.println("Running");
       }
 }
 class Bird{
    void fly(){
        System.out.println("Flying");
    }
 }*/


                                                             // OBJECT CAN BE INITIALIZED IN 3 WAYS

                                                             // 1) REFERENCE VARIABLES
class Refernce {
    String name;
    int age;

    public static void main(String[] args) {
        Refernce r1 = new Refernce();
        r1.name="WASIF KHAN";
        r1.age=22;
        System.out.println("name: "+r1.name+","+" age: "+r1.age);
       Method m1 = new Method();
       m1.Method("Akash",101);
       m1.display();
       m1.info("Bilal",6125);
       m1.d();

      }
    }


 class Method{
    String employee_name;
    int employee_id;
    void Method(String en,int eid){
        employee_name=en;
        employee_id=eid;
    }
    void display(){
        System.out.println(employee_name);
        System.out.println(employee_id);
    }
    void info(String employee_name,int employee_id){   //Not a constructor!! bcoz of void
        this.employee_name=employee_name;
        this.employee_id=employee_id;
    }
    void d(){
        System.out.println(employee_name+" "+employee_id);
    }
}


