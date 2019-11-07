import java.util.Random;

public class newRabbit extends Animal {

	public newRabbit() {
		this.x = 1;
		this.y = 1;
	}

	int health = 10;

	Random r = new Random();

	public void jump() {
		this.x += r.nextInt(3) + 1;
		this.y += r.nextInt(3) + 1;
	}

	public int getHealth() {

		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;

	}

	public void setXY(int x, int y) {

		this.x = x;
		this.y = y;

	}
   
   

}