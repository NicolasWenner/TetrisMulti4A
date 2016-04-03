package fr.esiea.pwd.tetris.tetromino;
import java.util.*;
public enum Tetromino{
	SQUARE(new int[][] {{0,4},{0,5},{1,4},{1,5}}),
	T(new int[][] {{0,3},{0,4},{0,5},{1,4}}),
	L(new int[][] {{0,4},{1,4},{2,4},{2,5}}),
	LINE(new int[][] {{0,3},{0,4},{0,5},{0,6}}),
	S(new int[][] {{0,6},{0,5},{1,5},{1,4}});
	
	private int[][] position;
	
	Tetromino(int[][] position){
		this.position = position;
	}
	
	private static final List<Tetromino> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Tetromino randomTetro()  {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}