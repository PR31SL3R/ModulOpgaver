import java.util.Scanner;

public class Contacts{
Scanner s = new Scanner(System.in);

public Contacts(){
System.out.println("firstname");
this.firstName = s.next();
System.out.println("lastname");
this.lastName = s.next();
System.out.println("age");
this.age = s.nextInt();
System.out.println("phone");
this.phoneNumber = s.nextInt();
System.out.println("email");
this.emailAdress = s.next();
}

public String toString() {
        return ("Name:"+this.firstName+" "+this.lastName +
                    "\nage: "+ this.age +
                    "\nPhoneNumber: "+ this.phoneNumber +
                    "\nemail : " + this.emailAdress);
   }



public String firstName;
public String lastName;
public int age;
public int phoneNumber;
public String emailAdress;

}