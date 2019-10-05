import java.util.Random;

public class Mine {

	// Random object r
	Random r = new Random();
   
	// Instance Field
	int mineX = r.nextInt(PlayGame.boardSizeX) + 1;
	int mineY = r.nextInt(PlayGame.boardSizeY) + 1;

	// Avoid mines on start/end spots
	public Mine() {

		while ((mineX == 1 && mineY == 1) || (mineX == 10 && mineY == 10)) {

			mineX = r.nextInt(PlayGame.boardSizeX) + 1;
			mineY = r.nextInt(PlayGame.boardSizeY) + 1;

		}

	}

	// method for locating mine on same field
	public boolean isMineHere(int x, int y) {
		if ((this.mineX == x) && (this.mineY == y)) {
			return true;
		} else

			return false;

	}

	// method for locating mine on same field
	public boolean isMineNear(int x, int y) {
		if (((Math.abs(mineX - x) == 1)) && ((Math.abs(this.mineY - y) == 1))
				|| ((Math.abs(mineX - x) == 1)) && ((Math.abs(this.mineY - y) == 0))
				|| ((Math.abs(mineX - x) == 0)) && ((Math.abs(this.mineY - y) == 1))) {

			return true;
		} else

			return false;
	}

}
