package nested.anonymous.ex;

public class Ex0Main {
    public Printer process(String message) {

        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("프로그램 시작");
                System.out.println("Hello " + message);
                System.out.println("프로그램 종료");
            }
        };
        printer.print();
        return printer;
    }

    public static void main(String[] args) {
        Ex0Main ex0Main = new Ex0Main();
        ex0Main.process("Java");
        ex0Main.process("Spring");
    }
}
