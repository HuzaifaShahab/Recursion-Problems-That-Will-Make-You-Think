import java.util.Scanner;

public class findingNaturalNumberSum {
    public static int naturalNumberSum (int n){
        if (n==1){
            return 1 ;
        }
        int sum = 0 ;
        sum = n + naturalNumberSum(n-1);
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Hey Give Me Any Natural Number To Find Its Sum");
            int n = sc.nextInt() ;

            int sum = naturalNumberSum(n) ;
        System.out.println("Final Sum till "+n+" Value is : "+sum);


    }
}