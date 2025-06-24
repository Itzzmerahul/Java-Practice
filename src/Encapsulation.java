

class An{
    private String name ;
    private int p;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
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
        System.out.println(a.getP());
        System.out.println(a.getName());
    }


}
