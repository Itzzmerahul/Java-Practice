

interface rath{
    abstract void myname();
}

class ram implements rath{
    public void myname(){
        System.out.println("hey there");
    }

}

public class Interface {
    public static void main(String[] args) {
        rath r = new ram();
        r.myname();
    }
}
