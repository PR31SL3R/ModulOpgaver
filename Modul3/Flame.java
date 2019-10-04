public class Flame {
	
	
 private int level = 0; //0=off
 private int id;
  
  public Flame(int id) {
	  this.id=id;
	  
  }
  
   public void getFlame(){
     System.out.println("burner "+ id +" Cooking at level: "+level);
   }
   
   public void setFlame(int level) {
	   this.level = level;
	   


   }
}
  


