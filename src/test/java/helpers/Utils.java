package helpers;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Utils {

    public static String getProperties(String property) throws Exception {
        InputStream file =new FileInputStream("src/test/resources/Properties/properties");
        Properties properties = new Properties();
        properties.load(file);
        return (properties.getProperty(property));
    }
}
