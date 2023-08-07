package exception;
//an exception is an unwanted event that interrupts the normal flow of program when an exception occur and program execution gets terminate
//this such case we get a system generated message.the good thing about exception is that they can handle in java.by handling the exception we can provide a meaningful message to the user.
// difference between exception and error
//type of exception
//checked exception(compile time exception)
//unchecked exception(runtime exception)
/* CHECKED EXCEPTION: occur during the compilation.here the compiler checks whether the exception is handled and throws an error accordingly
* unchecked exception:occur only during program execution.those are not detected during the compilation process
* try{
* sout(5/0);
* } catch(Exception e){
* sout("number cant be divided by 0 );
* }finally{
* .
* }*/
public  class ExceptionExample {
    public void arithmaticNumber(){
        try {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
            System.out.println(5 / 0);
            System.out.println(8);
        }catch (Exception e){
            System.out.println("invalid arithmatic practice");
//            e.printStackTrace();
        }finally {
            System.out.println("hello");
        }

    }


}
