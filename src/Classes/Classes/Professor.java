package Classes;

public class Professor extends Cliente {

    public Professor(String nome, Conta conta) {
        super(nome, conta);
    }
    private String nome;
    public int matricula;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
