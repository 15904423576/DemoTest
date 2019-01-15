package com.example.demo.dao;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeDemo {

    public static void main(String[] args) {
       /* List<> lists = new ArrayList();
        //现在
        LocalDate toDay = LocalDate.now();
        //七天前
        LocalDate beforeDay = toDay.minusDays(6);
        for (int i = 0; i <7 ; i++) {
            beforeDay = toDay.plusDays(i);
            for（//遍历list）{
                //判断有没有这个时间
                if(!beforeDay.equals(//你的时间将其转换为localDate)){
                    //没有这个时间将其new置0
                    new...
                    lists.add;
                }else{
                    //在其中直接添加进去
                    lists.add;
        }
            }
        }*/
        LocalDate  l  = LocalDate.now();
        LocalDate localDate = l.plusDays(1);
        System.out.println(localDate.equals(l));
        System.out.println(localDate.isEqual(l));
        LocalDate ll = LocalDate.now();
        System.out.println(ll.equals(l));
        DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse("2018-01-22 08:09:08", d);
        LocalTime lo = LocalTime.now();
        System.out.println(lo);
       // LocalTime parse1 = LocalTime.parse("08:09:30", d);
        System.out.println(parse);

        LocalDateTime lll = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = lll.atZone(zoneId);
        

        Instant instant = zonedDateTime.toInstant();
        Date date = Date.from(instant);
        System.out.println(date);

    }
}
