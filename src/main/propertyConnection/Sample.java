package propertyConnection;

import java.io.*;
import java.util.Properties;

public class Sample {

    public static void main(String[] args) {
        Sample s= new Sample();
        s.WriteProperty("lastName", "Sharma");
    }

    public String ReadProperty(String variable) throws IOException {

        FileInputStream fis = null;
        Properties p = null;
        String keyValue = null;

        try {
            p = new Properties();
            File f = new File(System.getProperty("user.dir") + "\\src\\main\\propertyConnection\\main.properties");
            if (f.exists()) {
                fis = new FileInputStream(f);
                p.load(fis);

                keyValue = p.getProperty(variable);
                System.out.println(keyValue);
            } else {
                System.out.println("File not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return keyValue;

    }

    public void WriteProperty(String key, String value){
        FileInputStream fis = null;
        FileOutputStream fos = null;



        try {
            File f = new File(System.getProperty("user.dir") + "\\src\\main\\propertyConnection\\main.properties");
            if (f.exists()){
                Properties p = new Properties();
                fis  = new FileInputStream(f);
                p.load(fis);

                p.setProperty(key, value);
                fos = new FileOutputStream(f);
                fos.write(p.size());
                p.store(fos, "Added");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }

}
