import java.util.Arrays;

public class Swap{






public static void main(String[] args){


int[] test = {12,34,56};

int temp = 0;
int temp2 = 0;

//System.out.println(Arrays.toString(test));

temp = test[1];
temp2 = test[2];

test[1] = temp2;
test[2] = temp;


int[] a1 = {12,34,56};
int[] a2 = {20,50,80};

int[] temp3 = a1;

a1=a2;
a2=temp3;

System.out.println(Arrays.toString(a1));
System.out.println(Arrays.toString(a2));








}



}