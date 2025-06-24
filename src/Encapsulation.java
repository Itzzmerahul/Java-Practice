

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
        if(p>0 && p<10000){
            hehe=p;
        }
        else{
            System.out.println("check yo number dumbass");
        }
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
