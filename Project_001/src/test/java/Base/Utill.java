package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utill {

    public static void dataFile(String gmail) throws IOException {
        Properties data= new Properties();
        FileInputStream file=new FileInputStream("src/test/java/data.properties");
        data.load(file);
//		driver.findElement(By.id("identifierId")).sendKeys(data.getProperty("gmail"));

    }


}
