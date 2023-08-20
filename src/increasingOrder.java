import java.util.Scanner;

public class increasingOrder {
        public static void basicRecursive (int n){
            if (n==1){   // Base Case
                System.out.print(n);
                return;
            }
            basicRecursive(n-1);   // Recursive Call  --  Function calling ka stack bane ga.
            System.out.print(n + " ");  // Printing On Console

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Give me any single integer");
            int n = sc.nextInt();

            basicRecursive(n);
        }
    }

