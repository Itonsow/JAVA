import java.util.Scanner;
public class account {
    public static void main(String[] args){
        // int[] inteiro = new inteiro[12] --> o [] eh ponteiro
        boolean menuConfirm = true;
        dados dados1 = new dados("s", 1, 1000);
        //System.out.printf("%s saldo: %.2f\n", dados1.getNome(), dados1.getSaldo());
        Scanner input = new Scanner(System.in);
        do { 
            menuImprime();
            int opcoes = input.nextInt();
            input.nextLine();
            switch(opcoes){
                case 1:
                    saldoImprime(dados1.getNome(), dados1.getSaldo());
                    break;
                case 2:
                    System.out.printf("Quanto quer depositar: R$");
                    double depositarSaldo = input.nextDouble();
                    System.out.printf("+%.2f\n", depositarSaldo);
                    dados1.depositar(depositarSaldo);
                    break;
                case 3:
                    System.out.printf("Quanto quer retirar: R$");
                    double retirarSaldo = input.nextDouble();
                    System.out.printf("-%.2f\n", retirarSaldo);
                    dados1.withdraw(retirarSaldo);
                    break;
                case 4:
                    System.out.printf("Digite a senha antiga: ");
                    String senhaAntiga = input.nextLine();
                    System.out.printf("Digite a senha nova: ");
                    String senhaNova = input.nextLine();
                    dados1.mudarSenha(senhaAntiga, senhaNova);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    menuConfirm = false;
                    break;
            }
        } while(menuConfirm == true);
        //System.out.printf("Digite quanto quer depositar: R$");
        //double depositarSaldo = input.nextDouble();
        //System.out.printf("+%.2f\n", depositarSaldo);
        //dados1.depositar(depositarSaldo);
        //saldoImprime(dados1.getNome(), dados1.getSaldo());
        //System.out.printf("Digite o quanto quer retirar: R$");
        //double retirarSaldo = input.nextDouble();
        //dados1.withdraw(retirarSaldo);
        //saldoImprime(dados1.getNome(), dados1.getSaldo());
        
    }

    public static void saldoImprime(String nome, double saldo){
        System.out.println("\n-===================-");
        System.out.printf("  %s saldo: R$%.2f\n", nome, saldo);
        System.out.println("\n-===================-");
    }

    public static void menuImprime(){
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("[1] - Ver saldo");
        System.out.println("[2] - Depositar");
        System.out.println("[3] - Retirar");
        System.out.println("[4] - Mudar Senha");
        System.out.println("[0] - Sair");
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-\n");
    }
}
