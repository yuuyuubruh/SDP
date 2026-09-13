package outfitbuilder;

public class OutfitBuilder {
    private String top;
    private String bottom;
    private String shoes;
    private String accessory;

    public OutfitBuilder setTop(String top) {
        this.top = top;
        return this;
    }

    public OutfitBuilder setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    public OutfitBuilder setShoes(String shoes) {
        this.shoes = shoes;
        return this;
    }

    public OutfitBuilder setAccessory(String accessory) {
        this.accessory = accessory;
        return this;
    }

    public Outfit build() {
        if (top == null || bottom == null || shoes == null) {
            throw new IllegalStateException(
                    "Outfit must have top, bottom and shoes"
            );
        }

        return new Outfit(top, bottom, shoes, accessory);
    }
}