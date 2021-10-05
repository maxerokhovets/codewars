package codewars;


public class FindMissingLetter {

    public static void main(String[] args) {
        
        char[] array = {'E', 'F', 'H', 'I', 'J'};
        char expectableLetter = array[0];
        for (char c : array) {
            if (c != expectableLetter) {
               break; 
            }
            expectableLetter++;
        }
        System.out.println(expectableLetter);

    }

}
