import java.util.Scanner;
public class CharCounter {
    public static void main(String[] args) {
		
		System.out.print("Enter String = ");
		Scanner scanner1 = new Scanner(System.in);
		String text = scanner1.next();
		
		System.out.print("Enter Letter = ");
		Scanner scanner2 = new Scanner(System.in);
		char char1 = scanner2.next().charAt(0);
		//String text1 = "madam";
		//char char2 = 'a';

        int numberOfLetter = CharCounter.countCharOccurrences(text, char1);
        System.out.println("Letter '" + char1 + "' occurs = '" + numberOfLetter + "' times.");
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
