package src;
public class NumberToWords {
    public static void main(String[] args){
        System.out.println(getDigitCount(-2));
        System.out.println(reverse(-2));
        numberToWords(123);
    }
    public static int getDigitCount(int num1){
        if(num1 < 0){
            return -1;
        }
        int temp1 = num1;
        int contagem = 0;
        if(num1 == 0){
            contagem = 1;
        }
        while(temp1 > 0){
            temp1 /= 10;
            contagem++;
        }
        return contagem;
    }
    public static int reverse(int num1){
        int numTemp;
        int negativo = 0;
        if(num1 < 0){
            numTemp = num1 * -1;
            negativo = 1;
        }else{
            numTemp = num1;
        }
        int temp1;
        int temp2 = 0;
        int contagem = getDigitCount(numTemp);
        for(int i = 0; i < contagem; i++){
            temp1 = numTemp % 10;
            temp2 = temp2 * 10 + temp1;
            numTemp /= 10;
        }
        if(negativo == 1){
            temp2 *= -1;
        }
        return temp2;
    }

    public static void numberToWords(int num1){
        int contagem = getDigitCount(num1);
        int numReverso = reverse(num1);
        int temp;
        if(num1 < 0){
            System.out.println("Invalid Value");
        }else{
            for(int i = 0; i < contagem; i++){
                temp = numReverso % 10;
                switch(temp){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                numReverso /= 10;
            }
        }
    }
}
