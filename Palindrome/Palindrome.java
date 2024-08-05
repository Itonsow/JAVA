public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("123321"));
    }
    public static boolean isPalindrome(String num1){
        int tamString = num1.length();
        for(int i = 0; i < tamString/2; i++){
            if(num1.charAt(i) != num1.charAt(tamString - i - 1)){
                return false;
            }
        }
        return true;
    }
}
