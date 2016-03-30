package fr.esiea.pwd.tetris.movement;

public enum Movement {
		
		DOWN('s'){
			@Override	
			public void move(MovementValidator movementValidator, Movable movable){
				movable.goDown(movementValidator);
			}
			
		},
		
		RIGHT('d'){
			@Override
			public void move(MovementValidator movementValidator, Movable movable){
				movable.goRight(movementValidator);
				
			}
		},
		
		LEFT('q'){
			@Override
			public void move(MovementValidator movementValidator, Movable movable){
				movable.goLeft(movementValidator);
			}
		},
		
		TURN_RIGHT('e'){
			@Override
			public void move(MovementValidator movementValidator, Movable movable){
				movable.turnRight(movementValidator;)
			}
		},
		
		TURN_LEFT('a'){
			@Override
			public void move(MovementValidator movementValidator, Movable movable){
				movable.turnLeft(movementValidator;)
			}
		},
		
		NONE('*'){
			@Override
			public void move(MovementValidator movementValidator, Movable ignore){
			}
		};
		
		private final char bind;
		
		Movement(char l){
			this.bind = l;
			
		}
		
		public static Movement Input(int readValue){
			if(readValue == 's'){
				return Movement.DOWN ;
			}
			else if(readValue == 'd'){
				return Movement.RIGHT ;
			}
			else if(readValue == 'q'){
				return Movement.LEFT ;
			}
			else if(readValue == 'a'){
				return Movement.TURN_LEFT;
			}
			else if(readValue == 'e'){
				return Movement.TURN_RIGHT ;
			}
			else {
				return Movement.NONE;
			}
		}
	}
