import java.util.Arrays;

public class MostFrequentDigit{


int [] tally = new int[10];
int [] compareTally = new int[11];
int max =0;
int maxCompare =0;
int compare = 0;

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





public void mostFrequentDigit2(int temp){

String temp2 = Integer.toString(temp);

int[] sorter = new int[temp2.length()+1];

for (int i = 0; i < temp2.length(); i ++){

sorter[(temp2.charAt(i)- '0')]+=1;

}

System.out.println(Arrays.toString(sorter));


for (int j = 1; j < sorter.length; j++){

if (sorter[j] > max){

this.max = sorter[j];
//System.out.println(max + " times of the digit " + j);
}}

for (int k = 1; k < sorter.length; k++){

if (sorter[k] == max){

//Arrays.fill(compareTally, -1);
compareTally[k]=k;

}

if ((compareTally[k] > -1) && (compareTally[k] > compareTally[k+1])){

compare = compareTally[k];

}

}
System.out.println(Arrays.toString(compareTally));
System.out.println(max + " times of the digit " + compare);

}






public static void main(String[] args){




MostFrequentDigit test = new MostFrequentDigit();

//test.mostFrequentDigit(1112224466);

test.mostFrequentDigit2(999344888);



}
}