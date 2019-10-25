import java.io.*;
import java.util.Scanner;

public class AppendFile{

int words;
int numbers;

public void reader()throws FileNotFoundException{

Scanner input = new Scanner(new File("filea.txt"));
while(input.hasNextLine()){
String line = input.nextLine();
writer(line);
}
input.close();

Scanner input2 = new Scanner(new File("fileb.txt"));
while(input2.hasNext()){
//String finalLIne = input2.nextLine();
if (input2.hasNextDouble()){
numbers++;
}
else words++;
input2.next();
}
System.out.println("new file has");
System.out.println("number of words = " +words);
System.out.println("number of numbers = " +numbers);
}


public void writer(String line)throws FileNotFoundException{
PrintStream write = new PrintStream(new FileOutputStream("fileb.txt", true));
String newLine = line;
write.append(newLine + "\n");

}

public static void main(String[] args)throws FileNotFoundException{

AppendFile test = new AppendFile();
test.reader();

}


}