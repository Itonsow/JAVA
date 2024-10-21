import java.util.Scanner;
public class exponto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        verificacao(entrada);
    } 

    public static void verificacao(String palavra){
        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) == '-'){
                i++;
                if(palavra.charAt(i) == '-'){
                    System.out.printf("2");
                }else{
                    System.out.printf("1");
                }
            }else{
                System.out.printf("0");
            }
        }
    }
}
