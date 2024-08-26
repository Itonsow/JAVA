import java.util.Scanner;
public class Coins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        moeda(n1, n2);
    }

    public static void moeda(int n, int s){
        int i = 0;
        int tempS = s - n;
        int tempSub = 0;
        int cont = 0;
        while(n * i < s){
            i++;
        }
        tempSub = n - (n * i - s);
        


        System.out.printf("%d", tempSub);
    }
}
