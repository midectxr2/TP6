public class CD extends Ouvrage{
    private String titre;
    private String auteur;

    public CD(String titre, String auteur, int date_emprunt){
        super(date_emprunt);
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString(){
        return " " + titre + " " + auteur;
    }
}
