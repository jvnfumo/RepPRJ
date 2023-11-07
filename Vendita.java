package Esercizio1;

public class Vendita {
    //Variabili utilizzate all'interno degli oggetti che verranno creati di tipo Vendita
    private Giocattolo giocattolo;
    private Cliente cliente;

    //Costruttore della classe Vendita
    public Vendita(Giocattolo giocattolo, Cliente cliente) {
        this.giocattolo = giocattolo;
        this.cliente = cliente;
    }

    //Metodi set che permettono di inizializzare le variabili private grazie ai metodi pubblici
    public void setGiocattolo(Giocattolo giocattolo) {
        this.giocattolo = giocattolo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Metodi che danno in output le variabili private utilizzate dagli oggetti Vendita
    public Giocattolo getGiocattolo() {
        return giocattolo;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
