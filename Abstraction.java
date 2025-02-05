abstract class Abstraction {
    void show(){
        System.out.println("show#1");
    }
    abstract void test();
}

class Box extends Abstraction{
    void test(){
        System.out.println("testing");
    }
    void show(){
        super.show();
        System.out.println("show#2");
    }

    public static void main(String[] args) {
        //Abstraction a1 = new Abstraction(); can't create abstract class method(compiler error)
       Box b1 = new Box();
       b1.test();
       b1.show();
    }
}
