import java.util.Scanner;

public class PlayField{

int playerX = 2;
int playerY = 3;

Scanner s = new Scanner(System.in);


public void minePlacer(){

System.out.println("how many mine to be placed?");
int arraySize = s.nextInt();

Mine [] mines = new Mine[10];

//mines[0] = new Mine();

for(int i =0; i <mines.length; i++){


mines[i] = new Mine();

}


for(int j =0; j <mines.length; j++){
//System.out.println(mines[j].mineX);

System.out.println(mines[j].mineX);
System.out.println(mines[j].mineY);

int x = mines[j].mineX;
int y = mines[j].mineX;

if (mines[j].isMineHere(playerX,playerY)){
System.out.println("success");
}



}



}



public static void main(String[] args){

System.out.println("Lets learn about indexes");
PlayField test = new PlayField();
test.minePlacer();



}

}