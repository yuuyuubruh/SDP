import factories.CasualOutfitFactory;
import factories.FormalOutfitFactory;
import factories.OutfitFactory;
import products.Bottom;
import products.Top;

public class Main {
    public static void main(String[] args) {
        OutfitFactory casualFactory = new CasualOutfitFactory();
        Top casualTop = casualFactory.createTop();
        Bottom casualBottom = casualFactory.createBottom();

        System.out.println("--- CASUAL OUTFIT ---");
        casualTop.wearTop();
        casualBottom.wearBottom();

        OutfitFactory formalFactory = new FormalOutfitFactory();
        Top formalTop = formalFactory.createTop();
        Bottom formalBottom = formalFactory.createBottom();

        System.out.println("\n--- FORMAL OUTFIT ---");
        formalTop.wearTop();
        formalBottom.wearBottom();
    }
}