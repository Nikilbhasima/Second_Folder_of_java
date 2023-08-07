package TypeCasting;

public class CastingDemo {
    public void wideningCasting(){
        float firstname=50.393f;
        System.out.println("before converting="+firstname);
        int secondNumber=(int)firstname;
        System.out.println("after converting="+secondNumber);

    }

    public void narrowCasting(){
        int firstname2=50;
        System.out.println("before converting="+firstname2);
        float secondNumber2=firstname2;
        System.out.println("after converting="+secondNumber2);

    }
}
