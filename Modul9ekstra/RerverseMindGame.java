import java.util.Scanner;

public class RerverseMindGame {

//instance field
	int userNumber;
	int computerGuess;
	int trys;
	int lowerBound;
	int upperBound;

	// Scanner object
	Scanner s = new Scanner(System.in);

	// guessReturner method
	public int guessReturner(int computerGuess) {
		 this.computerGuess = computerGuess;

		if (userNumber > this.computerGuess)
			return 1;

		if (userNumber < this.computerGuess)
			return 2;

		return 3;

	}
   
   public void setValues(){
	   trys=0;
   System.out.println("Hi - the computer will guess any number you think of");
		System.out.println("Please enter range");
		System.out.println("Lowerbound?");
		lowerBound = s.nextInt();
		System.out.println("Upperbound?");
		upperBound = s.nextInt();
		System.out.println("Chose a number");
		userNumber = s.nextInt();
		while (userNumber < lowerBound || userNumber > upperBound) {
			System.out.println("Please select number within the chosen range" + lowerBound + " - " + upperBound);
			userNumber = s.nextInt();
			}
		computerGuess = (int) Math.ceil((double) (lowerBound +(upperBound - lowerBound) / 2));
		System.out.println(computerGuess);
		System.out.println("you have chosen the number " + userNumber);
		System.out.println("the computer will now guess the number chosen");
		System.out.println("the computer now guesses " + computerGuess + " to start with");
		trys++;
   }
   
   public void playAgain(){
   char input;
   System.out.println("Do you want to play again?");
   do {
					System.out.println("please enter Y/N ");
					input = s.next().charAt(0);
					if (input == 'Y' || (input == 'y')) {
						System.out.println("Here we go again");
						guesser();
					} else if (input == 'N' || (input == 'n')) {
						System.out.println("goodbye");
						System.exit(0);
					}
				} while ((input != 'y') || (input != 'Y') || (input != 'N') || (input != 'n'));

   }

	// guesser method
	public void guesser() {
		setValues();
		if (userNumber == computerGuess) {
			System.out.println(
					"Wow - the computer got it first try...\n Hint: Middle of range is guessed first");
			playAgain();
		}

		while (userNumber != computerGuess) {

			if (guessReturner(computerGuess) == 1) {
				trys++;
				lowerBound = computerGuess;
				computerGuess += Math.ceil((double) (upperBound - lowerBound) / 2);
				System.out.println("the computer guessed " + computerGuess);
			}
			if (guessReturner(computerGuess) == 2) {
				trys++;
				upperBound = computerGuess;
				computerGuess -= Math.ceil((double) (upperBound - lowerBound) / 2);
				System.out.println("the computer guessed " + computerGuess);
			}

		}

		System.out.println(
				"Succes\nThe computer guessed that your number was " + computerGuess + " in " + trys + " trys");
            playAgain();

	}

}