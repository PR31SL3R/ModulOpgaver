import java.util.ArrayList;
import java.util.Scanner;

public class MyContacts{

ArrayList<Contacts>test = new ArrayList <Contacts>();
Scanner s = new Scanner(System.in);

public void printContacts(){
for(Contacts contacts: test) {
    System.out.println(contacts);  // Will invoke overrided `toString()` method
}
startContacts();
}

public void deleteContact(){
startContacts();

/*
public boolean equals(Object obj) {
    if (obj == null) return false;
    if (obj == this) return true;
    if (!(obj instanceof ArrayTest)) return false;
    ArrayTest o = (ArrayTest) obj;
    return o.i == this.i;
}
*/

}

public void addContact(){
test.add(new Contacts());
startContacts();

}

public void startContacts(){
System.out.println("Press 1 to add contact\nPress 2 to print contacts\nPress 3 to delete contact");
while (s.hasNextInt()==false){
System.out.println("Press 1 to add contact\nPress 2 to print contacts\nPress 3 to delete contact");
s.next();
}
int input = s.nextInt();
if (input == 1){
System.out.println("Add contact");
addContact();
}
if (input == 2){
System.out.println("Print contacts");
printContacts();
}
if (input == 3){
System.out.println("Delete contact");
deleteContact();
}

}


public static void main(String[] args){
MyContacts test = new MyContacts();
test.startContacts();



}
}