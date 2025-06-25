
class Vehicle{
    public void bike(){
        System.out.println("brMMM BRMM");
    }
    public void car(){
        System.out.println("drrrrrr");
    }
    public void bicycle(){
        System.out.println("cycling");
    }
    public void truck(){
        System.out.println("tapatapa");
    }

}

public class Abstractionraw {
    public static void main(String[] args) {
        Vehicle v= new Vehicle();
        v.bicycle();
        v.car();
        v.bike();
        v.truck();
    }

}
