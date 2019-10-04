public class Add{



public int add(int a, int b){

return a+b;
}




public static void main(String[] args){

Add test1 = new Add();
System.out.println(test1.add(2,3));

if (test1.add(3,2) == 4 || test1.add(3,3) == test1.add(4,2) && (test1.add(3,2) == test1.add(4,1))) 
{System.out.println("true");}
else {System.out.println("false");}

}





}