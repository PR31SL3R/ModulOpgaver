import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mineHunterBoolean{

//instance field
String string = "";
int mines;
boolean [][] gameBoard;
int playerX = 1;
int playerY = 1;
int boardSizeX =10;
int boardSizeY =10;

//scanner and random
Scanner s = new Scanner(System.in);
Random r = new Random();


public void setGame(){

//setStarting location
playerX = 1;
playerY = 1;

//setBoard
System.out.println("how large a boardgame would you like");
boardSizeX = s.nextInt() +2;
boardSizeY = boardSizeX;

gameBoard = new boolean[boardSizeX][boardSizeY];


//setNumberOfMines
System.out.println("enter number of mines");
int minesNumber = s.nextInt();

//setMines
for (int k = 1; k<minesNumber; k++){

int temp = r.nextInt(boardSizeX-2)+1;
int temp2 = r.nextInt(boardSizeY-2)+1;

while ((temp == 1 && temp2 == 1) || (temp == boardSizeX-2 && temp2 == boardSizeY-2)){

temp = r.nextInt(boardSizeX-2)+1;
temp2 = r.nextInt(boardSizeY-2)+1;

}

gameBoard[temp][temp2]=true;



}

}
//printArray method - testing
public void printArray(){

System.out.print("[");
for (int i = 0; i < gameBoard.length; i++) {
    System.out.print("[");
    for (int j = 0; j < gameBoard[i].length; j++) {
        System.out.print(gameBoard[i][j] + ((j < gameBoard[i].length - 1) ? ", " : ""));
    }
    System.out.print("]\n" + ((i < gameBoard.length - 1) ? ", " : ""));
}
System.out.println("]");
}


//method for win/loss/mineNear
public void eventChecker(){

//print array - testing
//printArray();

//print x,y coordiantes
//System.out.println(playerX +""+playerY);

if (gameBoard[playerX][playerY] == true){

System.out.println("boom!!!");
playAgain();

}
if ((playerX == boardSizeX-2) && (playerY == boardSizeY-2)){


System.out.println("you won");
playAgain();
}


if (gameBoard[playerX][playerY-1] == true){ //&& (playerX>0) && (playerX < 10)&& (playerY >0)&& (playerY <10)){

System.out.println("bomb is below");


}

if (gameBoard[playerX][playerY+1] == true){ //&& (playerX>0) && (playerX < 10)&& (playerY >0)&& (playerY <10)){

System.out.println("bomb is above");


}

if (gameBoard[playerX-1][playerY+1] == true){ //&& (playerX>0) && (playerX < 10)&& (playerY >0)&& (playerY <10)){

System.out.println("bomb is top left");


}

if (gameBoard[playerX-1][playerY] == true){ //&& (playerX>0) && (playerX < 10)&& (playerY >0)&& (playerY <10)){

System.out.println("bomb is left");



}

if (gameBoard[playerX-1][playerY-1] == true){ //&& (playerX>0) && (playerX < 10)&& (playerY >0)&& (playerY <10)){

System.out.println("bomb is down left");



}

if (gameBoard[playerX+1][playerY] == true){ //&& (playerX>0) && (playerX < 10)&& (playerY >0)&& (playerY <10)){

System.out.println("bomb is right");


}

if (gameBoard[playerX+1][playerY-1] == true){ //&& (playerX>0) && (playerX < 10)&& (playerY >0)&& (playerY <10)){

System.out.println("bomb is down right");



}

if (gameBoard[playerX+1][playerY+1] == true){ //&& (playerX>0) && (playerX < 10)&& (playerY >0)&& (playerY <10)){

System.out.println("bomb is up right");
}
}

public void playAgain() {
		char input;
		System.out.println("Do you want to play again?");
		do {
			System.out.println("please enter Y/N ");
			input = s.next().charAt(0);
			if (input == 'Y' || (input == 'y')) {
				System.out.println("Here we go again");
				playGame();
			} else if (input == 'N' || (input == 'n')) {
				System.out.println("goodbye");
				System.exit(0);
			}
		} while ((input != 'y') || (input != 'Y') || (input != 'N') || (input != 'n'));

	}



//method for plating game
public void playGame(){
setGame();
eventChecker();
System.out.println("you are here " + (this.playerX) + " " + (this.playerY));
while (true) {

			int moveDirection = s.nextInt();

			if ((moveDirection == 1 || moveDirection == 4 || moveDirection == 7) && playerX > 1) {
				playerX--;

			}
			if ((moveDirection == 3 || moveDirection == 6 || moveDirection == 9) && playerX < boardSizeX-2) {
				playerX++;

			}
			if ((moveDirection == 7 || moveDirection == 8 || moveDirection == 9) && playerY < boardSizeY-2) {
				playerY++;

			}
			if ((moveDirection == 1 || moveDirection == 2 || moveDirection == 3) && playerY > 1) {
				playerY--;

			}
			System.out.println("you are here " + (this.playerX) + " " + (this.playerY));
			eventChecker();
		}


}


public static void main(String[] args){

mineHunterBoolean test = new mineHunterBoolean();
test.playGame();
}
}