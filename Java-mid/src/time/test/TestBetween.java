package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        Period periodDate = Period.between(startDate, endDate);
        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + periodDate.getYears() + "년 " + periodDate.getMonths() + "개월 " + periodDate.getDays() + "일");
        long between = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("디데이: " + between + "일 남음");
    }
}
