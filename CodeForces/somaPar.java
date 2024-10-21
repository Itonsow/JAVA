package src;
public class somaPar {
    public static void main(String[] args){
        System.out.println(getEvenDigitSum(2000));
    }
    public static int getEvenDigitSum(int num){
        int temp = num;
        int temp1;
        int soma = 0;
        if(num < 0){
            return -1;
        }
        while(temp != 0){
            temp1 = temp % 10;
            temp /= 10;
            if(temp1 % 2 == 0){
                soma += temp1;
            }
            
        }

        int resultado = soma;
        return resultado;
    }
}
