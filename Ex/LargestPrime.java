public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(171));
    }

    public static int getLargestPrime(int num){
        int primo = 0;
        if(num < 0){
            return -1;
        }else{
            for(int i = 2; i < num / 2; i++){
                if(num % i == 0 && isPrime(i)){
                    primo = i;
                }
            }
        }
        return primo;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
