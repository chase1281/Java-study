package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = value;

        int unBoxedValue = boxedValue;
        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unBoxedValue = " + unBoxedValue);

    }
}
