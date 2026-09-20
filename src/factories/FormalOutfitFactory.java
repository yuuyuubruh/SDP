package factories;

import products.*;

public class FormalOutfitFactory implements OutfitFactory {
    @Override
    public Top createTop() {
        return new FormalTop();
    }

    @Override
    public Bottom createBottom() {
        return new FormalBottom();
    }
}