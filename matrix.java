public class matrix {
    public static void main(String[] args){
        int[] carPrice={29000,33000,50000};
        String[][] carDetails={{"toyota","Honda","BMW"},{"2019","2018","2024"}};
        

        for(int i = 0; i <carPrice.length; i++){
                    if(carPrice[i] >= 50000){
                        System.out.println("Car Model : " + carDetails[0][i] + " Car Year : " + carDetails[1][i] +" Car Price = " + carPrice[i]);
                    }else if(carPrice[i] <= 49000){
                        System.out.println(carPrice[i]);
                        System.out.println("Other car less then 49000");
                    }else{
                        System.out.println("error");
                    }

                }
            }
        }

