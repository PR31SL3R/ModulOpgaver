import java.util.Random;

public class Rabbit extends Animal{



int health = 10;

public Rabbit(){
super.setXY(1,1);
}

public void jump(){
System.out.println(super.getX() + "" + super.getY());
super.setXY(getX()+3,getY()+3);
System.out.println(super.getX() + "" + super.getY());

}

public int getHealth(){

return this.health;
}

public void setHealth(int health){
this.health = health;

}

}