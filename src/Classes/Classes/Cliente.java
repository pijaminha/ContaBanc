package Classes;

public class Cliente {
    protected String nome;
    protected String cpf;
    protected Conta conta;
    protected double valor;

    //#region
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    //#endregion

    public Cliente(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }
    public void depositar(double valor) {
        this.conta.realizaOperação(TipoOperacao.DEPOSITO, valor);
    }
    public void sacar (double valor) {
        this.conta.realizaOperação(TipoOperacao.SAQUE, valor);
    }
    public void exibeSaldo() {
        this.conta.realizaOperação(TipoOperacao.DEPOSITO, valor);
    }
}
