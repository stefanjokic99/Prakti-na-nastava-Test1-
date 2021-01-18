package etf.stefan;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicijalizacija2002{

	public static ProdavnicaUredjaja prodavnica;
	public static Serviser serviser = new Serviser();
	
	public static void Meni() {
		
		int opcija;
		ArrayList<Uredjaj> uredjaji = new ArrayList<Uredjaj>();
		uredjaji.add(new Telefon("A4", "Samsung", "13579", StanjeUredjaja.OK, TipUredjaja.MOBILNI_UREDJAJ, null, 5000, 2006));
		uredjaji.add(new Telefon("A7", "Samsung", "1113579", StanjeUredjaja.POKVAREN, TipUredjaja.MOBILNI_UREDJAJ, null, 5000, 2009));
		uredjaji.add(new Telefon("J6", "Samsung", "134579", StanjeUredjaja.OK, TipUredjaja.MOBILNI_UREDJAJ, null, 5000, 1996));
	
		prodavnica = new ProdavnicaUredjaja("MTEL", "Banja Luka", "123456789", "Telekomunikacijske usluge", false, uredjaji);
		
		Korisnik korisnik = new Korisnik("Stefan", "Jokic", "26.08.1999", "Bratunac", new ArrayList<Uredjaj>());
		Scanner sc = new Scanner(System.in);
	
		while(true)
		{
			System.out.println("Spisak uredjaja koje posjedujem: ");
			
			for (Uredjaj uredjaj : korisnik.getUredjaji()) {
				System.out.println(uredjaj.toString());
			}
			
			System.out.print("\nIzaberi opcije:\n1. Kupi uredjaj\n2. Predaj servisu\n0. Izlaz iz programa\nIzaberi: ");
			
			opcija = sc.nextInt();
			
			switch(opcija){
				
				case 1:
					// Stavljeno je mobilni uredjaj jer smo samo te unijeli
					// inace se moze praviti izbor
					korisnik.KupiUredjaj(prodavnica, TipUredjaja.MOBILNI_UREDJAJ);
					break;
				case 2: 
					korisnik.PredajServiseru(serviser);
					break;
				case 0:
					sc.close();
					return;
			}
		
		}
	}
}
