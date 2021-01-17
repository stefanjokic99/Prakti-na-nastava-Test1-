package etf.stefan;

public class Tablet extends Uredjaj{

	private float dimenzija;
	private int godinaProizvodnje;
	
	public float getDimenzija() {
		return dimenzija;
	}
	public void setDimenzija(float dimenzija) {
		this.dimenzija = dimenzija;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	
	public Tablet(String naziv, String proizvodjac, String JIB, StanjeUredjaja stanjeUredjaja, TipUredjaja tipUredjaja,
			Korisnik korisnik, float dimenzija, int godinaProizvodnje) {
		super(naziv, proizvodjac, JIB, stanjeUredjaja, tipUredjaja, korisnik);
		this.dimenzija = dimenzija;
		this.godinaProizvodnje = godinaProizvodnje;
	} 
	
	@Override
	public String toString() {
		return super.toString() + "\nDijagonala: " + getDimenzija();
	}
}
