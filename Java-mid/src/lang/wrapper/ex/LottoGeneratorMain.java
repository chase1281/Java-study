package lang.wrapper.ex;

import java.util.Random;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumber = lottoGenerator.setNum();

        System.out.print("로또 번호: ");
        for (int i : lottoNumber) {
            System.out.print(i + " ");
        }
    }
}
