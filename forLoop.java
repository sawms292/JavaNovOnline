public class forLoop {
    public static void main(String[] args){

        for(int i = 1; i<999; i++){
            if (i == 14){
                continue;

            }else if(i == 26){
                break;
            }
            System.out.println("Now is " + i);
        }
    }
    
}
