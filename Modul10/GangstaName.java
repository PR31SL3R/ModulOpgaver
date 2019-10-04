import java.util.Scanner;

public class GangstaName{

Scanner s = new Scanner(System.in);

public String forShizzle(){
System.out.println("enter firstname");
String firstname = s.next();
System.out.println("enter lastname");
String lastname = s.next();
String firstinitial = firstname.substring(0,1);

String finalName = (firstinitial + "." + " Diddy " + lastname.toUpperCase() + " " + firstname + "-izzle");


return finalName;



}


public static void main(String[] args){


GangstaName bob = new GangstaName();
System.out.println(bob.forShizzle());

}


}