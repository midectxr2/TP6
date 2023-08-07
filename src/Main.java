public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Pablo", "Quoicoubeuh", "Scobar", 10032002);
        Livre livre2 = new Livre("Pablo2", "Scobar2", "Scabar", 11032002);
        Livre livre3 = new Livre("pablo3", "Scobar3", "Scibar", 12032002);
        BiblioList biblio1 = new BiblioList();
        biblio1.add(livre1);
        biblio1.add(livre2);
        biblio1.add(livre3);
        String s= biblio1.toString();
        System.out.println(s);
    }
}