package src;
public class FlourPacker {
    public static void main(String[] args){
        System.out.println(canPack(1,0,5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int qntB = 0;
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }else{
            if(bigCount * 5 + smallCount < goal){
                return false;
            }else{
                if(smallCount >= goal){
                    return true;
                }else{
                    for(int j = 0; j <= bigCount; j++){
                        if(j * 5 <= goal){
                            qntB = j;
                        }
                    }
                    if(qntB * 5 + smallCount >= goal){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
    }
}
