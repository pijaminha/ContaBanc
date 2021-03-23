package Classes;

public class Funcionario extends Cliente {

    public Funcionario(String nome, Conta conta) {
        super(nome, conta);
    }
    private String nome;
    public String empresa;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
     
}
