public class Pony{

private int age;
private String name;
private boolean smelly;

//Contructor
public Pony(String name, int age){
this.name = name;
this.age = age;
}

public Pony(){

}


HorseWeapon gun = new HorseWeapon();
HorseWeapon gun2 = new HorseWeapon();

public void setSmelly(boolean smelly){
this.smelly = smelly;

}



// lav senere
public String getSmelly(){
if (this.smelly == true) {
   //System.out.println("The horse stinks");
   return "The horse stinks";
} else {
   //System.out.println("The horse smells wonderful");
   return "The horse smells wonderful";
}
}

public void setAge (int age){
this.age = age;

}

public int getAge(){

return age;
}





/*

public static void main(String[] args){

Pony blackie = new Pony("Balckie",22);
Pony blackie2 = new Pony();
System.out.println(blackie2.name);
System.out.println(blackie2.age);
System.out.println(blackie2.smelly);

blackie.setSmelly(true);
System.out.println(blackie.smelly);
System.out.println(blackie.getAge());





}
*/

}