public class MotorBike{

double engineSize = 1.2;
int year = 1992;
String brandName ="";



public MotorBike(String brandName){

this.brandName = brandName;

}

public MotorBike(String brandName, int year){

this.brandName = brandName;

}



public void printMethod(){

System.out.println("The motorcycle is a " + brandName + " from " + year);

}




public static void main(String[] args){

MotorBike obj = new MotorBike("yamaha");
obj.printMethod();
}


}