package factories;

import products.*;

public class CasualOutfitFactory implements OutfitFactory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Bottom createBottom() {
        return new CasualBottom();
    }
}