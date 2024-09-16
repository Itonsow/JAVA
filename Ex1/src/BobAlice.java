
import java.util.Scanner;

public class BobAlice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] armaz = new int[i];
        for(int j = 0; j < i; j++){
            int k = sc.nextInt();
            int[] l = new int[k];
            for(int m = 0; m < k; m++){
                l[m] = sc.nextInt();
            }
            int[] l1 = new int[k];
            for(int m1 = 0; m1 < k; m1++){
                l1[m1] = sc.nextInt();
            }
            armaz[j] = resultado(l, l1, k);
        }
    }

    public static int resultado(int[] lst, int[] lst1, int qnt){
        int inic = 0;
        int fim = qnt;
        for(int i = 0; i < qnt; i++){
            if(lst[inic] != lst1[inic]){
                inic += 1;
                if(lst[inic-1] == lst1[inic]){
                    inic += 1;
                    lst[inic] = 0;
                }else{
                    
                }
            }else{
                fim -= 1;

            }
        }
        return 0;
    }
}
