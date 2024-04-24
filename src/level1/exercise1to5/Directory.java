package level1.exercise1to5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Directory {
	
	 public static void sortFiles(String route) { 
	    	
	        File directory = new File(route); 
	        File [] fileList = directory.listFiles();

	        if (fileList != null) { 
	            Arrays.sort(fileList); 

	            for (File files : fileList) { 
	                    System.out.println(files.getName()); 
	            }
	        } else {
	            System.out.println("El directorio está vacío o no existe."); 
	        }
	    }
	    
	    
	    public static void listFiles(File file, int num) {
	    	
	        if (file.isDirectory()) {
	            File[] fileList = file.listFiles();
	            
	            if (fileList != null) {
	                Arrays.sort(fileList);
	                
	                for (File f : fileList) {
	                    String fileType = f.isDirectory() ? "D" : "F";
	                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	                    String lastModified = sdf.format(f.lastModified());
	                    
	                    System.out.printf("%" + (num * 2) + "s%s: %s - Última modificación: %s%n", "", fileType, f.getName(), lastModified);
	                    
	                    
	                    if (f.isDirectory()) {
	                        listFiles(f, num + 1);
	                    }
	                }
	            } else {
	                System.out.println("No se puede acceder al directorio.");
	            }
	        } else {
	            System.out.println("El archivo proporcionado no es un directorio.");
	        }
	    }
	    
	    
	    public static void fileWriter(File file, int num) throws IOException {
	        FileWriter writer = new FileWriter("example.txt");
	        try {
	            if (file.isDirectory()) {
	                File[] fileList = file.listFiles();

	                if (fileList != null) {
	                    Arrays.sort(fileList);

	                    for (File f : fileList) {
	                        String fileType = f.isDirectory() ? "D" : "F";
	                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	                        String lastModified = sdf.format(f.lastModified());

	                        writer.write(String.format("%" + (num * 2) + "s%s: %s - Última modificación: %s%n", "", fileType, f.getName(), lastModified));

	                        if (f.isDirectory()) {
	                            try {
	                                fileWriter(f, num + 1);
	                            } catch (IOException e) {
	                                e.getMessage();
	                            }
	                        }
	                    }
	                } else {
	                    writer.write("No se puede acceder al directorio.\n");
	                }
	            } else {
	                writer.write("El archivo proporcionado no es un directorio.\n");
	            }
	        } finally {
	            writer.close(); 
	        }
	    }
	    
	    
	    public static void fileReader(String file) {
	    	
	    	try {
	    	FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine(); 
			br.close();
			fr.close();
			
			 System.out.println(line);
	    	}catch (IOException e) {
	         System.out.println("Error al leer el archivo: " + e.getMessage());
	       }
	    }

}
