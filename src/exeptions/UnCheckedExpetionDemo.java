package exeptions;

public class UnCheckedExpetionDemo {
    public static void main(String[] args) {
        UnCheckedExpetionDemo ued = new UnCheckedExpetionDemo();
        int i = ued.getNumbarFromString("9d");
          System.out.println("Oto nasza liczba pomonożona przez 99" + (i * 99));
    }

    public int getNumbarFromString(String number) {
        return Integer.parseInt(number);
      }
}
