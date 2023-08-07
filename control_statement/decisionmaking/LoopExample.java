package control_statement.decisionmaking;

public class LoopExample {
    public void displayForLoop(){
        int mathMarks=50;
        int scienceMarks=50;
        if(mathMarks>=50 &&  scienceMarks>=50)
        {
            System.out.println("the student optained A +");
        } else if (mathMarks>=40 && scienceMarks>=40) {
            System.out.println("the student is pass");

        } else {
            System.out.println("the student is fail");
        }
    }
}
