package src;
public class NumberPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(-222));
    }
    public static boolean isPalindrome(int num1){
        
        int reverso = 0;
        int numeroOriginal = num1;
        while(numeroOriginal != 0){
            reverso = reverso * 10 + numeroOriginal % 10;
            numeroOriginal /= 10;
        }
        return reverso == num1;
    }
}
