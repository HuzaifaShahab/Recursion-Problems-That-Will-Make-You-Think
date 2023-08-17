import java.util.Scanner;

public class factorialRecursion {
    public static int findFactorial (int n){
        if (n==0){
            return 1 ;
        }
         int fact = 1 ;
         fact = fact * findFactorial(n-1) ;
         return fact ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Input Any Number To Find It's Factorial");
            int n = sc.nextInt() ;

            int factorial = findFactorial(n);
        System.out.println("Factorial Of A Given Number Is : "+factorial);


    }
}
