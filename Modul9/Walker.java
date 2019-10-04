import java.util.Scanner;

public class Walker {

	int x = 5;
	int y = 5;

	public void move() {
		System.out.println("you are here " + this.x + " " + this.y);
		Scanner s = new Scanner(System.in);

		while (true) {
			int temp = s.nextInt();
			if ((temp == 4) && (this.x >= 1)) {
				this.x = this.x - 1;
				System.out.println(this.x);
				System.out.println(this.y);
			}
			if (temp == 5) {
				System.out.println("Goodbye");
				break;
			}
			if ((temp == 6) && (this.x < 10)) {
				this.x = this.x + 1;
				System.out.println(this.x);
				System.out.println(this.y);
			}
			if ((temp == 8) && (this.y < 10)) {
				this.y = this.y + 1;
				System.out.println(this.x);
				System.out.println(this.y);
			}
			if ((temp == 2) && (this.y > 0)) {
				this.y = this.y - 1;
				System.out.println(this.x);
				System.out.println(this.y);
			}
			if ((temp == 1) && (this.x >= 1) && (this.y >= 1)) {
				this.x = this.x - 1;
				this.y = this.y - 1;
				System.out.println(this.x);
				System.out.println(this.y);
			}
			if ((temp == 3) && (this.x <= 9) && (this.y >= 1)) {
				this.x = this.x + 1;
				this.y = this.y - 1;
				System.out.println(this.x);
				System.out.println(this.y);
			}
			if ((temp == 7) && (this.x >= 1) && (this.y <= 97)) {
				this.x = this.x - 1;
				this.y = this.y + 1;
				System.out.println(this.x);
				System.out.println(this.y);
			}
			if ((temp == 9) && (this.x <= 9) && (this.y <= 9)) {
				this.x = this.x + 1;
				this.y = this.y + 1;
				System.out.println(this.x);
				System.out.println(this.y);
			}

		}
		s.close();

	}

	public static void main(String[] args) {

		Walker bob = new Walker();
		bob.move();
	}

}
