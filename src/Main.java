package outfitbuilder;

public class Main {
    public static void main(String[] args) {

        OutfitDirector director = new OutfitDirector();

        System.out.println("CASUAL OUTFIT");
        System.out.println(director.createCasualOutfit());

        System.out.println("\nSPORT OUTFIT");
        System.out.println(director.createSportOutfit());

        System.out.println("\nFORMAL OUTFIT");
        System.out.println(director.createFormalOutfit());

        Outfit custom = new OutfitBuilder()
                .setTop("Black Hoodie")
                .setBottom("Grey Cargo Pants")
                .setShoes("Black Sneakers")
                .setAccessory("Silver Necklace")
                .build();

        System.out.println("\nCUSTOM OUTFIT");
        System.out.println(custom);
    }
}