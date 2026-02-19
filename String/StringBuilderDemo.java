public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");
    System.out.println(sb.toString()); // Output: Hello World
    sb.insert(5, ",");
    System.out.println(sb.toString()); // Output: Hello, World
    sb.replace(6, 11, "Java");
    System.out.println(sb.toString()); // Output: Hello, Java
    sb.delete(5, 6);
    System.out.println(sb.toString()); // Output: Hello Java
  }
}
//StringBuilder is a mutable sequence of characters. It is used to create and manipulate strings without creating new string objects. StringBuilder provides methods for appending, inserting, replacing, and deleting characters in a string. It is more efficient than using the String class when you need to perform multiple string manipulations.
// StringBuilder is not thread-safe, so it should be used in a single-threaded environment. If you need a thread-safe alternative, you can use the StringBuffer class, which is similar to StringBuilder but synchronized.
//StringBuilder is part of the java.lang package and was introduced in Java 5. It is commonly used for building strings in a more efficient way, especially when concatenating multiple strings together.
//StringBuilder is often used in scenarios where you need to construct a string dynamically, such as when building SQL queries, generating HTML content, or creating complex strings based on user input. It allows you to modify the string without creating new objects, which can improve performance and reduce memory usage.
//StringBuilder is non-synchronized, which means that it is not thread-safe. If multiple threads access a StringBuilder instance concurrently, it may lead to unpredictable behavior. In such cases, it is recommended to use StringBuffer, which is synchronized and thread-safe. However, if you are working in a single-threaded environment or do not require thread safety, StringBuilder can provide better performance compared to StringBuffer.