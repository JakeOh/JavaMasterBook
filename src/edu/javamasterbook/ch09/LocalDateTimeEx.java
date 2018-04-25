package edu.javamasterbook.ch09;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        System.out.println(formatter.format(now));

        int weekday = now.getDayOfWeek().ordinal();
        System.out.println("weekday: " + weekday);

        LocalDateTime startDay = now.minusDays(weekday);
        System.out.println(startDay);
        System.out.println("From: " + formatter.format(startDay));

        LocalDateTime endDay = startDay.plusDays(6);
        System.out.println(endDay);
        System.out.println("From: " + formatter.format(endDay));
    }

}
