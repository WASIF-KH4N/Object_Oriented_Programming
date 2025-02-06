
    // U S E S                     O F                         T H I S                          K E Y W O R D



/*class This {
    int a;
    void show(int a){
        //a=a; 0  by default
       this.a=a;  //7
    }
    void display(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        This t1 = new This();
        t1.show(7);
        t1.display();
    }
}*/

/*class This{
    void test(){
        System.out.print("TE$TING");
    }
    void show(){
    //test();
            this.test();
    }

    public static void main(String[] args) {
        This t1 = new This();
        t1.show();
    }
}*/

    /* class This {
        This() {
            this(1,2);//Parametric Constructor
                            //No Argument Constructor
            System.out.println("No Argument Constructor");
        }

        This(int x, int y) {
            //this();  //No Argument Constructor
                   //Parametric Constructor

            System.out.println("Parametric Constructor");
        }

        public static void main(String[] args) {

            //This t1 = new This(); No argument constructor
            //This t1 = new This(1,2); Parametric Constrcutor
           // This t1 = new This(7,8);
            This t1 = new This();
        }
    }*/

/*class This{
    void m1(This t1){
        System.out.println("M1 method");
    }
    void m2(){
        m1(this);

    }

    public static void main(String[] args) {
        This t1 = new This();
        t1.m2();

    }

}*/
    class This{
        This name(){
        // System.out.println("hello");
            return this;

        }

    public static void main(String[] args) {
        This t1 = new This();
        t1.name();
    }
}