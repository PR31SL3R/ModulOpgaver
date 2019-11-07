import java.util.ArrayList;
import java.util.Random;

public class arrayList{

Random r = new Random();


ArrayList<Integer> values = new ArrayList<Integer>();

public void adder(){

for (int i = 0; i < 10; i++){
int input = r.nextInt(100);
values.add(input);
}
}

public void getter(){

for (int i =0; i < values.size(); i++){
System.out.println(values.get(i));
}
}


public static void main(String[] args){

System.out.println("test");
arrayList test = new arrayList();
test.adder();
test.getter();

}



}