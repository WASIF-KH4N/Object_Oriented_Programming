                                           // NON ARGUMENT CONSTRUCTOR ( BY DEFAULT CONSTRUCTOR)

class Constructors {
  int n;
  String s;
    public static void main(String []args){

        Constructors c1 = new Constructors();
       System.out.println( c1.n+" "+c1.s); // 0 null

        userDefCons u1 =  new userDefCons();  // no need  <<<<u1.userDefCons>>>>


        ParaCons p1 = new ParaCons("Bobby",122);
        System.out.println(p1.name+" "+p1.age);



    }
}

                                         // NON ARGUMENT CONSTRUCTOR (USER DEFINED CONSTRUCTOR)
class userDefCons{
    userDefCons(){
        System.out.println(" HELLO JAVA ");
    }
}

                                         // PARAMETRIZED CONSTRUCTOR (USER DEFINED CONSTRUCTOR)
 class ParaCons{
    String name;
    int age;
 public ParaCons(String n,int a){
    name=n;
    age=a;
    System.out.println("Paramertic constructor");
 }
// public ParaCons(String name,int age){
// this.name=name;   // both ways are correct
// this.age=aage;
 //}


}