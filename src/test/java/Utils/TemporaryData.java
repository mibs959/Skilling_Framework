package Utils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by martin959 on 12/02/2017.
 */
public class TemporaryData {

    public static HashMap<String, Object> temporaryDataSaver = new HashMap<String, Object>();

    public static void saveData(String key, Object elementToSave){
        temporaryDataSaver.put(key, elementToSave);
    }

    public static Object getData(String key){
        return temporaryDataSaver.get(key);
    }

}
