package appfix.tools;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;


public class FileManager {

	public static List<String> listFilesWithExtention(String pathFrom, String ext) {
		File folder = new File(pathFrom);
		File[] listOfFiles = folder.listFiles();
		List<String> list = new ArrayList<>();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isFile()) {
				String name = listOfFiles[i].getName();
				if(name.toLowerCase().endsWith(ext)) {
					list.add(name);
				}
		
			}
		}
		return list;
	}
	
	public static File[] listFilesWithExtension(File pathFrom, String ext) {
		return pathFrom.listFiles(
	            (dir, name) -> {
	                return name.toLowerCase().endsWith(ext);
	            }
	    );
	}

	public static File[] listFilesExtension(File pathFrom, String ext) {
		return pathFrom.listFiles(
	            (dir, name) -> {
	                return name.toLowerCase().endsWith(ext);
	            }
	    );
	}
	
	public static void search(String path) {
		FileVisitor<Path> simpleFileVisitor = new SimpleFileVisitor<Path>() {
		      @Override
		      public FileVisitResult preVisitDirectory(Path dir,BasicFileAttributes attrs)
		          throws IOException {
		        System.out.println("-------------------------------------");
		        System.out.println("DIRECTORY NAME:"+ dir.getFileName() 
		                           + "LOCATION:"+ dir.toFile().getPath());
		        System.out.println("-------------------------------------");
		        return FileVisitResult.CONTINUE;
		      }
		       
		      @Override
		      public FileVisitResult visitFile(Path visitedFile,BasicFileAttributes fileAttributes)
		          throws IOException {
		        System.out.println("FILE NAME: "+ visitedFile.getFileName());
		        return FileVisitResult.CONTINUE;
		      }
		    };
		    
		    FileSystem fileSystem = FileSystems.getDefault();
		    Path rootPath = fileSystem.getPath(path);
		    
		    try {
		      
		    	Files.walkFileTree(rootPath, simpleFileVisitor);
		    
		    } catch (IOException ioe) {
		      ioe.printStackTrace();
		    }
	}
	
	public static void displayDirectoryContents(File dir) {
		
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					displayDirectoryContents(file);
				} else {
					System.out.println("     file:" + file.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void displayDirectoryContents(String dir) {
		
		File currentDir = new File(dir);
		
		try {
			File[] files = currentDir.listFiles();
			for (File file : files) {
				
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					//System.out.println("     json:" + metaInf(file.getCanonicalPath()));
					displayDirectoryContents(file.getCanonicalPath());
				} else {
					System.out.println("     json:" + metaInf(file.getCanonicalPath()));	
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void displayDirectoryContents(Path dir) {
		
		try {
			File[] files = dir.toFile().listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					displayDirectoryContents(file.toPath());
				} else {
					System.out.println("     file:" + file.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String metaInfJSON(Path file) {

		BasicFileAttributes attr = null;
		String json = null;
		try {
			attr = Files.readAttributes(file, BasicFileAttributes.class);
			
			json = "creationTime:" + attr.creationTime()
			+",lastAccessTime:"+ attr.lastAccessTime()
			+",lastModifiedTime: " + attr.lastModifiedTime()
			+",isDirectory: "+ attr.isDirectory()
			+",isOther: " + attr.isOther()
			+",isRegularFile:" + attr.isRegularFile()
			+",isSymbolicLink: " + attr.isSymbolicLink()
			+",size:" + attr.size();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return json;
	}
	
	public static long[] documentTimeInfo(String textPath) {

		BasicFileAttributes attr = null;
		long[] cal= new long[3];
		Path path = Paths.get(textPath);
		
		try {
			attr = Files.readAttributes(path, BasicFileAttributes.class);
			
			cal[0] = attr.creationTime().toMillis();
			cal[1] = attr.lastAccessTime().toMillis();
			cal[2] = attr.lastModifiedTime().toMillis();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return cal;
	}
	
	public static String metaInf(String  file) {

		BasicFileAttributes attr = null;
		String json = null;
		Path path = null;
		
		try {
			
			path = Paths.get(file);
			attr = Files.readAttributes(path, BasicFileAttributes.class);
			
			json = "creationTime:" + attr.creationTime()
			+",lastAccessTime:"+ attr.lastAccessTime()
			+",lastModifiedTime: " + attr.lastModifiedTime()
			+",isDirectory: "+ attr.isDirectory()
			+",isOther: " + attr.isOther()
			+",isRegularFile:" + attr.isRegularFile()
			+",isSymbolicLink: " + attr.isSymbolicLink()
			+",size:" + attr.size();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return json;
	}
	
	public static List<String> read(String nameFile) {

		List<String> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				list.add(sCurrentLine);
			}
		} catch (IOException e) {
			 e.printStackTrace();
		}
		return list;
	}

	/**
	 * Write one file
	 * 
	 * @param nameFile
	 *            (absolute path - directory,folder,name file and extension)
	 * @param content
	 *            (algorithms.text that you want to write in file)
	 * @param append
	 *            (adding last line or not append=true/false)
	 */
	public static void write(String nameFile, String content, boolean append) {

		if (append) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile, append))) {
				bw.write(content);
				bw.newLine();
			} catch (IOException e) {
				 e.printStackTrace();
			}
		} else {
			write(nameFile, content);
		}
	}

	private static void write(String nameFile, String content) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile))) {
			bw.write(content);
			bw.newLine();
		} catch (IOException e) {
			String msg = FileManager.class.getName();
			msg += "message:";
			msg += e.getMessage();
			msg += ",";
			msg += "localized:";
			msg += e.getLocalizedMessage();
			System.out.println(msg);
		}
	}
	
	public static void write(String nameFile, List<String> lines, boolean append) {
		
		if (append) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile, append))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			String msg = FileManager.class.getName();
			msg += "message:";
			msg += e.getMessage();
			msg += ",";
			msg += "localized:";
			msg += e.getLocalizedMessage();
			System.out.println(msg);
		}
		
		} else {
			write(nameFile, lines);
		}
	}
	
	private static void write(String nameFile, List<String> lines) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			String msg = FileManager.class.getName();
			msg += "message:";
			msg += e.getMessage();
			msg += ",";
			msg += "localized:";
			msg += e.getLocalizedMessage();
			System.out.println(msg);
		}
	}

	public static boolean copy(String fileFrom, String fileTO) {

		boolean status = false;
		Path FROM = Paths.get(fileFrom);
		Path TO = Paths.get(fileTO);
		// overwrite existing file, if exists
		CopyOption[] options = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING,
				StandardCopyOption.COPY_ATTRIBUTES };
		try {
			Files.copy(FROM, TO, options);
		} catch (IOException e) {
			String msg = FileManager.class.getName();
			msg += "message:";
			msg += e.getMessage();
			msg += ",";
			msg += "localized:";
			msg += e.getLocalizedMessage();
			System.out.println(msg);
		} finally {
			status = true;
		}
		return status;
	}

	public static Properties loadProperties(String fileFrom) {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream(fileFrom);
			// load a properties file
			prop.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return prop;
	}

	public static boolean writeProperty(String fileTo, Map<String, String> map) {
		Properties prop = new Properties();
		OutputStream output = null;
		boolean status = false;

		try {

			output = new FileOutputStream(fileTo);
			// set the properties value
			Set<String> keys = map.keySet();
			for (String key : keys) {
				prop.setProperty(key, map.get(key));
			}
			// save properties to project root folder
			prop.store(output, null);
			status = true;
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return status;
	}

	public static Map<String, String> readProperty(String fileFrom, List<String> listKey) {
		Properties prop = new Properties();
		InputStream input = null;
		Map<String, String> map = null;

		try {
			input = new FileInputStream(fileFrom);
			map = new HashMap<>();
			// load a properties file
			prop.load(input);
			for (String key : listKey) {
				String value = prop.getProperty(key);
				map.put(key, value);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return map;
	}

	public static Map<String, String> readProperty(String fileFrom) {
		Properties prop = new Properties();
		InputStream input = null;
		Map<String, String> map = null;

		try {

			input = new FileInputStream(fileFrom);
			map = new HashMap<>();

			// load a properties file
			prop.load(input);

			Enumeration<?> e = prop.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = prop.getProperty(key);
				map.put(key, value);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return map;

	}

	public static String pathChooser() {

		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		String fileName = System.getProperty("user.dir") + File.separator;

		jfc.setDialogTitle("Choose one file: ");
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		jfc.setAcceptAllFileFilterUsed(false);
		int returnValue = jfc.showOpenDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			fileName = selectedFile.getAbsolutePath();
		}
		return fileName;
	}

	public static String pathChooser(String directory) {

		File f = new File(directory);

		JFileChooser jfc = new JFileChooser(f);

		String fileName = System.getProperty("user.dir") + File.separator;

		jfc.setDialogTitle("Choose one file: ");
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		jfc.setAcceptAllFileFilterUsed(false);
		int returnValue = jfc.showOpenDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			fileName = selectedFile.getAbsolutePath();
		}
		return fileName;
	}

	public static boolean createDirectory(Path path) {
		boolean status = false;
		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
				status = true;
			} catch (IOException e) {
				// fail to create directory
				e.printStackTrace();
			}
		}
		return status;
	}
	
	public static boolean createDirectory(String path) {
		Path newPath = Paths.get(path);
		boolean status = false;
		if (!Files.exists(newPath)) {
			try {
				Files.createDirectories(newPath);
				status = true;
			} catch (IOException e) {
				// fail to create directory
				e.printStackTrace();
			}
		}
		return status;
	}

	public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
	    Files.copy(source.toPath(), dest.toPath());
	}
	
	/*
	 * Stream Copy is the best way to copy File in Java or more fast
	 */
	public static void copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
	

}
