public class Jungle{


public static void main(String[] args){

int trys =1;
Hunter hunter = new Hunter();

for (int i = 1; i <100; i++){

for (int j = 1; j <100; j++){


if(hunter.animal1.isAnimalHere(i,j)){
if(hunter.isWithinRange(i,j)){
System.out.println("Succes you spottet a " + hunter.animal1.getSpecies());
}
}
if(hunter.animal2.isAnimalHere(i,j)){
if(hunter.isWithinRange(i,j)){
System.out.println("Succes you found a " + hunter.animal2.getSpecies());
}
}
if(hunter.animal3.isAnimalHere(i,j)){
if(hunter.isWithinRange(i,j)){
System.out.println("Succes you found a " + hunter.animal3.getSpecies());
}
}
if(hunter.animal4.isAnimalHere(i,j)){
if(hunter.isWithinRange(i,j)){
System.out.println("Succes you found a " + hunter.animal4.getSpecies());
}
}



}
}
}
}

/*for (int i = 1; i < 1000000000; i++){
   if ((Math.abs(hunter.animal1.getCoordX()-hunter.x) <= hunter.eyesight) && (Math.abs(hunter.animal1.getCoordY()-hunter.y) <= hunter.eyesight))
   {System.out.println("wow... you shot a " + hunter.animal2.getSpecies());
   System.out.println("hunters eyesight was " + hunter.eyesight);
   System.out.println("hunter coordinates were " + "x = " + hunter.x + " y = " + hunter.y);
   System.out.println("animal coordinates were " + "x = " + hunter.animal1.getCoordX() + "y = " + hunter.animal1.getCoordY());
   System.out.println("you got it in " + trys + " trys");
   break;
   }
   else{trys++;
   hunter.moveHunter();}
}*/


