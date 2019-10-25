import java.io.*;
import java.util.Scanner;

public class Journal{


public void jounal()throws FileNotFoundException{
Scanner s = new Scanner(System.in);
PrintStream write = new PrintStream(new FileOutputStream("journal.txt", true));

String userInput = s.nextLine();
String endWord = "test//";

while (!userInput.equals(endWord)){
write.append(userInput);
write.append("\n");
userInput = s.nextLine();

}


}

public static void main(String[] args)throws FileNotFoundException{

Journal test = new Journal();

test.jounal();

}
}