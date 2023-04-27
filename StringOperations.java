
public class StringOperations {
    public static void main(String[] args) {
        String str = "Welcome to Java World";

        // Returns the character at 5th position and displays it.
        char ch = str.charAt(4);
        System.out.println("Character at 5th position: " + ch);

        // Compares the above String with "Welcome" lexicographically ignoring case differences and displays the result.
        boolean isEqual = str.substring(0, 7).equalsIgnoreCase("Welcome");
        System.out.println("Is the string equal to 'Welcome' (ignoring case)? " + isEqual);

        // Concatenates "- Let us learn" to the above string and displays it.
        String newStr = str.concat("- Let us learn");
        System.out.println("Concatenated string: " + newStr);

        // Returns the position of the first occurrence of character 'a' and displays it.
        int index = str.indexOf('a');
        System.out.println("Index of first 'a': " + index);

        // Replaces all the occurrences of 'a' character with the new 'e' and displays it.
        String replacedStr = str.replace('a', 'e');
        System.out.println("String after replacing 'a' with 'e': " + replacedStr);

        // Returns string between 4th position and 10th position and displays it.
        String subStr = str.substring(3, 10);
        System.out.println("Substring between 4th and 10th position: " + subStr);

        // Returns the lowercase of the string and displays it.
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);
    }
}