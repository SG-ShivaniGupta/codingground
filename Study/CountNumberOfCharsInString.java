import java.util.*;
 public class CountNumberOfCharsInString{
     
     public static void main(String[] ar) {

        String inputString = "madam";
        int length = inputString.length();
        Map<Character,Integer> numChars = new HashMap<Character, Integer>();
        for (int i = 0; i<length; i++){
            char charAt = inputString.charAt(i);
            if(!numChars.containsKey(charAt)){
                numChars.put(charAt, 1);
            }
            else {
                numChars.put(charAt, numChars.get(charAt)+1);
            }
        }

        System.out.println(numChars);

    }
}
