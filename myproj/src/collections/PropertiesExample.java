package collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample
{
    static File file;
    static void saveProperties(Properties p) throws IOException
    {
        FileOutputStream fr = new FileOutputStream(file);
        p.store(fr, "Properties");
        fr.close();
        System.out.println("After saving properties: " + p);
    }

    static void loadProperties(Properties p)throws IOException
    {
        FileInputStream fi=new FileInputStream(file);
        p.load(fi);
        fi.close();
        System.out.println("After Loading properties: " + p);
    }

    public static void main(String... args)throws IOException
    {
        file = new File("my.properties");
        Properties table = new Properties();
        table.setProperty("Shivam","Bane");
        table.setProperty("CS","Maverick");
        System.out.println("Properties has been set in HashTable: " + table);
        // saving the properties in file
        saveProperties(table);
        // changing the property
        table.setProperty("Shivam", "Swagger");
        System.out.println("After the change in HashTable: " + table);
        // saving the properties in file
        saveProperties(table);
        // loading the saved properties
        loadProperties(table);
    }
}