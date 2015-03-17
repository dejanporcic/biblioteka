package Biblioteka;

import java.util.LinkedList;

import iterfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList<Knjige> knjige = new LinkedList<Knjige>();
	
	@Override
	public void dodajKnjigu(Knjige knjiga) {
		// TODO Auto-generated method stub
		if(knjiga==null)
			throw new RuntimeException ("Knjiga ne sme biti null");
		
		if (knjige.contains(knjiga))
			throw new RuntimeException ("Knjiga je vec u biblioteci");
		
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjige knjiga) {

		if (!knjige.contains(knjiga))
			throw new RuntimeException ("Knjiga nije u biblioteci");

		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjige> pronadjiKnjigu(String naslov, long ISBN,
			String izdavac, Autor autori) {
		LinkedList<Knjige> rezultat = 
				new LinkedList<Knjige>();
		
		if (naslov==null && ISBN<=0 && izdavac==null && autori==null) 
				throw new RuntimeException ("Morate uneti neki kriterijum");
		
		if (ISBN>0)
			for (int i=0; i<knjige.size(); i++)
				if (knjige.get(i).getISBN()==ISBN)
					rezultat.add(knjige.get(i));
						
		return rezultat;
	}

}
