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

//System.out.println(Arrays.toString(a1));
//System.out.println(Arrays.toString(a2));


int[] b1 = {12,34,56};
int[] b2 = {7,8,9,10};
int[] b3 = {1,2,3,4,5};

int[] b4 = new int[b1.length + b2.length + b3.length];
for (int i = 0; i<b1.length; i++){
b4[i] = b1[i]; 
}
for (int i = b1.length; i<b2.length+b1.length; i++){
b4[i] = b2[i-b1.length]; 
}

for (int i = b1.length+b2.length; i<b2.length+b1.length+b3.length; i++){
b4[i] = b3[i-(b1.length+b2.length)]; 
}



System.out.println(b1.length);
System.out.println(Arrays.toString(b4));








}



}