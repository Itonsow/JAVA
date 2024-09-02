
import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c;
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 1){
            if(b == 2){
                c = 3;
            }else{
                c = 2;
            }
        }else if(a == 2){
            if(b == 1){
                c = 3;
            }else{
                c = 1;
            }
        }else{
            if(b == 2){
                c = 1;
            }else{
                c = 2;
            }
        }

        System.out.printf("%d", c);
    }
}
