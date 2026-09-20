package factories;

import products.Bottom;
import products.Top;

public interface OutfitFactory {
    Top createTop();
    Bottom createBottom();
}