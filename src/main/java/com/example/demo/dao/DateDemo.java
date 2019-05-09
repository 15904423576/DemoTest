package com.example.demo.dao;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class DateDemo {

    @Test
    public void method() {

//    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime of = LocalTime.of(9, 0, 0);
        System.out.println(of);
        LocalDate now1 = LocalDate.now();
        LocalDate with = now1.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now1);
        System.out.println(with);
        LocalDate with1 = now1.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
        System.out.println(with1);
        LocalDate localDate = now1.minusDays(1);
        System.out.println(localDate);
        boolean after = localDate.isAfter(now1);
        System.out.println(after);

    }
}
