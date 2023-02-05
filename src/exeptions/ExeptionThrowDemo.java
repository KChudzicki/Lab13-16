package exeptions;

public class ExeptionThrowDemo {
    public static void main(String[] args) {
        ExeptionThrowDemo etd = new ExeptionThrowDemo();
        int hours = -34;
        int numberOfSeconds = 0;
        try {
            numberOfSeconds =etd.getNumberOfSeconds(hours);
        } catch (IllegalArgumentException e) {
            System.out.println("Naprawiamy...");
            numberOfSeconds = etd.getNumberOfSeconds(hours* -1);
        }
        System.out.println(numberOfSeconds);
    }

    public int getNumberOfSeconds(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Liczba godzin musi być dodatnia: " + hours);
        }
        return hours * 60 * 60;
    }
}
