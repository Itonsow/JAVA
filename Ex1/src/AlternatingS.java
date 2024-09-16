
import java.util.Scanner;

public class AlternatingS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int cnt = sc.nextInt();
        int[] resposta = new int[cnt];
        for(int j = 0; j < cnt; j++){
            int cnt1 = sc.nextInt();
            int[] lst = new int[cnt1];
            for(int i = 0; i < cnt1; i++){
                lst[i] = sc.nextInt();
            }
            resposta[j] = retornaSoma(lst, cnt1);
        }
        for(int i = 0; i < cnt; i++){
            System.out.printf("%d\n", resposta[i]);
        }
    }

    public static int retornaSoma(int[] lst, int cnt1){
        int temp = 0;
        int soma = 0;
        for(int i = 0; i < cnt1; i++){
            if(temp == 0){
                soma += lst[i];
                temp = 1;
            }else{
                soma -= lst[i];
                temp = 0;
            }
        }
        return soma;
    }
}
