import java.util.Scanner;

public class OptimizedPowerApproach {
    public static int optimizedPower (int x , int n){
        if (n==0) return 1 ;

        int halfPower = optimizedPower(x,n/2) ;
        int optimized = halfPower * halfPower ;

        if (n%2 != 0) optimized *= x ;

        return optimized ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Input x value");
            int xValue = sc.nextInt() ;
        System.out.println("Input n value");
            int nValue = sc.nextInt() ;

        int result = optimizedPower(xValue,nValue) ;
        System.out.println(xValue+" To the power "+nValue+" is -> "+result);
    }
}
