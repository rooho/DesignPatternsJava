package cc.rooho.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * package : cc.rooho.structural.flyweight
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.16 16:54.
 */
public class Menu {
    private Map<String, CoffeeFlavour> flavours = new ConcurrentHashMap<String, CoffeeFlavour>();

    CoffeeFlavour lookup(String flavorName) {
        if (!flavours.containsKey(flavorName))
            flavours.put(flavorName, new CoffeeFlavour(flavorName));
        return flavours.get(flavorName);
    }

    int totalCoffeeFlavoursMade() {
        return flavours.size();
    }
}
