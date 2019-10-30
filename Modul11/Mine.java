import java.util.Random;

public class Mine {

	// Random object r
	Random r = new Random();
   
	// Instance Field
	int mineX = r.nextInt(MineHunter.boardSizeX) + 1;
	int mineY = r.nextInt(MineHunter.boardSizeY) + 1;

	// Avoid mines on start/end spots
	public Mine() {

		while ((mineX == 1 && mineY == 1) || (mineX == MineHunter.boardSizeX && mineY == MineHunter.boardSizeY)) {

			mineX = r.nextInt(MineHunter.boardSizeX) + 1;
			mineY = r.nextInt(MineHunter.boardSizeY) + 1;

		}

	}

	// method for locating mine on same field
	public boolean isMineHere(int x, int y) {
  			return true;
		} else

			return false;

	}

	// method for locating mine on same field
	  

}
