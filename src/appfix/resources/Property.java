package appfix.resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Property {

	public static void write(String path, Properties prop) {

		try (OutputStream output = new FileOutputStream(path, true)) {

			// save properties to project root folder
			prop.store(output, null);

			System.out.println(prop);

		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	public static String read(String path, String key) {
		
		String value = "";
		

		try (InputStream input = new FileInputStream(path)) {

			Properties prop = new Properties();
			// load a properties file
			prop.load(input);
			// get the property value and print it out
			return prop.getProperty(key);

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return value;
	}

}
