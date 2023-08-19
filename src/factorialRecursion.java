import java.util.Scanner;

public class factorialRecursion {
    public static int findFactorial (int n){
        if (n==0){   // Base Case
            return 1 ;
        }
         int fact ;
         fact = n * findFactorial(n-1) ;    // Recursive Call
         return fact ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Input Any Number To Find It's Factorial");
            int n = sc.nextInt() ;

            int factorial = findFactorial(n); // Passing value
        System.out.println("Factorial Of A Given Number Is : "+factorial);
    }
}
