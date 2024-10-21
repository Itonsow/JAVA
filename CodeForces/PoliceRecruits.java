import java.util.Scanner;
public class PoliceRecruits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int[] l2 = new int[l1];
        for(int i = 0; i < l1; i++){
            l2[i] = sc.nextInt();
        }
        RetornaInt(l2, l1);
    }
    public static void RetornaInt(int[] l2, int l1){
        int numP = 0, temp1 = 0;
        for(int i = 0; i < l1; i++){
            if(i == 0){
                if(l2[i] < 0){
                    temp1++;
                }else{
                    numP += l2[i];
                }
            }else{
                if(l2[i] > 0){
                    numP += l2[i];
                }else{
                    if(numP > 0 && numP > l2[i]){
                        numP += l2[i];
                    }else{
                        temp1++;
                        numP = 0;
                    }
                }
            }
            
        }
        System.out.printf("%d", temp1);
    }
}
