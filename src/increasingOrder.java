import java.util.Scanner;

public class increasingOrder {
        public static void basicRecursive (int n){
            if (n==1){
                System.out.print(n);
                return;
            }
            basicRecursive(n-1);
            System.out.print(n + " ");

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Give me any single integer");
            int n = sc.nextInt();

            basicRecursive(n);
        }
    }

