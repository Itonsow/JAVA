import java.util.Arrays;
import java.util.Scanner;
public class ClosestP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("numTestes: ");
        int numT = input.nextInt();
        int[] n2 = new int[numT];
        for(int i = 0; i < numT; i++){
            int n1 = input.nextInt();
            int[] coleta = new int[n1];
            for(int j = 0; j < n1; j++){
                coleta[j] = input.nextInt();
            }
            Arrays.sort(coleta);
            resp(n1, coleta);
        }

        //for(int value : n2){
        //    System.out.printf("%d ", value);
        //}

    }
    public static void resp(int n, int[] lista){
        int temp = 0;
        for(int i = 0; i < n-1; i++){
            float num = lista[i] + lista[i+1];
            if(num < 0){
                num *= -1;
            }
            if(num % 2 != 0){
                System.out.printf("%.2f", num);
                temp++;
            }
        }
        if(temp == n-1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
