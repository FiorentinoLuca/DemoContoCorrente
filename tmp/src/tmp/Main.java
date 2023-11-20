package tmp;

import java.time.LocalDate;

/*

Naming Conventions:
    
    package: lower_case
    Classe deve essere un Sogetto: PascalCase
    Metodo deve essere un Predicato: camelCase
    Variabile deve descrivere la funzione; 
    se e soltanto un contenitore temp allora
    puo essere un singolo caratere: camelCase
    Constants: UPPER_CASE
    
    UPPER_CASE
    PascalCase
    camelCase
    lower_case

*/

public class Main {
	
	public static void main(String[] args) {
		
		Banca bank = new Banca();
		
		Owner o1 = new Owner("Antonio", "Esposito", LocalDate.of(2000, 2, 20), "NTNSPS3456");
		Owner o2 = new Owner("Antonio", "Esposito", LocalDate.of(2000, 2, 20), "NTNSPS3456");
		System.out.println(o1.getClass());
		System.out.println(o1);
		
		
		BankAccount b1 = new BankAccount("IT01234567", o1, bank);
		o1.addBankAccount(b1);
		
		BankAccount b2 = new BankAccount("IT03456789", o1, bank);
		o1.addBankAccount(b2);	
		
		o1.PrintDetails();
		b2.Versa(23.50);
		o1.PrintDetails();
		//b2.transferenza(b3.IBAN);
		o2.PrintDetails();

	}
}
