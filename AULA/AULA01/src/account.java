import java.util.Scanner;
public class account {
    public static void main(String[] args){
        // int[] inteiro = new inteiro[12] --> o [] eh ponteiro
        dados dados1 = new dados("s", 10);
        System.out.printf("%s saldo: %.2f\n", dados1.getNome(), dados1.getSaldo());
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite quanto quer depositar: R$");
        double depositarSaldo = input.nextDouble();
        System.out.printf("+%.2f\n", depositarSaldo);
        dados1.depositar(depositarSaldo);
        System.out.printf("%s saldo: %.2f\n", dados1.getNome(), dados1.getSaldo());
    }
}
