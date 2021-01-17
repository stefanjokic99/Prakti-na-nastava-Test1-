package etf.stefan;

public class Telefon extends Uredjaj {

	private int baterija_mAh;
	private int godinaProizvodnje;
	
	public int getBaterija_mAh() {
		return baterija_mAh;
	}
	public void setBaterija_mAh(int baterija_mAh) {
		this.baterija_mAh = baterija_mAh;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	
	public Telefon(String naziv, String proizvodjac, String JIB, StanjeUredjaja stanjeUredjaja, TipUredjaja tipUredjaja,
			Korisnik korisnik, int baterija_mAh, int godinaProizvodnje) {
		super(naziv, proizvodjac, JIB, stanjeUredjaja, tipUredjaja, korisnik);
		this.baterija_mAh = baterija_mAh;
		this.godinaProizvodnje = godinaProizvodnje;
	}
		
	@Override
	public String toString() {
		return super.toString() + "\nGodina proizvodnje: " + getGodinaProizvodnje();
	}
	
}
