package eventos.dominio;

/* Exemplo:
   public class Jogo {
   String nome;
   String data_lancamento;
   int preco;
   } */

// A classe é um molde, lembra o struct do C!
public class Evento {
//aqui dentro tem os atributos, as caracteristicas do objeto
    String nome;
    String data;
    String local;
    int capacidade;
    //método: comportamento/funções dos objetos
    public String resumo() {
        return nome + " (" + local + ") até " + capacidade + " vagas";    }

public Evento (String nome, String data, String local, int capacidade){
    this.nome = nome;
    this.data = data;
    this.local = local;
    this.capacidade = capacidade;
}
/*     public Evento (String nome, int capacidade) {
        this.nome = nome;
        this.local = "A definir";
        this.data = "A definir";
        this.capacidade = capacidade;
    } */
}
