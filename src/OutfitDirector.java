package outfitbuilder;

public class OutfitDirector {

    public Outfit createCasualOutfit() {
        return new OutfitBuilder()
                .setTop("White T-Shirt")
                .setBottom("Blue Jeans")
                .setShoes("White Sneakers")
                .setAccessory("Black Bag")
                .build();
    }

    public Outfit createSportOutfit() {
        return new OutfitBuilder()
                .setTop("Sport T-Shirt")
                .setBottom("Black Joggers")
                .setShoes("Running Shoes")
                .setAccessory("Cap")
                .build();
    }

    public Outfit createFormalOutfit() {
        return new OutfitBuilder()
                .setTop("White Shirt")
                .setBottom("Black Trousers")
                .setShoes("Black Shoes")
                .setAccessory("Watch")
                .build();
    }
}