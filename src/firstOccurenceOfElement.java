public class firstOccurenceOfElement {
    public static int firstOccurrence (int []array,int key,int i){
        if (i==array.length-1) return -1 ;

        if (array[i]==key) return i ;

        return firstOccurrence(array,key,i+1) ;
    }

    public static void main(String[] args) {
        int []array = {1,5,3,5,3,7,8,9,0} ;
        int key = 9 ;

        System.out.println("First occurrence of an element isq found at index : "+firstOccurrence(array,key,0));
    }
}
