public class newAniamlZoo extends Animal {

	static int boardSizeX = 10;
	static int boardSizeY = 10;
   
   	Snake[] snakes;
	   Hawk[] hawks;

	public void playGame() {
		setGame();
		while (true) {
			move(1);
			moveAnimals();
			gameState();

		}
	}

	public void gameState() {

		for (int j = 0; j < snakes.length; j++) {
			if (hawks[j].isAnimalNear(x, y)) {
				System.out.println("crap... a hawk saw you");
			}
			if (snakes[j].isAnimalNear(x, y)) {
				System.out.println("a snake saw you");
			}
			if (hawks[j].isAnimalHere(x, y)) {
				System.out.println("oh no! a hawk bit you");
			}
			if (snakes[j].isAnimalHere(x, y)) {
				System.out.println("oh no! a snake bit you");
			}
		}
	}

	public void moveAnimals() {
		for (int i = 0; i < 10; i++) {

			snakes[i].move();
			hawks[i].move();
		}
	}

	public void setGame() {

//set 10 hawks and snakes
		snakes = new Snake[10];
		hawks = new Hawk[10];
		for (int i = 0; i < hawks.length; i++) {
			snakes[i] = new Snake();
			hawks[i] = new Hawk();
		}

	}

	public static void main(String[] args) {
		newRabbit player = new newRabbit();
      newAniamlZoo newGame = new newAniamlZoo();
      newGame.playGame();
      
      
      

	}

}