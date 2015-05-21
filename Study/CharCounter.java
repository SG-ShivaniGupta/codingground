import java.util.Scanner;
public class CharCounter {
    public static void main(String[] args) {
		
		System.out.print("Enter String = ");
		Scanner text = new Scanner(System.in);
		String text1 = text.next();
		
		System.out.print("Enter Letter = ");
		Scanner char1 = new Scanner(System.in);
		char char2 = char1.next().charAt(0);
		//String text1 = "madam";
		//char char2 = 'a';

        int numberOfLetter = CharCounter.countCharOccurrences(text1, char2);
        System.out.println("Letter '" + char2 + "' occurs = '" + numberOfLetter + "' times.");
    }

    
    public static int countCharOccurrences(String source, char target) {
        int counter = 0;

        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target) {
                counter++;
            }
        }
        return counter;
    }
}
