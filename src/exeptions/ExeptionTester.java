package exeptions;

public class ExeptionTester {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        System.out.println("Start!!!");
        try {
            System.out.println("Nasz numer to: "+numbers[10/0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Nie ma takiego indeksu");
        } catch (ArithmeticException e){
                    System.out.println("Wystąpił błąd w obliczeniach: " + e.getMessage());
        }

        System.out.println("Koniec!!");
    }
}
