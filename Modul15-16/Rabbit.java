import java.util.Random;

public class Rabbit extends Animal{




public Rabbit(){
super.setXY(1,1);
}

public void jump(){
System.out.println(super.getX() + "" + super.getY());
super.setXY(getX()+3,getY()+3);
System.out.println(super.getX() + "" + super.getY());

}

}