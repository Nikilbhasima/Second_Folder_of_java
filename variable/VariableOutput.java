package variable;

public class VariableOutput {
    public static void main(String[] args) {
        Variable obj1=new Variable();
        obj1.getVariable();
        System.out.println("number="+obj1.number);
        System.out.println("static variable::"+Variable.name);
        System.out.println("static variable ::"+Variable.name1);
        System.out.println("Static Variable with object ::"+obj1.name1);

    }
}













