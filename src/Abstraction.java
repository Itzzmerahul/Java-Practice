abstract class Animal{
    public String h;
    public abstract void sound();
    public abstract void name();

    Animal(String h){
        this.h=h;
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("bark");
    }

    Dog(String h){
        super(h);
        System.out.println("i am dog \n"+h);
    }
    @Override
    public void name(){
        System.out.println("method of dog");
    }

}

class Cat extends Animal{

    Cat(String h){
        super(h);
        System.out.println("cat constructor");
    }
    @Override
    public void sound(){
        System.out.println("meoww ");
    }
    @Override
    public void name(){
        System.out.println("i am cat \n"+h);
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Animal d = new Dog("Doggy");
        Animal c = new Cat("Cat");
        c.name();
        c.sound();
        d.name();
        d.sound();

    }
}
