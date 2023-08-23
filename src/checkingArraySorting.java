import java.util.Scanner;

public class checkingArraySorting {
    public static boolean checkSorted (int []array ,int i){
        if(i==array.length-1){
            return true ;
        }
        if(array[i] > array[i+1]){
            return false ;
        }
        return  checkSorted(array,i+1) ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        final int size = 5 ;
        int [] array  = new int[size] ;

        for (int i=0;i<array.length;i++){
            System.out.print("Input array element at index "+(i+1)+" : ");
             array[i] = sc.nextInt() ;
            System.out.println();
        }
        System.out.println(checkSorted(array,0) );
    }
}
