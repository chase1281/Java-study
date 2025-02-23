package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        int total = 0;
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while(true){
            int n = scanner.nextInt();
            if(n == 0) break;
            numbers.add(n);
            total += n;
        }

        double average = (double) total / numbers.size();
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
