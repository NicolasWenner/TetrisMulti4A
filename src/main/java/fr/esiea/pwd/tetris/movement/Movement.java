package fr.esiea.pwd.tetris.movement;

public enum Movement {
		
		DOWN('s'){
			@Override	
			public void move(Movable movable){
				movable.goDown();
			}
			
		},
		
		RIGHT('d'){
			@Override
			public void move(Movable movable){
				movable.goRight();
				
			}
		},
		
		LEFT('q'){
			@Override
			public void move( Movable movable){
				movable.goLeft();
			}
		},
		
		TURN_RIGHT('e'){
			@Override
			public void move( Movable movable){
				movable.turnRight();
			}
		},
		
		TURN_LEFT('a'){
			@Override
			public void move( Movable movable){
				movable.turnLeft();
			}
		},
		
		NONE('*'){
			@Override
			public void move( Movable ignore){
				//ignore
			}
		};
	
	
	private final char bind;
	
	Movement(char l){
		this.bind = l;
			
	}
		public static Movement Input(int readValue){
			if(readValue == 's')
				return Movement.DOWN ;
			else if(readValue == 'd')
				return Movement.RIGHT ;
			else if(readValue == 'q')
				return Movement.LEFT ;
			else if(readValue == 'a')
				return Movement.TURN_LEFT;
			else if(readValue == 'e')
				return Movement.TURN_RIGHT ;
			else
				return Movement.NONE;
		}
		
		public abstract void move(Movable movable);
	}
