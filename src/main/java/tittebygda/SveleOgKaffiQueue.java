package main.java.tittebygda;

public class SveleOgKaffiQueue {
    public Innbygger[] queue;
    public int folkIKøen, kapasitet;

    public SveleOgKaffiQueue(int capacity) {
        this.kapasitet = capacity;
        this.queue = new Innbygger[capacity];
        this.folkIKøen = 0;
    }

    public boolean erFull() {
        return folkIKøen == kapasitet;
    }

    public boolean erTom() {
        return folkIKøen == 0;
    }

    public void leggTilIKø(Innbygger person) {
        if (erFull()) {
            System.out.println("Køen er full husk å legge inn riktig størrelse for køen, som du fant i oppgave 1!");
            return;
        }
        
        queue[folkIKøen++] = person;
    }

    public void printQueue() {
        if (erTom()) {
            System.out.println("Køen er tom!");
            return;
        }

        System.out.println("Kø:");
        int i = 0;
        while (i < folkIKøen - 1) {
            System.out.print(queue[i].getNavn() + "->");
            i = (i + 1) % kapasitet;
        }
        System.out.print(queue[folkIKøen - 1].getNavn());
    }

}
