package com.example.demo.dao;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class DemoTest {

    public static void main(String[] args) {


//        String s = StringUtils.trimToNull("  ");
//        if(StringUtils.isBlank(s)){
//            System.out.println("hui");
          // System.out.println("hui");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        // 改成这样就好了
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Long seconds = (cal.getTimeInMillis() - System.currentTimeMillis()) / 1000;
        int still = seconds.intValue();
        System.out.println(still);
       // System.out.println(cal);
        System.out.println(getLeftSecondsToday());
        System.out.println(getCurrentTime());



        String s = null;
        if("d".equals(s)){

        }
         /*  System.out.println(StringUtils.isEmpty(""));
           System.out.println(StringUtils.isEmpty("  "));
           System.out.println(StringUtils.isEmpty(null));
           System.out.println(StringUtils.isBlank(""));
           System.out.println(StringUtils.isBlank("   "));
           System.out.println(StringUtils.isBlank(null));
*/

         /*System.out.println(Long.parseLong("10",10));
         System.out.println(Long.parseLong("10",8));
         System.out.println(Long.parseLong("11",8));
         System.out.println(Long.parseLong("11",2));*/


//        }

//        String s = "aadfffdfxx";
//        String[] dfs = s.split("df");
//
//        String[] split = StringUtils.split(s,"df");
//        System.out.println(Arrays.toString(dfs));
//
//        for (int i = 0; i <split.length ; i++) {
//            System.out.println(split[i]);
//        }


    }
    public static int getLeftSecondsToday() {
        Calendar curDate = Calendar.getInstance();
        Calendar tomorrowDate = new GregorianCalendar(curDate
                .get(Calendar.YEAR), curDate.get(Calendar.MONTH), curDate
                .get(Calendar.DATE) + 1, 0, 0, 0);
        return (int) (tomorrowDate.getTimeInMillis() - curDate.getTimeInMillis()) / 1000;
    }

    public synchronized static String getCurrentTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String nowString = format.format(cal.getTime());
        Random rand = new Random();
        int value = rand.nextInt(1000);

        return nowString + String.valueOf(value);
    }

public static void methodd(){
        System.out.println("hhh");
}


}


class Demo1{
    public static void method(){
        System.out.println("nihao");
    }
}