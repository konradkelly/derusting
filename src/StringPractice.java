import java.util.List;
import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String keyboardCharsCaps = "WASD";

    // Find the length of the string
    int lengthOfKeyboardChars = keyboardCharsCaps.length();
    System.out.println(lengthOfKeyboardChars);

    // Concatenate (add) two strings together and reassign the result
    String part1 = "Postgres";
    String part2 = "SQL";

    String complete = part1 + part2;

    System.out.println(complete);

    // Find the value of the character at index 3
    char ch = complete.charAt(3);
    System.out.println(ch);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean hasABC = complete.contains("abc");
    System.out.println(hasABC);

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < complete.length(); i++) {
      System.out.println(complete.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> list = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    list.add("Jupiter");
    list.add("Saturn");
    list.add("Neptune");

    System.out.println(list);
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
      String planetsList = String.join(", ", list);    
      System.out.println(planetsList);
      // Check whether two strings are equal
      String string1 = "Python";
      String string2 = "C++";
      boolean areEqual = string1.equals(string2);
      System.out.println(areEqual);
      
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
