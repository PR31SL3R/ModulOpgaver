import java.util.Random;
public class Mine{

Random r = new Random();

int mineX = r.nextInt(10)+1;
int mineY = r.nextInt(10)+1;

public boolean isMineHere(int x, int y) {
		if ((this.mineX == x) && (this.mineY == y))
		{
			return true;
		}
		else
			
         return false;
         
	}
   
   public boolean isMineNear(int x, int y) {
		if (((Math.abs(mineX -x) == 1)) && ((Math.abs(this.mineY-y) == 1))||((Math.abs(mineX -x) == 1)) && ((Math.abs(this.mineY-y) == 0))||((Math.abs(mineX -x) == 0)) && ((Math.abs(this.mineY-y) == 1)))
		{
         
			return true;
		}
		else
			
         return false;      
	}
   
}
