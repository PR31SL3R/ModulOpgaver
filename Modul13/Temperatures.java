import java.io.*;    // for File
import java.util.*;  // for Scanner
public class Temperatures {
public static void main(String[] args)throws FileNotFoundException{
Scanner input = new Scanner(new File("weather.txt"));
input.useLocale(Locale.US);
double prev= input.nextDouble();   
// fencepost
for (int i = 1; i <= 7; i++) 
{double next = input.nextDouble();
System.out.println(prev+ " to " + next +", change = " + (next -prev));prev= next;}
}
}
