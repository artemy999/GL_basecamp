package com.company;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

    public class ConfProperties {
        protected static FileInputStream fileInputStream;
        protected static Properties PROPERTIES;
        static {
            try {
                //setup file location path
                fileInputStream = new FileInputStream("src/conf.properties");
                PROPERTIES = new Properties();
                PROPERTIES.load(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
                //FileNotFound exception
            } finally {
                if (fileInputStream != null)
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace(); } } }
        /**
         * returning string containing value from setup file
         */
        public static String getProperty(String key) {
            return PROPERTIES.getProperty(key); }
}
