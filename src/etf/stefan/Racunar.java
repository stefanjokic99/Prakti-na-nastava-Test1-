package etf.stefan;

public class Racunar extends Uredjaj{

	private int trajanjeBaterije;
	private String specifikacije;
	
	public int getTrajanjeBaterije() {
		return trajanjeBaterije;
	}
	public void setTrajanjeBaterije(int trajanjeBaterije) {
		this.trajanjeBaterije = trajanjeBaterije;
	}
	public String getSpecifikacije() {
		return specifikacije;
	}
	public void setSpecifikacije(String specifikacije) {
		this.specifikacije = specifikacije;
	}
	
	public Racunar(String naziv, String proizvodjac, String JIB, StanjeUredjaja stanjeUredjaja, TipUredjaja tipUredjaja,
			Korisnik korisnik, int trajanjeBaterije, String specifikacije) {
		super(naziv, proizvodjac, JIB, stanjeUredjaja, tipUredjaja, korisnik);
		this.trajanjeBaterije = trajanjeBaterije;
		this.specifikacije = specifikacije;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSpecifikacije: " + getSpecifikacije();
	}
}
