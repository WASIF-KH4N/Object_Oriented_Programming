                                                 //M E T H O D ** O V E R L O A D I N G
                                                       // SAME METHOD NAME
                                                       // SAME CLASS NAME
                                                       // DIFFERENT ARGUMENT/PARAMETER


                                                                 // CASE 1
/* class Polymorphism_Overloading {


    void language(int a) {
        System.out.println("JAVA<1>");
    }

    void language(int a, int b) {
        System.out.println("JAVA<2>");
    }
    public static void main(String[]args){
        Polymorphism_Overloading p1 = new Polymorphism_Overloading();
        //p1.language(10); JAVA<1>
       // p1.language(3,4); JAVA<2>
    }
}*/
                                                                  // CASE 2
/*class Polymorphism_Overloading{
    void sum(int a){
        System.out.println("int");
    }
    void sum(String a){
        System.out.println("string");
    }

    public static void main(String[] args) {

        Polymorphism_Overloading p1 = new Polymorphism_Overloading();
       // p1.sum("wasif"); string
       // p1.sum(10); int
    }
}*/
                                                                  // CASE 3
/*class Polymorphism_Overloading{
    void mul(int a ,String b){
        System.out.print("int String");
    }
    void mul(String a,int b){
        System.out.println("string int");
    }
    public static void main(String[]args){
        Polymorphism_Overloading p1 = new Polymorphism_Overloading();
       // p1.mul(1,"abcd");  int string
       // p1.mul("abcd",1); string int
    }
 }*/


// Can we acheive method overloading by changing the return type of method only??
/*class Polymorphism_Overloading{
    void test(int a){
        System.out.println("void called");
    }
    String test(int a){
        System.out.println("String called");

    }

    public static void main(String[] args) {
        Polymorphism_Overloading p1 = new Polymorphism_Overloading();
        p1.test(10);// compile time error(method overloading is not possible by changing return type because of ambiguity):(
    }
}*/

 // Can we overload java main() method
 /*class Polymorphism_Overloading{
     public static void main(String[] args) {
         System.out.println("1");
         Polymorphism_Overloading p1 = new Polymorphism_Overloading();
         p1.main(77);// 1
                        // 2
     }

     public static void main(int a) {
         System.out.println("2");
         // 1 excute

     } // Yes we can do methodoverloading by main mehod
 }*/


/*class Polymorphism_Overloading{
    void swap(String a){
        System.out.println("String");
    }
    void swap(int a){
        System.out.println("int");
    }

    public static void main(String[] args) {
        Polymorphism_Overloading p1 = new Polymorphism_Overloading();
        p1.swap('a'); // int because of Automatic Promotion

    }
}/*
                                                                   // AUTOMATIC PROMOTION
                                                                         //byte
                                                                         // |
                                                                         // |
                                                                         //short
                                                                         // |
                                                                         // |
                                                 // char------------->   //int ------------>float
                                                                         // |                 |
                                                                         // |                 |
                                                                         //long ------------>double

                                                 //int --> double

                                                 //long --> float


 */
/*class Polymorphism_Overloading{
    void swap(Object a){
        System.out.println("obj");
    }
    void swap(String a){
        System.out.println("str");
    }
                                                                          //string---->object
    public static void main(String[] args) {
        Polymorphism_Overloading p1 = new Polymorphism_Overloading();
        //p1.swap('a'); obj because object  is the parent class of all the classes in java...........
        //p1.swap("ABCDE"); str
        //p1.swap(24.7f); obj
    }
}*/
/*class Polymorphism_Overloading{
    void show(int a){
        System.out.println("int method");
    }
    void show(int...a){
        System.out.println("varargs method");
    }

    public static void main(String[] args) {
        Polymorphism_Overloading p1 = new Polymorphism_Overloading();
        //p1.show(10);  int method
        //p1.show(10,20,30);   varargs method
    }
}*/

