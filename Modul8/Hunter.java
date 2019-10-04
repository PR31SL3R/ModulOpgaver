import java.util.Random;

public class Hunter{
//instance Field
int x;
int y;
String subSpecies;
int eyesight;
//Constructor import
Random r = new Random();
//contructor 
public Hunter(){
this.x = r.nextInt(100)+1;
this.y = r.nextInt(100)+1;
subSpecies = "redneck";
eyesight = r.nextInt(16);
}

//Creates animal obejcts for hunting     
Animal animal1 = new Animal("horse");
Animal animal2 = new Animal("potato");
Animal animal3 = new Animal("killer robot");
Animal animal4 = new Animal("piece of treasure");

//is within range
public boolean isWithinRange(int x, int y) {
		if ((Math.abs(this.x - x) <=16) && (Math.abs(this.y - y) <=16) )
		{
			return true;
		}
		else
			
         return false;
         
	}


public void gun(){
System.out.println("pew pew");
}

//move hunter manual
public void moveHunter(int x,int y){
this.x = this.x + x;
this.y = this.y + y;

}

//place hunter random method
public void moveHunter(){
this.x = r.nextInt(100)+1;
this.y = r.nextInt(100)+1;
}


}


/*
public void moveHunter1(){
int randomNumber = r.nextInt();
int tempXplus = this.x + r.nextInt(10)+1;
int tempYplus = this.y + r.nextInt(10)+1;

int tempXminus = this.x - r.nextInt(10)+1;
int tempYminus = this.y - r.nextInt(10)+1;

if ((r.nextInt()%2==0)&&(tempXplus<=100)&&(tempYplus<=100))
{this.x = tempXplus;
this.y = tempYplus;}

else if ((r.nextInt()%2==1)&&(tempXminus>0)&&(tempYminus>0))
{this.x = tempXminus;
this.y = tempYminus;}

else {moveHunter1();
}

}
*/