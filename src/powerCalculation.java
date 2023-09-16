import java.util.Scanner;
public class powerCalculation {

    public static int x_ToThePower_n (int x , int n){
        if (n==0) return 1 ;

        return x * x_ToThePower_n(x,n-1) ;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Input x value");
            int xValue = sc.nextInt() ;
        System.out.println("Input n value");
            int nValue = sc.nextInt() ;

            int result = x_ToThePower_n(xValue,nValue) ;
        System.out.println(xValue+" To the power "+nValue+" is -> "+result);

    }
}
