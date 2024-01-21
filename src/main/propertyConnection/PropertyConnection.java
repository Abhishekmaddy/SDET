package propertyConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;


public class PropertyConnection {

    public static void main(String[] args) throws Exception {

        PropertyConnection pc = new PropertyConnection();
//        String emial_value = pc.ReadProperty("email");
//        String name_value = pc.ReadProperty("name");


        pc.WriteProperty("position", "Sdet");


    }


    public String ReadProperty(String variable) throws Exception {

        Properties p = null;
        FileInputStream fis = null;
        String keyValue = null;

        try {
            p = new Properties();
            //File f = new File("C:\\Users\\abhir\\IdeaProjects\\SDET\\src\\main\\propertyConnection\\main.properties");
            File f = new File(System.getProperty("user.dir") + "\\src\\main\\propertyConnection\\main.properties");

            if (f.exists()) {
                fis = new FileInputStream(f);
                p.load(fis);

                keyValue = p.getProperty(variable);
                System.out.println(keyValue);
            } else {
                System.out.println("File Not Fount");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return keyValue;
    }

    public void WriteProperty(String key, String value) {

        FileInputStream fis = null;
        FileOutputStream fos = null;


        try {
            File f = new File(System.getProperty("user.dir") + "\\src\\main\\propertyConnection\\main.properties");

            if (f.exists()) {
                fis = new FileInputStream(f);
                Properties p = new Properties();
                p.load(fis);

                p.setProperty(key, value);
                fos = new FileOutputStream(f);
                fos.write(p.size());
                p.store(fos, "key value store");


            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                fis.close();
            } catch (Exception e) {

            }
        }

    }

}
