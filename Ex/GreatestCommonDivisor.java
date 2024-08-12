public class GreatestCommonDivisor {
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(100,120));
    }
    public static int getGreatestCommonDivisor(int num1, int num2){
        if(num1 < 10 || num2 < 10){
            return -1;
        }
        int maior = 0;
        for(int i = 1; i <= num1; i++){
            if(num1 % i == 0 && num2 % i == 0){
                maior = i;
            }
        }
        return maior;
    }
}
