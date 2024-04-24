package level1.exercise1to5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class State implements Serializable {
	
	String stateName; 
	int stateNumber; 
	
	public State(String stateName, int stateNumber) {
		this.stateName = stateName; 
		stateNumber = stateNumber; 
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getStateNumber() {
		return stateNumber;
	}

	public void setStateNumber(int stateNumber) {
		this.stateNumber = stateNumber;
	}

	
	public void serialize(String file) {
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this); 
            out.close();
            fileOut.close();
            System.out.println("El estado " + this.stateName + " fue serializado en " + file);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
	
	public static State deserialize(String file) {
        State state = null;
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            state = (State) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return state;
    }

}
