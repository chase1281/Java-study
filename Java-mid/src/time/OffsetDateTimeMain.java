package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowDt = OffsetDateTime.now();
        System.out.println("nowDt = " + nowDt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);
        OffsetDateTime odf = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odf = " + odf);
    }
}
