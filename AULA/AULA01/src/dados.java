public class dados {
    private String nome;
    private double saldo;

    public dados(String nome, double saldo){
        this.nome = nome;
        if(saldo > 0){
            this.saldo = saldo;
        }
    }

    public void depositar(double depositarSaldo){
        if(depositarSaldo > 0){
            saldo += depositarSaldo;
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }
}
