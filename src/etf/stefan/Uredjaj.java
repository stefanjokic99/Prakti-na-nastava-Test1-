package etf.stefan;

public abstract class Uredjaj {
	
	private String naziv;
	private String proizvodjac;
	private String JIB;
	private StanjeUredjaja stanjeUredjaja;
	private TipUredjaja tipUredjaja;
	private Korisnik korisnik;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public String getJIB() {
		return JIB;
	}
	public void setJIB(String JIB) {
		this.JIB = JIB;
	}
	public StanjeUredjaja getStanjeUredjaja() {
		return stanjeUredjaja;
	}
	public void setStanjeUredjaja(StanjeUredjaja stanjeUredjaja) {
		this.stanjeUredjaja = stanjeUredjaja;
	}
	public TipUredjaja getTipUredjaja() {
		return tipUredjaja;
	}
	public void setTipUredjaja(TipUredjaja tipUredjaja) {
		this.tipUredjaja = tipUredjaja;
	}
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	
	public Uredjaj(String naziv, String proizvodjac, String JIB, StanjeUredjaja stanjeUredjaja, TipUredjaja tipUredjaja,
			Korisnik korisnik) {
		this.naziv = naziv;
		this.proizvodjac = proizvodjac;
		this.JIB = JIB;
		this.stanjeUredjaja = stanjeUredjaja;
		this.tipUredjaja = tipUredjaja;
		this.korisnik = korisnik;
	}
	
	@Override
	public String toString() {
		return "Tip uredjaja: " + getTipUredjaja() + "\nNaziv uredjaja: " + getNaziv() + "\nProizvodjac uredjaja: " + getProizvodjac();
	}
}
