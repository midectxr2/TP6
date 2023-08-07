public class Livre extends Ouvrage{
    private String auteur;
    private String titre;
    private String editeur;
    public Livre(String auteur, String titre, String editeur, int date_emprunt){
        super(date_emprunt);
        this.auteur =auteur;
        this.titre = titre;
        this.editeur = editeur;
    }

    public String toString(){
        return date_emprunt + this.editeur + " " + this.auteur + " " + this.titre;
    }
}
