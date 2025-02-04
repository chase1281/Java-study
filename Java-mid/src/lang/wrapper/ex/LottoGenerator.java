package lang.wrapper.ex;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] arr;
    private int count;

    public int[] setNum(){
        arr = new int[6];
        count = 0;
        while(count < 6){
            int num = random.nextInt(45) + 1;
            if(!isDup(num)){
                arr[count++] = num;
            }
        }
        return arr;
    }

    private boolean isDup(int value){
        for(int i = 0; i < count; i++){
            if(value == arr[i]) return true;
        }
        return false;
    }
}
