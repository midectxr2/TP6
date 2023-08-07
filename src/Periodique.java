public class Periodique extends Ouvrage{
    private String nom;

    private int numero;

    private int periodicite;

    public Periodique(String nom, int numero, int periodicite, int date_emprunt){
        super(date_emprunt);
        this.nom = nom;
        this.numero = numero;
        this.periodicite = periodicite;
    }

    public String toString(){
        return nom + " " + numero + " " + periodicite;
    }


}
