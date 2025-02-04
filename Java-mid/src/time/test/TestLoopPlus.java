package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024, 1, 1);
        for(int i = 1; i <= 5; i++){
            System.out.println("날짜 " + i + ": " + ld);
            ld = ld.plus(2, ChronoUnit.WEEKS);
        }
    }
}
