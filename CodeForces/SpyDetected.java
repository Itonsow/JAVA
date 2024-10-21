import java.util.Scanner;
public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vezes = sc.nextInt();
        int resultado[] = new int[vezes];
        for(int i = 0; i < vezes; i++){
            int qntNum = sc.nextInt();
            int[] num = new int[qntNum];
            for(int j = 0; j < qntNum; j++){
                num[j] = sc.nextInt();
            }
            resultado[i] = Spy(num, qntNum);
        }

        for(int i = 0; i < vezes; i++){
            System.out.printf("%d\n", resultado[i]);
        }
    }
    public static int Spy(int[] num, int qntNum){
        int n, menor = 10, index = 0;
        for(int i = 0; i < qntNum; i++){
            n = 0;
            for(int j = 0; j < qntNum; j++){
                if(i != j){
                    if(num[i] == num[j]){
                        n++;
                    }
                }
            }
            if(n < menor){
                menor = n;
                index = i+1;
            }
        }
        return index;
    }
}
