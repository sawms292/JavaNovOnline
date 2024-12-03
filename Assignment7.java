import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        int[][] matrixThreeFour = new int[3][4];
        int[][] matrixTwoThree = new int[2][3];
        Scanner newScanner = new Scanner(System.in);
        int UserOptions = 0;
        System.out.println("---Menu---");
        System.out.println("1: Matrix 3*4");
        System.out.println("2: Matrix 2*3");
        System.out.println("3: Exit Program");
        System.out.println("Please Choose Your Options: ");
        UserOptions = newScanner.nextInt();
        switch(UserOptions){
            case 1:
            for(int i=0; i<matrixThreeFour.length;i++){
                for(int j=0; j<matrixThreeFour[i].length;j++){
                    System.out.print("Enter the value for matrix []=" + i + "[]=" + j +"-->");
                   matrixThreeFour[i][j] = newScanner.nextInt();
                   
                }
            }

            for(int a=0; a<matrixThreeFour.length;a++){
                for(int b=0; b<matrixThreeFour[a].length;b++){
                    System.out.print(matrixThreeFour[a][b] + " ");
                }
                System.out.println("");
            }
            break;

            case 2:
            for(int i=0; i<matrixTwoThree.length;i++){
                for(int j=0; j<matrixTwoThree[i].length;j++){
                    System.out.print("Enter the value for matrix []=" + i + "[]=" + j +"-->");
                   matrixTwoThree[i][j] = newScanner.nextInt();
                }
            }

            for(int a=0; a<matrixTwoThree.length;a++){
                for(int b=0; b<matrixTwoThree[a].length;b++){
                    System.out.print(matrixTwoThree[a][b] + " ");
                }
                System.out.println("");
            }
            break;

            case 3:
            System.exit(0);
            break;

            default:
            System.out.println("Invalid Number");
            System.exit(0);

        }
        newScanner.close();
    }
    
}
