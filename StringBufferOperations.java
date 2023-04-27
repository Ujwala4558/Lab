public class StringBufferOperations {

public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("This is StringBuffer");
    sb.append("- This is a sample program");
    System.out.println("String after appending: " + sb);
    sb.insert(21, "Object");
    System.out.println("String after inserting 'Object': " + sb);
    sb.reverse();
    System.out.println("Reversed string: " + sb);
    sb.replace(sb.indexOf("Buffer"), sb.indexOf("Buffer") + "Buffer".length(), "Builder");
    System.out.println("String after replacing 'Buffer' with 'Builder': " + sb);
  }
}