package level1.exercise1to5;

import java.io.File;
import java.io.IOException;

import level1.exercise1to5.Directory; 
import level1.exercise1to5.State;

public class S1_T5_N1EX1to5_LuisChicott {

	public static void main(String[] args) {

			
			Directory directory = new Directory();
		    String projectDir = System.getProperty("user.dir");
		    String directoryName = "Directorio";
		    
		    String route = projectDir + File.separator + directoryName;
			File file = new File(route); 
		    String fileText = route + File.separator + "Amazonas.txt";
		    
			State amazonas = new State("Amazonas", 2); 
			State amazonasTest = null; 
			

			
			//Ejercicio 1
			directory.sortFiles(route);
			
			System.out.println("\n");
			
			//Ejercicio 2
			directory.listFiles(file, 1);
			
			System.out.println("\n");
			
			//Ejercicio 3 - Guarda en el archivo example.txt
			try {
				directory.fileWriter(file, 1);
			} catch (IOException e) {
				System.err.println("Error al escribir en el archivo: " + e.getMessage());
			}
			
			System.out.print("\n");
			
			//Ejercicio 4
			
			directory.fileReader(fileText);
			
			System.out.print("\n");
			
			//Ejercicio 5
			
			amazonas.serialize("state.ser");
			
			amazonasTest = amazonas.deserialize("state.ser"); 
			
			System.out.println("Estado: " + amazonasTest.getStateName() + " ID de Estado: " + amazonasTest.stateNumber);
			



	}

}
