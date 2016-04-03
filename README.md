Wenner Nicolas
Pelete Bliss
Debuiche Gauthier

Explications / Features

Par manque de temps durant ce mois, notre jeu ne marche pas. 
Nous avons préféré mettre plus de temps sur la conception de l’architecture plutôt que de rendre un tetris fonctionnel qui ne répondrait pas à vos exigences vis-à-vis du respect des principes de programmation objet.
Nous avons donc développé la récupération des entrées du joueur, la traduction en termes de mouvement via une énumération (mouvement.java).
Nous nous sommes ensuite penchés sur le modèle de notre architecture : le boardGame qui est un tableau bidimensionnel de booleans contenant l’état du plateau de jeu, qui reçoit les informations de l’InputReader et les appliques sur ses composants et sa structure. 
Parmi ses composants, nous avons créé un objet MovingPiece qui représente la pièce manipulée par le joueur. Cet objet a pour attribut un tetromino qui est un tableau bidimensionnel contenant les coordonnées des cases qu’il occupe sur le board.
Si nous avions plus de temps, les prochaines étapes seraient de coder les fonctions de MovingPiece liées à l’interface Movable (son comportement selon les mouvements reçus).
Ensuite les conditions d’arrêt de la MovingPiece avec la génération d’un nouveau tetromino et l’actualisation de l’état du board.
Nous avons aussi toute la partie Printer a codé qui s’occupe d’afficher via une interface printable le board et la MovingPiece.

Exercice Architecture :

Nous avons utilisé une architecture MVC :
-	Le Modèle correspond au BoardGame
-	La Vue correspond au Printer
-	Le Contrôleur correspond à l’InputReader
Le tétris est en effet un jeu qui fait interagir un joueur avec des pièces qu’il doit placer sur un plateau.
L’idée est pour leur joueur de regarder l’état du plateau et de réagir en fonction de la pièce qu’il a à placer. Ces deux derniers éléments sont contenus dans le BoardGame : le Modèle et retransmis à l’écran via le Printer : la Vue qui va donc faire la passerelle entre l’état du Modèle et le joueur.
Le joueur va alors, pour placer sa pièce, donner des instructions qui seront reçues par l’InputReader : le Contrôleur. Ce dernier va traduire ces entrées en mouvements grâce à l’énumération Movement et les transmettre au BoardGame qui modifiera son état en fonctions des règles du jeu contenues dans son comportement (ses méthodes).

Exercice Design Pattern / Solid :

Lors de ce projet, nous nous sommes appuyés sur nos connaissances en java pour respecter au mieux les principes de la programmation orientée objet.
Comme on peut le voir sur l’architecture, notre jeu s’appuie sur trois éléments principaux :
-	Le Boardgame qui représente le plateau de jeu : le support du tétris.
-	L’inputReader qui va récupérer les entrées du joueur.
-	Le Printer qui s’occupe de l’affichage du BoardGame.
Ces trois éléments sont des singletons ce qui nous assure qu’un seul et unique exemplaire de chacun pourra être instancié. Ce principe assure une certaine simplicité à notre architecture et évite tout conflit en termes d’appels.
Nous avons aussi appliqué plusieurs principes SOLID, notamment le « Single responsibility principle » qui stipule qu’une classe ne doit posséder qu’une et une seule responsabilité.
Par exemple, notre inputReader a la seule responsabilité de récupérer les entrées de l’utilisateur. Ceci nous apporte aussi de la simplicité en évitant les redondances et assure que chaque classe aura une fonctionnalité précise.
Nous nous sommes aussi appuyés sur le « Interface segregation principle », ceci s’illustre dans notre projet avec l’objet MovingPiece qui est le seul à implémenter l’interface « Movable ». C’est en effet l’unique élément de notre jeu qui doit avoir la fonctionnalité de bouger. Cette interface nous permet de bien séparer les éléments pouvant bouger de ceux qui sont statiques.
