import java.util.ArrayList;

public class BiblioList extends Bibliotheque{
    ArrayList<Ouvrage> tab = new ArrayList<Ouvrage>();

    private int c;

    public BiblioList() {
        this.c = 0;
    }

    public void add(Ouvrage list){
        tab.add(list);
    }

    public void del(int cote){
        tab.remove(cote);
    }

    public String toString(){
        int taille_tab = tab.toArray().length;
        String res = "Nb: " + taille_tab + "\n";
        for (int i = 0; i < taille_tab; i++) {
            res += (tab.get(i)).toString() + "\n";
        }
        return res;
    }
}
