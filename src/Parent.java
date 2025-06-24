class P {
    int age;

}

class Teacher extends P{
    String Pname;
    public void introduce(){
        System.out.println("");
    }
}

class Student extends Teacher{
    String Sname;

    Student(String Sname){
        this.Sname=Sname;
    }
    @Override
    public void introduce(){
        System.out.println("2 and 2 equals" + 2*2);
    }
}

public class Parent{
    public static void main(String args[]){
        Student s = new Student("rahul");
        System.out.println(s.Sname);
        s.introduce();
    }
}