package src;
public class PerfectNumber {
    public static void main(String[] args){
        System.out.println(isPerfectNumber(7));
    }
    public static boolean isPerfectNumber(int num1){
        if(num1 < 1){
            return false;
        }
        int soma = 0;
        for(int i = 1; i < num1; i++){
            if(num1 % i == 0){
                soma += i;
            }
        }
        if(soma == num1){
            return true;
        }
        return false;
    }
}
