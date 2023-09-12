import java.util.Scanner;

public class lastOccurrenceOfElement {
    public static int lastOccurrence (int []array , int key , int i){
        if (i == array.length){
            return -1 ;
        }
        int isFound = lastOccurrence(array,key,i+1) ;

        if (isFound != -1){
            return isFound ;
        }
        if (array[i] == key) {
            return i ;
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,5,6,7,5,8,9} ;

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Input a key to find");
            int key = sc.nextInt () ;

            int occur = lastOccurrence(array,key,0) ;
            System.out.println("Last occurrence of element is at index : "+occur);
    }
}
