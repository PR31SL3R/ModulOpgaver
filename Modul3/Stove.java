public class Stove {
   private int stoveVoltage = 220;
   private int kitchenVoltage = 220;

   
   
public Stove(int stoveVoltage) {
	this.stoveVoltage = stoveVoltage;
	if(kitchenVoltage == stoveVoltage) {
		
	System.out.println("Compatable");
	
}
	else {System.out.println("not compatable");}
}

/*public Stove() {
	
	Flame flame1 = new Flame(1);
	Flame flame2 = new Flame(2);
	Flame flame3 = new Flame(3);
	Flame flame4 = new Flame(4);
}*/

public Stove() {}

Flame flame1 = new Flame(1);
Flame flame2 = new Flame(2);
Flame flame3 = new Flame(3);
Flame flame4 = new Flame(4);

   public void getVoltage(){
     //her skal ske noget!
     System.out.println("The voltage is set to: "+stoveVoltage+"V");
   }
   
   
   public void setVoltage(int inputStoveVoltage){
	 //her skal ske noget!
	     this.stoveVoltage = inputStoveVoltage;
	     System.out.println("The voltage is set to: "+stoveVoltage+"V");
	   }
 
   
   
   
   
   
}