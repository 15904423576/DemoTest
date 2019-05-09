package com.example.demo.dao;

import org.junit.Test;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class DemoTest3 {
    public static void main(String[] args) {
        System.out.println("sddf");
    }


    @Test
    public void me() {
        List<String> list = new ArrayList<>();
        FtdcExchange[] values = FtdcExchange.values();
        for (FtdcExchange value : values) {
            list.add(value.getExchange());
        }
        list.forEach(e -> System.out.println(e));
        System.out.println(33);
    }

    @Test
    public void meth() {
        String s = "sdfsdfs3212";
        String substring = s.substring(s.length() - 4);
        System.out.println(substring);

    }

    @Test
    public void meth2() {
        String time = "2019-01-01";
        LocalDate parse = LocalDate.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(parse);
    }

    @Test
    public void meth22() {
        LocalDate with = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(with);
    }

    @Test
    public void meth23() {

        String s = "ssu234";
        s = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(s);

    }

    @Test
    public void mmm() {
        String s = "sss";
        Assert.notNull(s, "not be null");
        System.out.println(s);
    }

    private List<String> list = Arrays.asList("aa", "cc", "bb", "a");
    private List<Integer> aa = Arrays.asList(3, 2, 4, 1);

    @Test
    public void mm() {
        list.sort((e1, e2) -> e1.compareTo(e2));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        aa.sort(Comparator.naturalOrder());


    }

    @Test
    public void dd() {
        list.forEach(System.out::print);

        List<String> names = new ArrayList<>();
        names.add("TaoBao");
        names.add("ZhiFuBao");








    }


    @Test
    public void m2m() {
        String s = new DefaultableImpl().notRequired();
        System.out.println(s);
        String s1 = new OverridableImpl().notRequired();
        System.out.println(s1);

    }


}


interface Defaulable {
    // Interfaces now allow default methods, the implementer may or
    // may not implement (override) them.
    default String notRequired() {
        return "Default implementation";
    }
}

class DefaultableImpl implements Defaulable {
}

class OverridableImpl implements Defaulable {
    @Override
    public String notRequired() {
        return "Overridden implementation";
    }
}