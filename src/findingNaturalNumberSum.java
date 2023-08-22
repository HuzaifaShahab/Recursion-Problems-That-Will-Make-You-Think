import java.util.Scanner;

public class findingNaturalNumberSum {
    public static int naturalNumberSum (int n){
        if (n==1){         // Base Case
            return 1 ;
        }else {
        int sum = 0 ;
        sum = n + naturalNumberSum(n-1);      // Recursive Case    --    Stack Analysis
        return sum ;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Hey Give Me Any Natural Number To Find Sum up-to it");
            int n = sc.nextInt() ;  // Input number

            int sum = naturalNumberSum(n) ;
        System.out.println("Final Sum till "+n+" Value is : "+sum);
        System.out.println("Final Sum Has Been calculated!");


    }
}
