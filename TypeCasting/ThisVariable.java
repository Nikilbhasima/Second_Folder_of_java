package TypeCasting;

public class ThisVariable {
    int x=9;
    public  int nikil(int x){
        System.out.println(x);
        System.out.println(this.x);
        this.x=x;
        System.out.println(x);
        System.out.println(this.x=10);
return 0;
    }
}
