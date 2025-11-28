public class Bank {
	   
    String bankName;
    int interest;

	Bank(String nom, int inte){
    	bankName = nom;
        interest = inte;
    }

    public void getRateOfInterest()
    {
        System.out.println("El interes del banco " + bankName + " es de " + interest);
    }

    public static void Main(String args[]){
        Bank bank1 = new Bank("SBI", 8);
        bank1.getRateOfInterest();
        Bank bank2 = new Bank("ICICI", 7);
        bank2.getRateOfInterest();
        Bank bank3 = new Bank("Axis", 9);
        bank3.getRateOfInterest();
    }
}
