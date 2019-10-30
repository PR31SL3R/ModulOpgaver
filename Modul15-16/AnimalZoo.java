public class AnimalZoo{

static int boardSizeX = 10;
static int boardSizeY = 10;

Snake[] snakes;
Hawk[] hawks;
Rabbit bob = new Rabbit();

public void setGame(){

//set 10 hawks and snakes
snakes = new Snake[10];
hawks = new Hawk[10];
for (int i = 0; i < hawks.length; i++){
snakes[i] = new Snake();
hawks[i] = new Hawk();
}


}

public void gameState(){

for (int j = 0; j < snakes.length; j++) {
			// print locations
			 //System.out.println(snakes[j].getX() + " " + snakes[j].getY());
          //System.out.println(hawks[j].getX() + " " + hawks[j].getY());

			if (hawks[j].isAnimalNear(bob.getX(),bob.getY())) {
				System.out.println("crap... a hawk saw you");

			}
         if (snakes[j].isAnimalNear(bob.getX(),bob.getY())){
         System.out.println("a snake saw you");
         }
         }


}

public void playGame(){
setGame();

while (true){
bob.move(1);
gameState();
//moveAnimals();


}


}



public static void main(String[] args){
AnimalZoo test = new AnimalZoo();
test.playGame();




}
}