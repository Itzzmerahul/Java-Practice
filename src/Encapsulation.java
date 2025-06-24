

class An{
    private String name ;
    private int p;
    private int hehe;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getHehe() {
        return hehe;
    }

    public void setHehe(int p) {
        hehe=p;
    }

    public void setP(int p){
        this.p=p;

    }

    public int getP(){
        return p;
    }

}



public class Encapsulation {
    public static void main(String[] args) {
        An a= new An();
        a.setName("Rahul");
        a.setP(1003);
        a.setHehe(1024);
        System.out.println(a.getP());
        System.out.println(a.getName());
        System.out.println(a.getHehe());
    }


}
