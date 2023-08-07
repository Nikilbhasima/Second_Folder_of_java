package statickeyword;

public class Enterpassword{
    public static int check(String a,String b ){

        String c=a.toLowerCase();
        String d=b.toLowerCase();

        if(c.compareTo("nikil")==0 && d.compareTo("12345")==0){
            return 1;
        }
        else {
            return 0;
        }

    }

    public static float areaOfTriangle(int c,int d){
        float area;
        area=(c*d)/2;
        return area;
    }
}
