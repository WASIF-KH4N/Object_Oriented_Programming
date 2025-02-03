// Encapsulation is a mechanism of wrapping the data(variables) and code acting on the data(methods) together in a single unit

 /*class Encapsulation {
    private String  name;              //refernce variables shpuld be private
    public void setName(String name){
        this.name=name;
    }

    public String getName(){      // getter and setter should be public
        return name;
    }

     public static void main(String[] args) {
         Encapsulation e1 = new Encapsulation();
         e1.setName("WASIF KHAN");
         System.out.println(e1.getName());
     }
}*/

class Encapsulation{
     private int seatNo;
     public void setS(int n){
         seatNo=n;
         System.out.println("My Seat Number is " +seatNo);
     }
     public int getS(){
         return seatNo;
     }
}

class Num extends Encapsulation{
    public static void main(String[] args) {
        Num n1 = new Num();
        n1.setS(6125);
        System.out.println(n1.getS());
    }
}
