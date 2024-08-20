package src;
public class hasSharedDigite {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(11,21));
    }
    public static boolean hasSharedDigit(int numero1, int numero2){
        if(numero1 % 10 == numero2 % 10){
            return true;
        }
        return false;
    }
}
