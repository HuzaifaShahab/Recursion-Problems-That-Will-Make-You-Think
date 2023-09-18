import java.util.Scanner;

public class Remove_Duplicate_In_String {
    public static void removeDuplicate (String string , int index , StringBuilder newString , boolean[] map){
        // Base Case
        if (index >= string.length()){
            System.out.println(newString);
            return;
        }

        char currChar = string.charAt(index) ;
        if (map[currChar - 'a']){ // If true
            removeDuplicate(string,index+1,newString,map);
        }
        else{
            map[currChar-'a'] = true ;  // [currChar - 'a'] will give us an actual index of that character.
//            In this case Appending non-duplicate character into newString
            removeDuplicate(string,index+1,newString.append(currChar),map);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input Any String To Remove Duplicate Characters");
                String string = sc.nextLine();
                string = string.toLowerCase();

            removeDuplicate(string, 0, new StringBuilder(), new boolean[26]);
        }
    }
}
