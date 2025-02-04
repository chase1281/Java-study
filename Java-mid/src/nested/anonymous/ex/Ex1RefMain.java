package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {
    public void process(String str){
        System.out.println("프로그램 시작");
        if(str.equals("dice")) {
            Dice dice = new Dice() {
                @Override
                public void helloDice() {
                    int randomValue = new Random().nextInt(6) + 1;
                    System.out.println("주사위 = " + randomValue);
                }
            };
            dice.helloDice();
        }
        else{
            Sum sum = new Sum(){
                @Override
                public void helloSum() {
                    for(int i = 0; i < 3; i++){
                        System.out.println("i = " + i);
                    }
                }
            };
            sum.helloSum();
        }
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        Ex1RefMain ex1RefMain = new Ex1RefMain();
        ex1RefMain.process("dice");
        ex1RefMain.process("sum");
    }
}
