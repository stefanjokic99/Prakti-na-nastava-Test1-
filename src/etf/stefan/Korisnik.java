package etf.stefan;

import java.util.ArrayList;
import java.util.Scanner;

public class Korisnik implements iKorisnik {
	
	private String ime;
	private String prezime;
	private String datumRodjenja;
	private String mjestoPrebivalista;
	private ArrayList<Uredjaj> uredjaji;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public String getMjestoPrebivalista() {
		return mjestoPrebivalista;
	}
	public void setMjestoPrebivalista(String mjestoPrebivalista) {
		this.mjestoPrebivalista = mjestoPrebivalista;
	}
	public ArrayList<Uredjaj> getUredjaji() {
		return uredjaji;
	}
	public void setUredjaji(ArrayList<Uredjaj> uredjaji) {
		this.uredjaji = uredjaji;
	}
	
	public Korisnik(String ime, String prezime, String datumRodjenja, String mjestoPrebivalista,
			ArrayList<Uredjaj> uredjaji) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.mjestoPrebivalista = mjestoPrebivalista;
		this.uredjaji = uredjaji;
	}
	
	@Override
	public String toString() {
		String ispis = "Ime i prezime: " + getIme() + " " + getPrezime() + "\nLista korisnikovih uredjaja:\n";
		
		for (Uredjaj uredjaj : uredjaji) {
			ispis += uredjaj.toString() + "\n";
		}
		
		return ispis;
	}
	@Override
	public void KupiUredjaj(ProdavnicaUredjaja prodavnica, TipUredjaja tipUredjaja) {
		int rbrUredjaja = 0;
		int broj = 0;
		
		System.out.println("Uredjaji tog tipa iz prodavnice:");
		
		
		for (Uredjaj uredjaj : prodavnica.getUredjaji()) {
			if(uredjaj.getTipUredjaja() == tipUredjaja)	{
				System.out.println(++rbrUredjaja + uredjaj.toString());
			}
		}
		System.out.print("Izaberite uredjaj: ");
		
		Scanner sc = new Scanner(System.in);
		
		rbrUredjaja = sc.nextInt();
		sc.nextLine();
		
		for (Uredjaj uredjaj : prodavnica.getUredjaji()) {
			if(uredjaj.getTipUredjaja() == tipUredjaja)
			{
				broj++; 
				if(broj == rbrUredjaja)
				{
					uredjaji.add(uredjaj);
					uredjaj.setKorisnik(this);
					prodavnica.getUredjaji().remove(uredjaj);
					break;
				}
			}
		}
		
		System.out.println("Uredjaj kupljen");
		sc.close();
	}
	@Override
	public void PredajServiseru(Serviser serviser) {
		int rbrUredjaja = 0;
		int broj = 0;
		
		System.out.println("Pokvareni uredjaji: ");
		
		
		for (Uredjaj uredjaj : uredjaji) {
			if(uredjaj.getStanjeUredjaja() == StanjeUredjaja.POKVAREN)	{
				System.out.println(++rbrUredjaja + uredjaj.toString());
			}
		}
		System.out.print("Izaberite uredjaj: ");
		
		Scanner sc = new Scanner(System.in);
		
		rbrUredjaja = sc.nextInt();
		
		for (Uredjaj uredjaj : uredjaji) {
			if(uredjaj.getStanjeUredjaja() == StanjeUredjaja.POKVAREN)
			{
				broj++; 
				if(broj == rbrUredjaja)
				{
					serviser.getPokvareniUredjaji().add(uredjaj);
					uredjaji.remove(uredjaj);
					break;
				}
			}
		}
		
		System.out.println("Uredjaj poslat na servisiranje...");
		sc.close();
		
	}
	
}
blaaaaa
