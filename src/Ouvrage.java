public abstract class Ouvrage {
    protected int date_emprunt;
    protected static int cote_courante = 0;
    protected int cote;
    public Ouvrage(int date_emprunt){
        this.date_emprunt = date_emprunt;
        cote_courante = cote_courante + 1;
    }

    public Ouvrage(){
        this(0);
        cote = cote + 1;
    }

    public abstract String toString();

    public int getCote(){
        return cote;
    }

    public int setCote(int i){
        cote = i;
        return cote;
    }
}