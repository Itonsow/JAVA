import java.util.ArrayList;
import java.util.Scanner;
public class account1 {
    public static void main(String[] args){
        boolean menuconfirm0 = true;
        boolean menuConfirm1 = true;
        ArrayList<dados> dadosLista = new ArrayList<>();
        dadosLista.add(new dados("Sungus", 0, 1000));
        Scanner input = new Scanner(System.in);
        do{
            int menuInicial = menu0(input);
            if(menuInicial == 1){
                do{
                    menuImprime1();
                    int opcoes1 = input.nextInt();
                    input.nextLine();
                    switch(opcoes1){
                        case 1:
                            dadosLista.add(coletarDados());
                            break;
                        case 2:
                            menuImprime2(dadosLista);
                            int id = procurar(dadosLista, input);
                            if(id != -1){
                                menu2(dadosLista, id, input);
                            }
                            break;
                        case 0:
                            System.out.println("Voltando...");
                            menuConfirm1 = false;
                            break;
                    }
                }while(menuConfirm1 == true);
            }else if(menuInicial == 2){
                int id = procurar(dadosLista, input);
                System.out.println("Digite a senha: ");
                input.nextLine();
                String senhaDigitada = input.nextLine();
                int verificar = dadosLista.get(id).verSenha(senhaDigitada);
                if(verificar == 1){
                    menu2(dadosLista, id, input);
                }
            }else if(menuInicial == 0){
                menuconfirm0 = false;
            }
        }while(menuconfirm0 == true);
    }

    public static int procurar(ArrayList<dados> listaDados, Scanner input){
        System.out.println("Digite qual conta deseja acessar: ");
        int id = input.nextInt();
        for(int i = 0; i < listaDados.size(); i++){
            if(id == listaDados.get(i).getID()){
                return i;
            }else{
                System.out.println("Conta nao encontrada, voltando...");
            }
        }
        return -1;
    }
    public static int menu0(Scanner input){
        int escolha = 0;
        boolean menuConfirmG = true;
        do{
            menuEscolha();
            int opcoes0 = input.nextInt();
            input.nextLine();
            switch(opcoes0){
                case 1:
                    System.out.println("Gerente");
                    escolha = 1;
                    menuConfirmG = false;
                    break;
                case 2:
                    System.out.println("Cliente");
                    escolha = 2;
                    menuConfirmG = false;
                    break;
                default:
                    break;
            }
        }while(menuConfirmG == true);

        return escolha;
    }

    public static dados coletarDados(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.printf("ID: ");
        int id = sc.nextInt();
        System.out.printf("Limite: R$");
        double limite = sc.nextDouble();
        return new dados(nome, id, limite);
    }

    public static void saldoImprime(ArrayList<dados> listaDados, int id){
        System.out.println("\n-===================-");
        System.out.printf("  %s saldo: R$%.2f\n", listaDados.get(id).getNome(), listaDados.get(id).getSaldo());
        System.out.println("\n-===================-");
    }

    public static void menuImprime1(){
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("[1] - Adicionar conta");
        System.out.println("[2] - Acessar conta");
        System.out.println("[0] - Sair");
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-\n");
    }

    public static void menuImprime2(ArrayList<dados> listaDados){
        for(dados Dados : listaDados){
            Dados.imprimeDados();
        }
    }

    public static void menu2(ArrayList<dados> dadosLista, int id, Scanner input){
        boolean menuConfirm2 = true;
        do {
            menuImprime3();
            int opcoes2 = input.nextInt();
            input.nextLine();
            switch(opcoes2){
                case 1:
                    saldoImprime(dadosLista, id);
                    break;
                case 2:
                    System.out.printf("Quanto quer depositar: R$");
                    double depositarSaldo = input.nextDouble();
                    System.out.printf("+%.2f\n", depositarSaldo);
                    dadosLista.get(id).depositar(depositarSaldo);
                    break;
                case 3:
                    System.out.printf("Quanto quer retirar: R$");
                    double retirarSaldo = input.nextDouble();
                    System.out.printf("-%.2f\n", retirarSaldo);
                    dadosLista.get(id).withdraw(retirarSaldo);
                    break;
                case 4:
                    System.out.printf("Digite a senha antiga: ");
                    String senhaAntiga = input.nextLine();
                    System.out.printf("Digite a senha nova: ");
                    String senhaNova = input.nextLine();
                    dadosLista.get(id).mudarSenha(senhaAntiga, senhaNova);
                    break;
                case 0:
                    System.out.println("Voltando...");
                    menuConfirm2 = false;
                    break;
            }
        } while(menuConfirm2 == true);    
    }

    public static void menuImprime3(){
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("[1] - Ver saldo");
        System.out.println("[2] - Depositar");
        System.out.println("[3] - Retirar");
        System.out.println("[4] - Mudar Senha");
        System.out.println("[0] - Voltar");
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-\n");
    }

    public static void menuEscolha(){
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("[1] Gerente");
        System.out.println("[2] Cliente");
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-\n");
    }
}
