public class Arrays{



public void minePlacer(){

Mine [] mines = new Mine[10];

//mines[0] = new Mine();

for(int i =0; i <mines.length; i++){


mines[i] = new Mine();

}

for(int j =0; j <mines.length; j++){
System.out.println(mines[j].mineX);
}



}



public static void main(String[] args){

System.out.println("Lets learn about indexes");
Arrays test = new Arrays();
test.minePlacer();


}

}