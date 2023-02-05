package exeptions;

public class StackTraceExmple {
    public static void main(String[] args) {
        StackTraceExmple ste = new StackTraceExmple();
        ste.method1();

    }
    public void method1(){
        method2();
    }
    public void method2(){
        method3();
    }
    public void method3(){
        throw new RuntimeException("Bum!!");
    }
}
