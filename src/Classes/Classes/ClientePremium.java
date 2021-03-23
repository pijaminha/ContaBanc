package Classes;

public class ClientePremium extends Cliente{

    public ClientePremium(String nome, Conta conta) {
        super(nome, conta);
        //TODO Auto-generated constructor stub
    }

    private double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
        this.conta.setLimiteCredito(limiteCredito);
        
    }
}
