public class Student{

String name;
String couseName = "SWdev";
int age;
int swdev;
String school;




public Student (String inputName, int inputAge){
this.name = inputName;
this.age = inputAge;

}

  public String toString(){
    
    String message = ("Hi, my name is " + name);
    return message;
  }


public void addLesson(){

 swdev++;
 if (swdev == 5){
   System.out.println("Congrats " + this.name);
   }}
   
   public static void main(String[] args){
   
   
   Student student1 = new Student("BOB",23);
   School kea = new School();
  
   System.out.println(student1.toString());
   
   }
   
   
   }






