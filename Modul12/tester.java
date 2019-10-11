import java.util.Arrays;

public class tester{

int[] tally = new int[10];

public void mostFrequentDigit(int temp){

int temp2 = 0;

int length =  Integer.toString(temp).length();

for (int i = 0; i < length; i++){

temp2 = temp%10;

temp = temp/10;

tally[temp2] +=1;

}

System.out.println(Arrays.toString(tally));



}
}