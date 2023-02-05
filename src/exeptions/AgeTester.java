package exeptions;

public class AgeTester {
    public static void main(String[] args) {
        try {
            checkAge(12);
        } catch (Exception e) {
            System.out.println("Problem "+e.getMessage());
        }
    }

    public static void checkAge(int age){
        if (age<18){
            throw new AgeRangeExeption("Uwaga osoba niepełnoletnia!");
        }else {
            System.out.println("Dostęp przyznany ...");

        }
    }
}
