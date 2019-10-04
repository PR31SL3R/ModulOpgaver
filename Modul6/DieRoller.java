public class DieRoller {

// main method
	public static void main(String[] args) {
		Dice dice = new Dice();
		int wonRounds = 0;
		// outer loop
		for (int j = 1; j <= 10; j++) {
			System.out.println("\n Round" + j + ("\n"));
			// inner loop
			for (int i = 1; i <= 3; i++) {
         //terning slås
				dice.shuffle();
				// Checker for 6'er i første slag
				if (dice.getDie() == 6 && i + j == 2) {
					System.out.println("first try");
					// tæller vundne runder op med en
					wonRounds++;
					break;

				}
				// Checker for andre 6'ere
				else if (dice.getDie() == 6) {
					System.out.println("you rolled a 6 on roll number " + i + " in your attemp number " + j);
					// tæller vundne runder op med en
					wonRounds++;
					break;
				}
				// Printer det "fejlede" slag
				else {
					System.out.println("You failed this roll with a " + dice.getDie());
				}
			}

		}
		// Tæller hvor mange runder er vundet
		{
			System.out.println("\n End of game. You won " + wonRounds + " rounds ");
		}
	}
}