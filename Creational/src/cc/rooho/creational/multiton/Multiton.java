package cc.rooho.creational.multiton;

import java.util.HashMap;
import java.util.Map;

/**
 * package : cc.rooho.creational.singleton
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.6.3 0:59.
 */
public class Multiton {
    private static Map<String, Object> map = new HashMap<String, Object>();

    public static Object getInstance(String key) {
        Object valueObj = map.get(key);

        if(valueObj != null) {
            return valueObj;
        }

        try {
            valueObj = (Object) Class.forName(key).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        map.put(key, valueObj);
        return valueObj;
    }
}
