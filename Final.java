/*class Final{
    public static void main(String[] args) {
        int i=10;
        i=i+10;
        final int j =20;
       // j=j+1; compile time error    we cannot change value of j because of final (Non access modifier)

       System.out.println("value of i is "+i);
       System.out.println(j);
    }
}*/

/*final class A{
    void main(){
        System.out.println("hello A");
    }
}
class B extends A{   // error <cannot inherit from final A>
    public static void main(String[] args) {
        B b1 = new B();
        b1.main();
    }

}*/

 /*class A{
    final void main(){
        System.out.println("hello A");
    }
}
class B extends A{
     void main(){ // we cannot override final method

     }
    public static void main(String[] args) {
        B b1 = new B();
        b1.main();
    }

}*/