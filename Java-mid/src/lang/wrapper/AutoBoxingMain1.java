package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        int unBoxedValue = boxedValue.intValue();
        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unBoxedValue = " + unBoxedValue);

    }
}
