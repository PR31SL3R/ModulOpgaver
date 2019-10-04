import java.util.Random;
import java.util.Scanner;

public class MindGame {
//Instance Field
	int number = -1;
	int userNumber;
	int trys;
	char input;
//Import objects
	Random r = new Random();
	Scanner s = new Scanner(System.in);

//Guesser method
	public void guesser() {
		trys = 0;
		number = r.nextInt(100) + 1;
		System.out.println("Welcome to the game\nquess a number between 1-100");
		while (true) {
			userNumber = s.nextInt();
			if (number < userNumber) {
				System.out.println("the number is lower than " + userNumber);
				trys++;
			}
			if (number > userNumber) {
				System.out.println("the number is higher than " + userNumber);
				trys++;
			}
			if (userNumber == number) {
				trys++;
				System.out.println("Congrats, you guessed the number ");
				System.out.println("You guessed it in " + trys + " trys");
				System.out.println("Do you want to play again");
				do {
					System.out.println("please enter Y/N ");
					char input = s.next().charAt(0);
					if (input == 'Y' || (input == 'y')) {
						System.out.println("Here we go again");
						guesser();
					} else if (input == 'N' || (input == 'n')) {
						System.out.println("goodbye");
						System.exit(8);
					}
				} while ((input != 'y') || (input != 'Y') || (input != 'N') || (input != 'n'));

			}

		}
	}

	

}
