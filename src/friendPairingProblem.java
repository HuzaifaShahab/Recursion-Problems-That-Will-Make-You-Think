//Given n friends, each one can remain single or can be paired up with some other friend.
//Each friend can be paired only once. Find out the total number of ways in which friends
//can remain single or can be paired up.

import java.util.Scanner;
public class friendPairingProblem {
    public static int friendsPairing (int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int fnm1 = friendsPairing(n - 1);
        int fnm2 = fnm1 * friendsPairing(n - 2);
             return fnm1 + fnm2;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers of friends in party");
            int n = sc.nextInt() ;
            int ways = friendsPairing(n) ;
        System.out.println("Total no of ways : " + ways);
    }
}
