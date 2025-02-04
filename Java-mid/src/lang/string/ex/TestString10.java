package lang.string.ex;

public class TestString10 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println(reversedStr);
    }
}
