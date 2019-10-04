public class IfThenElse{

public int add(int a, int b){

return a+b;
}

public int subtract(int a, int b){
return a-b;
}


public static void main(String[] args){

// if else
IfThenElse test = new IfThenElse();
if (test.add(2,3)<5){System.out.println("wow");}
   else {System.out.println("not wow");}

// && == and opperator
IfThenElse test1 = new IfThenElse();
if (test1.add(2,2)<5 && test1.subtract(5,3)<5)
{System.out.println("much wow");}

// || == or opperator
IfThenElse test2 = new IfThenElse();
if (test1.add(2,3)<5 || test1.add(2,6)<5)
{System.out.println("much much wow");} 
else{System.out.println("not much much wow");}

if ((test1.add(2,3) == 5 || (test1.subtract(8,3) == 0)) && (test1.add(2,6)== 7))
{System.out.println("true");}
else System.out.println("false");




}


}