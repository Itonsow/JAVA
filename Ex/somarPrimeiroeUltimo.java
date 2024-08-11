public class somarPrimeiroeUltimo {
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(5));
    }
    public static int sumFirstAndLastDigit(int num){
        int primeiroDigito = num;
        int ultimoDigito = num % 10;
        if(num < 0){
            return -1;
        }
        while(primeiroDigito >= 10){ 
            primeiroDigito /= 10;
        }
        return primeiroDigito+ultimoDigito;
    }
}
