import java.util.Scanner;
import java.util.Arrays;

public class WeatherArray{

int days;
double average;

Scanner s = new Scanner(System.in);

public void weather(){

System.out.println("how many days of measurement?");
int arraySize = s.nextInt();
double[] array = new double[arraySize];

for(int i = 0; i < array.length; i++){
System.out.println("Please enter temperatures");
array[i] = s.nextDouble();

average += array[i];

}
average = (Math.round(average/array.length));

for (int j = 0; j < array.length; j++){

if (array[j] > average){

days++;
System.out.println("mesurements above average at day " + (j+1) + " with a measurement of " + array[j] + " \n");
}

}

System.out.print("temp average for the period is "+average + "\n" + "number of days above average " + days + "\n");

}








public static void main(String[] args){

WeatherArray obj = new WeatherArray();
obj.weather();


}
}