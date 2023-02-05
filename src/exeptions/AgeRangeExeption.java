package exeptions;

public class AgeRangeExeption extends ArithmeticException {
    public AgeRangeExeption() {
    }

    public AgeRangeExeption(String s) {
        super(s);
    }
}
