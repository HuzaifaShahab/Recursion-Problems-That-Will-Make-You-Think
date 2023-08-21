import java.util.Scanner;

public class nthFibonacciPrinting {
    public static int printFibonacci (int n){
        if (n == 0 || n==1) {
            return n ;
        }
         return printFibonacci(n-1) + printFibonacci(n-2) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Which Fibonacci Term You Want To Show");
            int n = sc.nextInt() ;
            int fib = printFibonacci(n) ;
        System.out.println(fib);
    }
}
