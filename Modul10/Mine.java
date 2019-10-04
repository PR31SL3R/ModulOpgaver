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
   



}