public class LegalSecretary extends Secretary{


public void legalBreifs(){

System.out.println("LegalSecretary");
}

public double getSalery(){

double baseSalary = super.getSalary();
return baseSalary + 5000; 
}


}