package enums;

public class Tshirt {
    private TShirtSize size;
    private  String manufacture;

    public Tshirt(TShirtSize size, String manufacture) {
        this.size = size;
        this.manufacture = manufacture;
    }

    public TShirtSize getSize() {
        return size;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size=" + size +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
