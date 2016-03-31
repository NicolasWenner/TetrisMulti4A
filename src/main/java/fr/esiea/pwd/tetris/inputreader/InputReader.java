package fr.esiea.pwd.tetris.inputreader;

import java.io.IOException;
import java.util.*;

import fr.esiea.pwd.tetris.movement.Movement;

public class InputReader {
	
	public static ArrayList<Movement> getMovement() {
        try {
            ArrayList<Movement> result = new ArrayList<Movement>();
            int read = RawConsoleInput.read(false);
            while (read != -2){
            	Movement movement = Movement.Input(read);
                result.add(movement);
                read = RawConsoleInput.read(false);
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException("Impossible to read from the stdin", e);
        }
    }
	
}
