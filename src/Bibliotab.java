public class Bibliotab extends Bibliotheque {

	private Ouvrage[] tab;
	private int c;

	public Bibliotab(int n){
		this.tab = new Ouvrage[n];
		this.c = 0;
	}
	public Bibliotab(){
		this.tab = new Livre[10];
	}

	@Override
	public String toString() {
		String res = "Nb: "+ c +"\n";
		for (int i = 0; i < c; i++) {
			res += tab[i].toString() + "\n";
		}
		return res;
	}

	public void add(Ouvrage o) {
			if (c < tab.length) {
				tab[c] = o;
				c++;
			}
		}

	public void del(int cote) {
		int pos = 0;
		while (pos < c && tab[pos].getCote() != cote){
			++pos;
		}
		while (pos < c - 1){
			tab[pos] = tab[pos+1];
			pos++;
		}
		c --;
	}
}

		



		
		
			


	
