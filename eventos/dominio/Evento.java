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
    private String nome;
    private String data;
    private String local;
    private int capacidade;
    private int inscritos = 0;

    //método: comportamento/funções dos objetos
    public String resumo() {
        return nome + " (" + local + ") até " + capacidade + " vagas";    }

public Evento (String nome, String data, String local, int capacidade){
    this.nome = nome;
    this.data = data;
    this.local = local;
    setCapacidade(capacidade);
}

public void setCapacidade(int capacidade) {
    if (capacidade <=0) {
        //Usar isso é muito mais seguro do que apenas imprimir uma mensagem com 
        // System.out.println. O println avisaria do erro, mas deixaria o programa
        // continuar e o objeto ficaria com um valor incorreto. O throw garante que
        // o programa não aceite a erro.
        throw new IllegalArgumentException("capacidade dever ser maior que 0");
    }
    this.capacidade = capacidade;
}
public int getCapacidade() { return capacidade; }

public void setNome (String nome) {
    this.nome = nome;
}

public String getNome() { return nome;}

public void setData(String data) {
    this.data = data;
}

public String getData() {
    return data;
}

public void setLocal(String local) {
    this.local = local;
}

public String getLocal() {
    return local;
}

public boolean inscrever() {
    if (inscritos >= capacidade) return false;
    inscritos++;
    return true;
}
}
