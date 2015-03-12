package iterfejs;

import java.util.LinkedList;

import Biblioteka.Autor;
import Biblioteka.Knjige;

public interface BibliotekaInterfejs {

	
	public void dodajKnjigu(Knjige knjiga);
	public void obrisiKnjigu (Knjige knjiga);
	public LinkedList<Knjige> pronadjiKnjigu(String naslov,long ISBN, String izdavac,Autor autori);


}
