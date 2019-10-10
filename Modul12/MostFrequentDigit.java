import java.util.Arrays;

public class MostFrequentDigit{

int t =0;

//use int.toString




/*

String temp = Integer.toString(guess);
int[] newGuess = new int[temp.length()];
for (int i = 0; i < temp.length(); i++)
{
    newGuess[i] = temp.charAt(i) - '0';
}

Problem: Write a method mostFrequentDigitthat returns the
digit value that occurs most frequently in a number.
•Example: The number 669260267 contains:
one 0, two 2s, four 6es, one 7, and one 9.
mostFrequentDigit(669260267)returns 6.
•If there is a tie -  
return the digit with the lower value.
mostFrequentDigit(57135203)returns 3.
*/

public int mostFrequentDigit(int temp){

String temp2 = Integer.toString(temp);

int[] tester = new int[temp2.length()];

for (int i = 0; i < temp2.length(); i ++){

System.out.println(temp2.charAt(i));

tester[i]=((int)temp2.charAt(i)- '0');

}

System.out.println(Arrays.toString(tester));
return 1;
}

public static void main(String[] args){




MostFrequentDigit test = new MostFrequentDigit();

test.mostFrequentDigit(123459105);



}
}