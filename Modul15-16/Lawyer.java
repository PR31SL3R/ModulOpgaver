public class Lawyer extends Employee{

public Lawyer(int years){

super(years);

}


public String getVacationForm(){

return "pink";
}

public int getVacationsDays(){
return super.getVacationsDays() + 5;
}

public double getSalary(){

return super.getSalary() + 5000 * getYears();
}


public void sue() {
System.out.println("I'll see you in court!");}

}