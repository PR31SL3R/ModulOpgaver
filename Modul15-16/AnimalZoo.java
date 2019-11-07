public class AnimalZoo{

static int boardSizeX = 10;
static int boardSizeY = 10;

Snake[] snakes;
Hawk[] hawks;
Rabbit player = new Rabbit();

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

			if (hawks[j].isAnimalNear(player.getX(),player.getY())) {
				System.out.println("crap... a hawk saw you");

			}
         if (snakes[j].isAnimalNear(player.getX(),player.getY())){
         System.out.println("a snake saw you");
         }
         if (snakes[j].isAnimalHere(player.getX(),player.getY())){
         System.out.println("oh no! a snake bit you");
         player.setHealth(player.getHealth()-3);
          if(player.getHealth()<0){
         System.out.println("you died");
         System.exit(1);
         } 
         System.out.println("your health is now " + player.getHealth());         }
         if (hawks[j].isAnimalHere(player.getX(),player.getY())){
         System.out.println("oh no! a hawk attacked you");
         player.setHealth(player.getHealth()-3);
         if(player.getHealth()<0){
         System.out.println("you died");
         System.exit(1);
         } 
         System.out.println("your health is now " + player.getHealth()); 
         }
         }


}

public void roundCounter(){

for (int i = 0; i < 10; i++){

snakes[i].move();
hawks[i].move();
}
}

public void playGame(){
setGame();

while (true){
player.move(1);
gameState();
roundCounter();
gameState();



}


}



public static void main(String[] args){
AnimalZoo test = new AnimalZoo();
test.playGame();




}
} 