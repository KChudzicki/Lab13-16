package enums;

public enum TShirtSize {

        S(46,21,32),
    M(48,14,12),
    L(50,32,32),
    XL(52,12,12);
        private int chestWidth;
        private int shirtLenght;
        private int sleeveLenght;

    public int getChestWidth() {
        return chestWidth;
    }

    public int getShirtLenght() {
        return shirtLenght;
    }

    public int getSleeveLenght() {
        return sleeveLenght;
    }

    TShirtSize(int chestWidth, int shirtLenght, int sleeveLenght) {
        this.chestWidth = chestWidth;
        this.shirtLenght = shirtLenght;
        this.sleeveLenght = sleeveLenght;

    }
}

