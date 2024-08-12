public class NumberToWords {
    public static void main(String[] args){
        System.out.println(getDigitCount(1121));
    }
    public static int getDigitCount(int num1){
        if(num1 < 0){
            return -1;
        }
        int temp = 0;
        int temp1 = num1;
        int contagem = 0;
        while(temp1 > 0){
            temp = temp1 % 10;
            temp1 /= 10;
            contagem++;
        }
        return contagem;
    }
    public static int reverse(int num1){
        int numInverso = 0;
        int contagem = getDigitCount(num1);
        for(int i = 0; i < contagem; i++){
            numInverso = 
        }
    }
}
