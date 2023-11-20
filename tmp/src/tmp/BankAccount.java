package tmp;

public class BankAccount extends Banca {
	
	//atributes
	private String IBAN;
	private double saldo=0.0d;
	private Owner owner;
	private Banca banca;
	
	//getters && setters
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		String tmp; 
		boolean rep = false;
		if (0 == this.banca.bankAccounts.size()) {
			IBAN = iBAN;
			this.banca.bankAccounts.add(this);
			return;			
		}
		for(int i = 0; (i < this.banca.bankAccounts.size()) && 
		(this.banca.bankAccounts.get(i) != null); i++) {			
			System.out.println(i);
			tmp = this.banca.bankAccounts.get(i).getIBAN();		
			if(iBAN.equals(tmp)) {	
				rep = true;	
			}	
		}if (!rep) {			
			IBAN = iBAN;
			this.banca.bankAccounts.add(this);
		}
	}

	//costructors
	public BankAccount(String IBAN, Owner owner, Banca banca) {
		this.banca = banca;
		this.owner = owner;
		setIBAN(IBAN);
	}
	
	//methods
	boolean Preleva(double Amount) {
		if(Amount<=saldo) {
			saldo=saldo-Amount;
			System.out.println("Prelievo Effettuato");
			return true;
		}
		else
		{
			System.out.println("Saldo Insufficiente");
			return false;	
		}
	}
	
    void Versa(double Amount) {
    	saldo = saldo + Amount;
    	System.out.println("Transazione effettuata");
    }

	public void PrintDetails() {
		System.out.println("Il Conto "+IBAN+" ha saldo "+saldo);
//		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "BankAccount [" + (IBAN != null ? "IBAN=" + IBAN + ", " : "") + "Saldo=" + saldo + ", "
				+ (owner != null ? "Owner=" + owner : "") + "]";
	}
}