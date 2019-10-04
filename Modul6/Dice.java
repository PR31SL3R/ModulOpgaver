import java.util.*;

public class Dice {

// Instance field
	private int die = -1;
	// Create Random object r
	Random r = new Random();

// Shuffle method
	public void shuffle() {
		// Use nextInt on random r
		die = r.nextInt(6) + 1;
	}
   
   public void setDie(int die){
   this.die = die;
   }

	public int getDie() {

		return die;
	}

}