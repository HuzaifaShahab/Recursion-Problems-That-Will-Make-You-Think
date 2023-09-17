import java.util.Scanner;

public class freindPairingproblem {
    public static int friendsPairing (int n){
        if (n==1 )
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers of friends in party");
            int n = sc.nextInt() ;
            int ways = friendsPairing(n) ;
        System.out.println("Total no of ways : " + ways);
    }
}
