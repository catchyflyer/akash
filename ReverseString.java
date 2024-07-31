public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        StringBuilder reversed = new StringBuilder(original);
        reversed.reverse();
        System.out.println("Reversed string: " + reversed.toString());
    }
}
