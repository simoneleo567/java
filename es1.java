package esame;

public class es1 {

    static class Studente {
        String nome;
        String cognome;
        int annoNascita;

        public Studente(String nome, String cognome, int annoNascita) {
            this.nome = nome;
            this.cognome = cognome;
            this.annoNascita = annoNascita;
        }

        public void stampaScheda() {
            System.out.println(nome + " " + cognome + ", nato nel " + annoNascita);
        }
    }

    public static void main(String[] args) {
        Studente s1 = new Studente("Mario", "Rossi", 2004);
        Studente s2 = new Studente("Luisa", "Bianchi", 2005);

        s1.stampaScheda();
        s2.stampaScheda();
    }
}

