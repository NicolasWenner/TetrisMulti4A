package fr.esiea.pwd.tetris.tetromino;
import java.util.*;
public enum Tetromino {
	
	SQUARE(0,1,0), 
	T,
	L,
	LINV,
	LINE,
	S,
	Z;
	
	private int width = 4;
	private int height = 4;
	private boolean box[][] = new boolean[height][width];
	
	public static void clearArray(boolean[] box){
		for(boolean[] row: box)
			Arrays.fill(row,false);
	}
	
	SQUARE {
		
		

		
	}
	


}
