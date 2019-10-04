import java.util.Random;

public class Animal {

//instance field
	Random r = new Random();
	private String species;
	private int x;
	private int y;

//Constructor method	(places random)
	public Animal(String species) {
		this.species = species;
		this.x = r.nextInt(100) + 1;
		this.y = r.nextInt(100) + 1;
	}

//getSpecies method   
	public String getSpecies() {

		return species;
	}

//setCord method   
	public void setCoord(int x, int y) {
		this.x = x;
		this.y = y;
	}

//get coordinate for x method
	public int getCoordX() {

		return x;
	}

//get coordinate for y method   
	public int getCoordY() {

		return y;
	}

// isAnimalHere   
	public boolean isAnimalHere(int x, int y) {
		if ((this.x == x) && (this.y == y))
		{
			//System.out.println("you found a " + getSpecies() + " at x = " + getCoordX() + " y = " + getCoordY());
			return true;
		}
		else
			
         return false;
         
	}


}



/*
public static void main(String[] args) {
		int animalFound = 0;
      int numberOfTrys = 0;

		Animal animal1 = new Animal("horse");
		Animal animal2 = new Animal("potato");
		Animal animal3 = new Animal("killer robot");
		Animal animal4 = new Animal("piece of treasure");

//start runtime
		long startTime = System.currentTimeMillis();

//outer loop
		for (int i = 1; i <= 100; i++) {
// inner loop
			for (int j = 1; j <= 100; j++) {

				// test 1
            
				/*
				 * if (animal1.isAnimalHere(i, j) & animal2.isAnimalHere(i, j) &
				 * animal3.isAnimalHere(i, j) & animal4.isAnimalHere(i, j)) {}
				 */
             
				// test 2
            
				/*
				 * animal1.isAnimalHere(i, j); animal2.isAnimalHere(i, j);
				 * animal3.isAnimalHere(i, j); animal4.isAnimalHere(i, j);
				 */

				// test 3
    /*        
            numberOfTrys++;

				if (animal1.isAnimalHere(i, j)) {
					animalFound++;
               System.out.println(numberOfTrys);
              
				}
				if (animal2.isAnimalHere(i, j)) {
					animalFound++;
               System.out.println(numberOfTrys);
              
				}
				if (animal3.isAnimalHere(i, j)) {
					animalFound++;
               System.out.println(numberOfTrys);
               
				}
				if (animal4.isAnimalHere(i, j)) {
					animalFound++;
               System.out.println(numberOfTrys);
               
				}

			}

		}
		System.out.print("\nCongrats - you had " + animalFound + " encounters in the jungle");
		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime);
		System.out.print("\ntotal search time was " + totalTime + " milliseconds");

	}
*/

