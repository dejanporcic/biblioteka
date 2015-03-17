package Biblioteka;

import java.util.LinkedList;

import iterfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList<Knjige> knjige = new LinkedList<Knjige>();
	
	@Override
	public void dodajKnjigu(Knjige knjiga) {
		// TODO Auto-generated method stub
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjige knjiga) {
		// TODO Auto-generated method stub
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjige> pronadjiKnjigu(String naslov, long ISBN,
			String izdavac, Autor autori) {
		LinkedList<Knjige> rezultat = 
				new LinkedList<Knjige>();
		
		if (ISBN>0)
			for (int i=0; i<knjige.size(); i++)
				if (knjige.get(i).getISBN()==ISBN)
					rezultat.add(knjige.get(i));
						
		return rezultat;
	}

}
