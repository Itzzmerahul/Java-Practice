
abstract class Vehicle1{
    abstract void start();
    abstract void stop();

}

class Bike extends Vehicle1{
    @Override
    public void start(){
        System.out.println("brrrrrr");
    }

    @Override
    public void stop() {
        System.out.println("tapatapa");
    }
}

class Bicycle extends Vehicle1{
    @Override
    public void start(){
        System.out.println("");
    }
    @Override
    public void stop(){
        System.out.println("");
    }
}

class Car extends Vehicle1{
    @Override
    public void start(){
        System.out.println("vrrom");
    }
    @Override
    public void stop(){
        System.out.println("zzhhh");
    }
}

class truck extends Vehicle1{
    @Override
    public void start(){
        System.out.println("tapatapa");
    }
    @Override
    public void stop(){
        System.out.println("katakaa");
    }
}



public class Abstractionlogic {
    public static void main(String[] args) {
        Vehicle1 v = new Bike();
        Vehicle1 b = new Car();
        Vehicle1 c = new Bicycle();
        Vehicle1 d = new truck();
        d.stop();
        d.start();
        c.start();
        c.stop();
        b.start();
        b.stop();
        v.start();
        v.stop();
    }
}
