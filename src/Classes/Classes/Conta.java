package Classes;

public class Conta {
    private TipoOperacao operacao;
    private double valorOperacao;
    private double saldo;

//#region
    public double getValorOperacao() {
    return valorOperacao;
    }
    public TipoOperacao getOperacao() {
        return operacao;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//#endregion
    
public void realizaOperação(TipoOperacao operacao, double valor) {
    this.operacao = operacao;
    this.valorOperacao = valor;

    if (operacao == TipoOperacao.SAQUE) {
        if (valor <= saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso");
        } else
            System.out.println("Não há saldo suficiente para realizar o saque");

    }else 
        if (operacao == TipoOperacao.DEPOSITO) {
            this.saldo = this.saldo + valor;
            System.out.println("Depósito realizado com sucesso");
        }
        System.out.println("o saldo atual é: R$" + this.saldo);
    }


}



