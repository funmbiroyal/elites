package practices;

public class Iphone {
    private static String color;
    private final static double price = 699.9;

    public static String getColor() {
        return color;
    }

    public void setColor(String color) {
        Iphone.color = color;
    }

    public double getPrice() {
        return price;

    }

}
