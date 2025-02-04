package exception.basic.unchecked;

public class Service {
    Client client = new Client();
    public void callcatch(){
        try {
            client.call();
        }catch(MyUnCheckedException e){
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    public void callThrow(){
        client.call();
    }
}
