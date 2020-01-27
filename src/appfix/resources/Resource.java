package appfix.resources;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Resource {

	public static void main(String[] args) {
		Path path = FileSystems.getDefault().getPath("");

		
		String p = path.toAbsolutePath()+File.separator+"WebContent"+File.separator+"resources"+File.separator;
		
		System.out.println(p + "acceptor.properties");
		
		System.out.println(Property.read(p+"acceptor.properties", "BeginString"));

	}

}
