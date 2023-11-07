package Esercizio1;

public class Giocattolo {
    //Variabili utilizzate all'interno degli oggetti che verranno creati di tipo Giocattolo
    private int idIncrement = 1;
    private int id;
    private String nome;
    private double prezzo;
    private int etaConsigliata;

    //Costruttore della classe Giocattolo
    public Giocattolo(String nome, double prezzo, int etaConsigliata){
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
        this.id = idIncrement;
        idIncrement++;
    }

    //Metodi set che permettono di inizializzare le variabili private grazie ai metodi pubblici
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void setEtaConsigliata(int etaConsigliata) {
        this.etaConsigliata = etaConsigliata;
    }

    //Metodi che danno in output le variabili private utilizzate dagli oggetti Giocattolo
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getEtaConsigliata() {
        return etaConsigliata;
    }

}
