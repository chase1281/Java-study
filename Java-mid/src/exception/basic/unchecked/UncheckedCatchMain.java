package exception.basic.unchecked;

public class UncheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callcatch();
        System.out.println("정상 종료");
    }
}
