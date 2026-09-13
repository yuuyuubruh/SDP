package outfitbuilder;

public class Outfit {
    private String top;
    private String bottom;
    private String shoes;
    private String accessory;

    public Outfit(String top, String bottom, String shoes, String accessory) {
        this.top = top;
        this.bottom = bottom;
        this.shoes = shoes;
        this.accessory = accessory;
    }

    @Override
    public String toString() {
        return "Outfit:\n" +
                "Top: " + top + "\n" +
                "Bottom: " + bottom + "\n" +
                "Shoes: " + shoes + "\n" +
                "Accessory: " + accessory;
    }
}
