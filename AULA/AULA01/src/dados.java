import java.time.LocalDateTime;
public class dados {
    private String nome;
    private double saldo = 0;
    private String senha = "0000";
    private int idConta;
    private double limite;
    private Date openingDate;

    public dados(){
    }

    public dados(String nome, int idConta, double limite){
        this.nome = nome;
        this.idConta = idConta;
        this.limite = limite;
        LocalDateTime now = LocalDateTime.now();
        this.openingDate = new Date(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
    }

    public int verSenha(String senhaVer){
        if(senhaVer.equals(senha)){
            return 1;
        }else{
            return 0;
        }
    }

    public Date getDate(){
        return openingDate;
    }

    public void withdraw(double retirarD){
        if(saldo + limite >= retirarD){
            this.saldo -= retirarD;
        }else{
            System.out.println("\nVoce nao tem dinheiro suficiente\n");
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

    public int getID(){
        return idConta;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void mudarSenha(String oldPass, String newPass){
        if(oldPass.equals(senha)){
            senha = newPass;
            System.out.println("\nRealizada a alteracao!\n");
        }else{
            System.out.println("\nAcao nao realizada, senha invalida!\n");
        }
    }

    public void imprimeDados(){
        System.out.printf("%s - ", openingDate.imprimeStr());
        System.out.printf("[%d] --- Nome: %s --- Limite: R$%.2f\n", idConta, nome, limite);
    }
}
