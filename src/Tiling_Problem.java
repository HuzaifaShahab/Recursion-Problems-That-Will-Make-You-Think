import java.util.Scanner;

public class Tiling_Problem {

    public static int tilingProblem(int length){
        if (length == 0 || length == 1) return 1 ;

        // Vertical Choice
        int nm1 = tilingProblem(length-1) ;
        // Horizontal Choice
        int nm2 = tilingProblem(length-2) ;

        return nm1 + nm2 ;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        System.out.println("Give me actual length of board");
            int length = sc.nextInt() ;

            int totalWays = tilingProblem(length) ;
        System.out.println("Total No.of ways that can be implement are : "+totalWays);

    }
}
