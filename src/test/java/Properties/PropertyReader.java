package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by martin on 24/02/2017.
 */
public class PropertyReader {

    public String propertyReader(String file, String property){

        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream(file);
            prop.load(input);
            return prop.getProperty(property);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public String validUsername(){
        return propertyReader("C:\\Users\\martin\\Downloads\\Skilling_Automation\\src\\test\\java\\Properties\\credentials.properties", "validUsername");
    }

    public String validPassword(){
        return propertyReader("C:\\Users\\martin\\Downloads\\Skilling_Automation\\src\\test\\java\\Properties\\credentials.properties", "validPassword");
    }


}
