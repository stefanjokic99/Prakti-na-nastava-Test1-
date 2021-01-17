package etf.stefan;

import java.util.ArrayList;

public class Serviser implements iServiser {

	private ArrayList<Uredjaj> pokvareniUredjaji = new ArrayList<Uredjaj>();

	public ArrayList<Uredjaj> getPokvareniUredjaji() {
		return pokvareniUredjaji;
	}
	public void setPokvareniUredjaji(ArrayList<Uredjaj> pokvareniUredjaji) {
		this.pokvareniUredjaji = pokvareniUredjaji;
	}
	
	@Override
	public String toString() {
		
		String ispis = "Lista uredjaja na servisu:\n";
		
		for (Uredjaj uredjaj : pokvareniUredjaji) {
			
			ispis += uredjaj.toString();
		}
		
		return ispis;
	}
	@Override
	public void Servis(Uredjaj uredjaj) {
		uredjaj.setStanjeUredjaja(StanjeUredjaja.OK);
		uredjaj.getKorisnik().getUredjaji().add(uredjaj);
		pokvareniUredjaji.remove(uredjaj);
		ObavijestiKorisnika(uredjaj);
	}
	@Override
	public void ObavijestiKorisnika(Uredjaj uredjaj) {
		System.out.println(uredjaj.toString() + " JE SERVISIRAN!!!");
	}
}
