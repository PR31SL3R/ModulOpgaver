import java.util.Scanner;
import java.util.Random;

public class Animal{

Scanner s = new Scanner(System.in);
Random r = new Random();

int x = r.nextInt(10)+1;
int y = r.nextInt(10)+1;

public void setXY(int x, int y){
this.x = x;
this.y = y;
}

public int getX(){
return x;
}

public int getY(){
return y;
}

public void move(){
while (true) {
			
         int moveDirection = r.nextInt(9)+1;

			if ((moveDirection == 1 || moveDirection == 4 || moveDirection == 7) && x > 1) {
				x--;
            

			}
			if ((moveDirection == 3 || moveDirection == 6 || moveDirection == 9) && x < AnimalZoo.boardSizeX) {
				x++;
            

			}
			if ((moveDirection == 7 || moveDirection == 8 || moveDirection == 9) && y < AnimalZoo.boardSizeY) {
				y++;
            

			}
			if ((moveDirection == 1 || moveDirection == 2 || moveDirection == 3) && y > 1) {
				y--;
            

			}
			System.out.println("you are here " + this.x + " " + this.y);
         break;
		}
}

public void move(int test){

System.out.println("press for movement");

while (true) {

			int moveDirection = s.nextInt();

			if ((moveDirection == 1 || moveDirection == 4 || moveDirection == 7) && x > 1) {
				x--;

			}
			if ((moveDirection == 3 || moveDirection == 6 || moveDirection == 9) && x < AnimalZoo.boardSizeX) {
				x++;

			}
			if ((moveDirection == 7 || moveDirection == 8 || moveDirection == 9) && y < AnimalZoo.boardSizeY) {
				y++;

			}
			if ((moveDirection == 1 || moveDirection == 2 || moveDirection == 3) && y > 1) {
				y--;

			}
			System.out.println("you are here " + this.x + " " + this.y);
         break;
		}
}

public boolean isAnimalHere(int x, int y){

return (this.x == x && this.y == y);
}

public boolean isAnimalNear(int x, int y) {
		if (((Math.abs(this.x - x) == 1)) && ((Math.abs(this.y - y) == 1))
				|| ((Math.abs(this.x - x) == 1)) && ((Math.abs(this.y - y) == 0))
				|| ((Math.abs(this.x - x) == 0)) && ((Math.abs(this.y - y) == 1))) {

			return true;
		} else

			return false;
	}




}