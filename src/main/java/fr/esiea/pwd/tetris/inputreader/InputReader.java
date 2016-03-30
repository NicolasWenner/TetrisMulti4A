package fr.esiea.pwd.tetris.inputreader;

import java.io.IOException;
import java.util.*;

import fr.esiea.pwd.tetris.movement.Movement;

public class InputReader {
	
	public InputReader () {
		
	}

	
	public List<Movement> getInput() {
        try {
            List<Movement> result = new ArrayList<>();
            int read = RawConsoleInput.read(false);
            while (read != -2){
                result.add((char) read);
                read = RawConsoleInput.read(false);
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException("Impossible to read from the stdin", e);
        }
    }
	
}
