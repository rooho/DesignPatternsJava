package cc.rooho.structural.bridge;

/**
 * package : cc.rooho.structural.bridge
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.8.16 14:25.
 */

//Boy类，追求MM的男孩
public class Boy {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void pursue(MM mm) {
        //Gift g = new WarmGift(new Flower());
        Gift g = new WildGift(new Ring());
        give(g, mm);
    }
    public void give(Gift g, MM mm) {
    }
}

class Gift {
    protected GiftImpl impl;
}

class WarmGift extends Gift{
    WarmGift(GiftImpl impl) {
        this.impl = impl;
    }
}

class WildGift extends Gift {
    WildGift(Ring ring) {
        this.impl = impl;
    }
}

//GiftIml类，表示具体的礼物类
class GiftImpl { }
class Flower extends GiftImpl { }
class Ring extends GiftImpl { }

//MM类，表示一个美眉
class MM {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}