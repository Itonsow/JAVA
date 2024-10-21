
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int[] res = new int[i1];
        for(int i2 = 0; i2 < i1; i2++){
            int j1 = sc.nextInt();
            int j2 = sc.nextInt();
            int k = sc.nextInt();
            //res[i2] = ver(j1, j2);
            ver(j1, j2, k);
        }
    }

    public static void ver(int i1, int j1, int k){
        int[][] linha = new int[i1][j1];
        int[][] coluna = new int[i1][j1];
        for(int i = 0; i < i1; i++){
            for(int j = 0; j < j1; j++){
                linha[i][j] = i;
                coluna[i][j] = j;
            }
        }
        int p = 0;
        for(int i = i1; i > 0; i--){
            for(int j = j1; j > 0; j--){
                if(linha[i][j] - linha[i][p] > k){
                    
                }
            }
            System.out.println();
        }
    }
}
