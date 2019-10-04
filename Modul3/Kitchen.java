public class Kitchen{
	
	private static int voltage = 220;
	
  public static void main (String[] args){
    
	Stove myStove = new Stove(voltage);
    Stove myStove1 = new Stove(110);
    Stove myStove2 = new Stove(220);
   
    myStove.flame1.setFlame(2);
    myStove2.flame2.setFlame(2);
    myStove1.flame3.setFlame(3);
    myStove.flame4.setFlame(5);
    
    myStove.flame1.getFlame();
    myStove2.flame2.getFlame();
    myStove1.flame3.getFlame();
    myStove.flame4.getFlame();
    
    myStove.getVoltage();
    myStove1.getVoltage();
    myStove2.getVoltage();
    
    myStove.setVoltage(100);
    myStove1.setVoltage(200);
    myStove2.setVoltage(500);
    
    myStove.getVoltage();
    myStove1.getVoltage();
    myStove2.getVoltage();
    
    
    
  }
} 