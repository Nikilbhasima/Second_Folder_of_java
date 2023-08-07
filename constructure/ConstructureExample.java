package constructure;

public class ConstructureExample {
    int empid;
    String empname;
    public ConstructureExample(int empid,String empname){
    this.empid=empid;
    this.empname=empname;
        System.out.println(this.empid);
        System.out.println(this.empname);
    }

    public ConstructureExample(){
        System.out.println("hello mero sathi");


    }
}
