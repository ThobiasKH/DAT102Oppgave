package main.java.tittebygda;

public class Innbygger {
    private String navn;
    private Innbygger spionerer_paa;

    public Innbygger(String navn, Innbygger spionerer_paa) {
        this.navn = navn; 
        this.spionerer_paa = spionerer_paa;
    }

    public String getNavn() {
        return navn; 
    }

    // Returnerer personen som Innbyggeren spionerer på
    public Innbygger getSpionerer_paa() {
        return spionerer_paa;
    }

    public void setSpionerer_paa(Innbygger person) {
        this.spionerer_paa = person;
    }

     
}
