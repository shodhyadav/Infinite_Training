class ExceptionDemo {
    public static int divide(int number1, int number2) {
        try {
            int quotient = number1/number2;       // If an exception occurs here, the control jumps to the first matching catch block
            System.out.println(quotient);      // Execution of this line will be skipped
            return 0;
        }

        catch(ArrayIndexOutOfBoundsException | ArithmeticException  exception) {
            System.out.println("Index not found");
            exception.printStackTrace();
        }

        catch(RuntimeException e){
            System.out.println("from exception");
            e.printStackTrace();
        }

        catch(Exception e){
            System.out .println("from runtime exception");
            e.printStackTrace();
        }
        finally {
            System.out.println("At the end of the divide method");
        }

        System.out.println("Method execution ends");       // Program execution will continue from this line
        return 0;
    }

    public static void main(String args[]) {
        divide(10, 5);
        System.out.println("after exception");
    }
}

public class ExceptionExample {

    void m1() throws Exception{
        throw new Exception();
    }
    void m2() throws Exception{
        try {
            m1();
        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
        System.out.println("after catch");
    }

    void m3() throws RuntimeException{
        throw new RuntimeException();
    }

    void m4() throws StockException{
        throw new StockException();
    }

    void m5() throws StockRuntimeException{
        throw new StockRuntimeException();
    }

    public static void main(String[] args) {
        ExceptionExample obj = new ExceptionExample();
        try{
            obj.m2();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }


        try{
            obj.m3();
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        try {
            obj.m4();
        } catch (StockException e) {
            e.printStackTrace();
        }


        try{
            obj.m5();
        }catch (StockRuntimeException e){
            e.printStackTrace();
        }

        System.out.println("after method");
    }

}


class StockException extends Exception{

}

class StockRuntimeException extends RuntimeException{

}