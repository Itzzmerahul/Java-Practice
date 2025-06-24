
class A{
    int priv;
    A(int priv){
        System.out.println("hey i am the parent");
        this.priv=priv;

    }
}

class B extends A{
    String name;
    B(String name){
        super(20);
        System.out.println("hey i am the child");
        this.name=name;
    }
}

class Main{
    public static void main(String args[]){
            B b1=new B("Rahul");
            System.out.println(b1.name + "\n" + b1.priv);
    }
}