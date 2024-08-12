public class hasSameLastDigit {
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(9, 99, 19));
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if(n1 < 10 || n1 > 1000 || n2 < 10 || n2 > 1000 || n3 < 10 || n3 > 1000){
            return false;
        }
        if(n1 % 10 == n2 % 10 || n1 % 10 == n3 % 10 || n2 % 10 == n3 % 10){
            return true;
        }
        return false;
    }
    public static boolean isValid(int num){
        if(num >= 10 && num <= 1000){
            return true;
        }
        return false;
    }
}
