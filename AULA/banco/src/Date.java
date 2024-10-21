public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        int[] mes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year > 0 && year <= 2024){
            if(month <= 12 && month > 0){
                if(day > 0 && day <= mes[month] && bissexto(year) == false){
                    this.day = day;
                    this.month = month;
                    this.year = year;
                }else{
                    if(day > 0 && day <= 29){
                        this.day = day;
                        this.month = month;
                        this.year = year;
                    }
                }
            }
        }
        //throw new IllegalArgumentException("Ano invalido");
    }

    public String imprimeStr(){
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public static boolean bissexto(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
