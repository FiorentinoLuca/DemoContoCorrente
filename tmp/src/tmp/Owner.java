package tmp;

import java.time.*;

public class Owner {
	
	
	//ATRIBUTTI
	private String Nome;
	private String Cognome;
	@SuppressWarnings("unused")
	private LocalDate DataNascita;
	@SuppressWarnings("unused")
	private String CodiceFiscale;
	private BankAccount ElencoConti[]=new BankAccount[5];

	
	// METODI GETTER E SETTER
	String getNome() {
		return Nome;
	}	
	String getCognome() {
		return Cognome;
	}
	BankAccount[] getElencoConti() {
		return ElencoConti;
	}
	
	// COSTRUTTORI
	public Owner(String nome, String cognome, LocalDate dataNascita, String codiceFiscale) {
		Nome = nome;
		Cognome = cognome;
		DataNascita = dataNascita;
		CodiceFiscale = codiceFiscale;
	}
	
	
	//METODI
	public boolean addBankAccount(BankAccount cc) {
		for(int i=0; (0 == i || ElencoConti[i-1] != null) && i<ElencoConti.length; i++)
		{
			if(ElencoConti[i]==null) {
				ElencoConti[i]=cc;
				return true;
			}
		}
		return false;
	}
	
	public void PrintDetails() {
		if (ElencoConti[0]!=null)
			for(int i = 0;  ElencoConti[i]!=null && i < ElencoConti.length; i++)
				ElencoConti[i].PrintDetails();
		else
			System.out.println("Nessun ContoCorrente aperto");
	}

}