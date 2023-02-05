package enums;

public class TshirtTester {
    public static void main(String[] args) {
        Tshirt tshirt=new Tshirt(TShirtSize.L,"Polex");
        System.out.println(tshirt);
        System.out.println(tshirt.getSize().getChestWidth());
    }
}
