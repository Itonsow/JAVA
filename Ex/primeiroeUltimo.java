public class primeiroeUltimo {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(88, 71));
    }
    public static boolean hasSharedDigit(int n1, int n2){
        if(n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99){
            return false;
        }
        int primeiroDigiton1 = 0;
        int n10 = n1;
        while(n10 > 0){
            primeiroDigiton1 = n10 % 10;
            n10 /= 10;
        }
        int primeiroDigiton2 = 0;
        int n20 = n2;
        while(n20 > 0){
            primeiroDigiton2 = n20 % 10;
            n20 /= 10;
        }
        if(primeiroDigiton1 == primeiroDigiton2 || primeiroDigiton1 == n2 % 10 || n1 % 10 == primeiroDigiton2 || n1 % 10 == n2 % 10){
            return true;
        }else{
            return false;
        }
    }
}
