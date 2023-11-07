package Esercizio1;

public class Cliente {
    //Variabili utilizzate all'interno degli oggetti che verranno creati di tipo Cliente
    private int idIncrement = 1;
    private int id;
    private String nome;
    private String email;

    //Costruttore della classe Cliente
    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
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

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodi che danno in output le variabili private utilizzate dagli oggetti Giocattolo
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    
}
