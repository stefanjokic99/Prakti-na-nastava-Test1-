package etf.stefan;

import java.util.ArrayList;

public class ProdavnicaUredjaja {

	private String naziv;
	private String sjediste;
	private String JIB;
	private String opisDjelatnosti;
	private Boolean poreskiObveznik;
	private ArrayList<Uredjaj> uredjaji;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSjediste() {
		return sjediste;
	}
	public void setSjediste(String sjediste) {
		this.sjediste = sjediste;
	}
	public String getJIB() {
		return JIB;
	}
	public void setJIB(String JIB) {
		this.JIB = JIB;
	}
	public String getOpisDjelatnosti() {
		return opisDjelatnosti;
	}
	public void setOpisDjelatnosti(String opisDjelatnosti) {
		this.opisDjelatnosti = opisDjelatnosti;
	}
	public Boolean getPoreskiObveznik() {
		return poreskiObveznik;
	}
	public void setPoreskiObveznik(Boolean poreskiObveznik) {
		this.poreskiObveznik = poreskiObveznik;
	}
	public ArrayList<Uredjaj> getUredjaji() {
		return uredjaji;
	}
	public void setUredjaji(ArrayList<Uredjaj> uredjaji) {
		this.uredjaji = uredjaji;
	}
	
	public ProdavnicaUredjaja(String naziv, String sjediste, String JIB, String opisDjelatnosti,
			Boolean poreskiObveznik, ArrayList<Uredjaj> uredjaji) {
		super();
		this.naziv = naziv;
		this.sjediste = sjediste;
		this.JIB = JIB;
		this.opisDjelatnosti = opisDjelatnosti;
		this.poreskiObveznik = poreskiObveznik;
		this.uredjaji = uredjaji;
	}
	
	@Override
	public String toString() {
		String ispis = "Naziv prodavnice: " + getNaziv() + "\nLista uredjaja u prodavnici:\n";
		
		for (Uredjaj uredjaj : uredjaji) {
			ispis += uredjaj.toString() + "\n";
		}
		return ispis;
	}
}
