package exception.basic.unchecked;

public class MyUnCheckedException extends RuntimeException {
    public MyUnCheckedException(String message) {
        super(message);
    }
}
