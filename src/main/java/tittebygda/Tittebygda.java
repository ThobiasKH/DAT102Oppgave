package main.java.tittebygda;

public class Tittebygda {
    static Innbygger Jonatan;

    static {
        String[] names = {
            "Jonatan", "Margrete", "Peder", "Lars", "Knut", "Ole", "Erik", "Magnus", "Sander", "Einar",
            "Harald", "Torbjørn", "Bjørn", "Sigurd", "Håkon", "Marius", "Stian", "Øystein", "Andreas", "Thomas",
            "Arne", "Sverre", "Odd", "Finn", "Jørgen", "Leif", "Kristoffer", "Fredrik", "Vegard", "Trygve",
            "Roar", "Per", "Even", "Simen", "Henrik", "Ingrid", "Kari", "Sigrid", "Solveig", "Ragnhild",
            "Marit", "Anne", "Guro", "Astrid", "Liv", "Helene", "Camilla", "Oda", "Thea",
            "Åsmund", "Bård", "Hallvard", "Jostein", "Olav", "Vidar", "Ragnar", "Espen", "Eivind", "Runar",
            "Elise", "Tonje", "Siri", "Wenche", "Malene", "Hege", "Randi", "Mona", "Berit"
        };

        Innbygger previous = new Innbygger("William", null);
        Innbygger william = previous; 

        for (int i = 1; i < names.length; i++) {
            Innbygger newPerson = new Innbygger(names[i], previous);
            previous = newPerson;
        }

        Jonatan = new Innbygger("Jonatan", previous);
        william.setSpionerer_paa(Jonatan);
    }

    // TODO Oppgave1 Implementer metode for å finne mengden tittere
    public static int tellTittere() {
        return 1;
    } 

    // TODO Oppgave 2 Implementer metode for å lage kø slik at stalkers ikkje står med kverrandre 
    public static void lagKø(SveleOgKaffiQueue queue) {
    }
     

    public static void main(String[] args) {
        // Oppgave 1
        int mengdenTittere = tellTittere();
        System.out.println("Mengden tittere: " + mengdenTittere);

        // Oppgave 2
        SveleOgKaffiQueue sveleOgKaffiKø = new SveleOgKaffiQueue(mengdenTittere);
        lagKø(sveleOgKaffiKø);
        sveleOgKaffiKø.printQueue();
    }
}
