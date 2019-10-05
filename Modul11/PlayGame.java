import java.util.Scanner;

public class PlayGame {
	int x = 1;
	int y = 1;
   int arraySize = 10;
	Mine[] mines = new Mine[arraySize];

	Scanner s = new Scanner(System.in);

	public void move() {
		minePlacer();
		System.out.println("you are here " + this.x + " " + this.y);
      
		while (true) {
			int temp = s.nextInt();
			if ((temp == 4) && (this.x >= 1)) {
				this.x = this.x - 1;
				System.out.println(this.x);
				System.out.println(this.y);
         mineChecker();

			}
			if (temp == 5) {
				System.out.println("Goodbye");
				mineChecker();
				break;
			}
			if ((temp == 6) && (this.x < 10)) {
				this.x = this.x + 1;
				System.out.println(this.x);
				System.out.println(this.y);
				mineChecker();
			}
			if ((temp == 8) && (this.y < 10)) {
				this.y = this.y + 1;
				System.out.println(this.x);
				System.out.println(this.y);
				mineChecker();
			}
			if ((temp == 2) && (this.y > 0)) {
				this.y = this.y - 1;
				System.out.println(this.x);
				System.out.println(this.y);
				mineChecker();
			}
			if ((temp == 1) && (this.x >= 1) && (this.y >= 1)) {
				this.x = this.x - 1;
				this.y = this.y - 1;
				System.out.println(this.x);
				System.out.println(this.y);
				mineChecker();
			}
			if ((temp == 3) && (this.x <= 9) && (this.y >= 1)) {
				this.x = this.x + 1;
				this.y = this.y - 1;
				System.out.println(this.x);
				System.out.println(this.y);
				mineChecker();
			}
			if ((temp == 7) && (this.x >= 1) && (this.y <= 97)) {
				this.x = this.x - 1;
				this.y = this.y + 1;
				System.out.println(this.x);
				System.out.println(this.y);
				mineChecker();
			}
			if ((temp == 9) && (this.x <= 9) && (this.y <= 9)) {
				this.x = this.x + 1;
				this.y = this.y + 1;
				System.out.println(this.x);
				System.out.println(this.y);
				mineChecker();
			}
		}
		s.close();
	}

	public void minePlacer() {
   
   x =1;
   y=1;

		for (int i = 0; i < mines.length; i++) {

			mines[i] = new Mine();
		}
	}
   
   public void mineChecker(){
   for (int j = 0; j < mines.length; j++) {

					//System.out.println(mines[j].mineX + " " + mines[j].mineY);               

					if (mines[j].isMineHere(x, y)) {
						System.out.println("you hit a mine");
                  playAgain();
                  
					}
					if (mines[j].isMineNear(x, y)) {
						System.out.println("mine is near");
					}
				} 
   }
   
   public void playAgain(){
   char input;
   System.out.println("Do you want to play again?");
   do {
					System.out.println("please enter Y/N ");
					input = s.next().charAt(0);
					if (input == 'Y' || (input == 'y')) {
						System.out.println("Here we go again");
						move();
					} else if (input == 'N' || (input == 'n')) {
						System.out.println("goodbye");
						System.exit(0);
					}
				} while ((input != 'y') || (input != 'Y') || (input != 'N') || (input != 'n'));

   }

	public static void main(String[] args) {

		System.out.println("Lets learn about indexes");
		PlayGame test = new PlayGame();
		test.move();

	}

}