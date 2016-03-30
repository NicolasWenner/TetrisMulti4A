package fr.esiea.pwd.tetris.inputreader;

import java.io.IOException;
import java.util.*;

public class InputReader {
	
	public Collection<Character> getInput() {
        try {
            Collection<Character> result = new ArrayList<Character>();
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
