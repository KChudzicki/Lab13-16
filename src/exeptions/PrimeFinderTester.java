package exeptions;

public class PrimeFinderTester {
    public static void main(String[] args) {
        try {
            PrimeFinder pf = new PrimeFinder(3);
            pf.run();
            System.out.println(pf.prime);
            System.out.println(pf.isPrime(12));
        } catch (NegativeNumberException e) {
                        System.out.println("Podano ujemną liczbę"+e.getMessage());
        }
    }
}
