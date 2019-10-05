import java.util.Scanner;

public class MineHunter {
	// Instance Field
	int x = 1;
	int y = 1;
	int arraySize = 10;
	Mine[] mines = new Mine[arraySize];
	int boardSizeX = 10;
	int boardSizeY = 10;
	// Scanner object s
	Scanner s = new Scanner(System.in);

	// main gameplay method
	public void playGame() {
		x = 1;
		y = 1;
		minePlacer();
		System.out.println("you are here " + this.x + " " + this.y);
		eventChecker();
		while (true) {

			int moveDirection = s.nextInt();

			if ((moveDirection == 1 || moveDirection == 4 || moveDirection == 7) && x > 1) {
				x--;

			}
			if ((moveDirection == 3 || moveDirection == 6 || moveDirection == 9) && x < boardSizeX) {
				x++;

			}
			if ((moveDirection == 7 || moveDirection == 8 || moveDirection == 9) && y < boardSizeY) {
				y++;

			}
			if ((moveDirection == 1 || moveDirection == 2 || moveDirection == 3) && y > 1) {
				y--;

			}
			System.out.println("you are here " + this.x + " " + this.y);
			eventChecker();
		}
	}

	// Method for placing mines
	public void minePlacer() {

		for (int i = 0; i < mines.length; i++) {

			mines[i] = new Mine();
		}
	}

	// Method for checking mines,won,loss
	public void eventChecker() {
		for (int j = 0; j < mines.length; j++) {
			// print mine locations
			// System.out.println(mines[j].mineX + " " + mines[j].mineY);

			if (mines[j].isMineHere(x, y)) {
				System.out.println("you hit a mine");
				arraySize = 10;
				playAgain();

			}
			if (mines[j].isMineNear(x, y)) {
				System.out.println("mine is near");
			}

		}
		if ((x == 10) && (y == 10)) {
			System.out.println("you won the game");
			System.out.println("lets make it harder now");
			arraySize += 5;
			playAgain();
		}
	}

	// play again method
	public void playAgain() {
		char input;
		System.out.println("Do you want to play again?");
		do {
			System.out.println("please enter Y/N ");
			input = s.next().charAt(0);
			if (input == 'Y' || (input == 'y')) {
				System.out.println("Here we go again");
				playGame();
			} else if (input == 'N' || (input == 'n')) {
				System.out.println("goodbye");
				System.exit(0);
			}
		} while ((input != 'y') || (input != 'Y') || (input != 'N') || (input != 'n'));

	}

	public static void main(String[] args) {

		MineHunter test = new MineHunter();
		test.playGame();

	}

}