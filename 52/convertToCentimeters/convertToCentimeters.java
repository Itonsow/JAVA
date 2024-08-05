public class convertToCentimeters {
    public static void main(String[] args){
        System.out.println(convertToCentimeters2(5, 8));
        System.out.println(convertToCentimeters1(68));
    }
    public static double convertToCentimeters1(int height){
        return height * 2.54;
    }
    public static double convertToCentimeters2(int heighfeet, int heightinch){
        return convertToCentimeters1(heighfeet*12 + heightinch);
    }
}
