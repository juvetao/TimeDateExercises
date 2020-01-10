package se.ecut.cheng;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class localDateTimeExercises {

    public static void main(String[] args) {
//        LocalDate current = LocalDate.now();
////        Exercise 1
//        System.out.println(current);
////        Exercise 2
//        System.out.println(current.format(DateTimeFormatter.ofPattern("eeee dd MMMM")));
////        Exercise 3
//
//        LocalDate lastMonday = findLastMonday(1);
//        System.out.println(lastMonday);
//        showDaysFromLastMonday(lastMonday);

////        Exercise 4
//        LocalDate dateObject = LocalDate.parse("2020-01-10");
//        System.out.println(dateObject);

////        Exercise 5
//        LocalDate theDate = LocalDate.parse("1945-05-08");
//        DayOfWeek day = theDate.getDayOfWeek();
//        System.out.println("Day of week for 1945-05-08 is: "+ day);

////        Exercise 6
//        LocalDate current = LocalDate.now();
//        LocalDate afterCalculate = current.plusYears(10).minusMonths(10);
//        Month getMonth = afterCalculate.getMonth();
//        System.out.println("The month after calculation is: "+ getMonth);

////        Exercise 7
//        LocalDate yourBirthday = LocalDate.parse(("1986-02-12"));
//        LocalDate current = LocalDate.now();
//        Period period = Period.between(yourBirthday, current);
//        int years = period.getYears();
//        int months = period.getMonths();
//        int days = period.getDays();
//
//        System.out.println(years + " years, " + months+" months, "+days+" days");

////        Exercise 8
//        Period period = Period.of(4, 7, 29);
//        LocalDate current = LocalDate.now();
//        LocalDate calculate = current.plus(period);
//        System.out.println(calculate);

////        Exercise 9
//        LocalTime current = LocalTime.now();
//        System.out.println(current);
////        Exercise 10
//        int nanoseconds = current.getNano();
//        System.out.println(nanoseconds);

//        Exercise 11
//        LocalTime timeObject = LocalTime.parse("14:31:33");
//        System.out.println(timeObject);

//        Exercise  12
//        LocalTime time = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
//        System.out.println(time);

////        Exercise 13
//        LocalDate date = LocalDate.parse("2018-04-05");
//        LocalTime time = LocalTime.parse("10:00");
//        LocalDateTime localDateTime = LocalDateTime.of(date, time);
//        System.out.println(localDateTime);
//
////        Exercise 14
//        String custom = localDateTime.format(DateTimeFormatter.ofPattern("eeee d MMMM HH:mm"));
//        System.out.println(custom);

//        Exercise 15
        LocalDate date = LocalDate.of(1986, 02, 12);
        LocalTime time = LocalTime.of(12, 30);
        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println(localDateTime);

//        Exercise 16
        String customizedDate = localDateTime.format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
        System.out.println(customizedDate);
        LocalDate getDate = LocalDate.parse(customizedDate);
        System.out.println(getDate);
        String customizedTime = localDateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(customizedTime);
        LocalTime getTime = LocalTime.parse(customizedTime);
        System.out.println(getTime);
    }





    //        Exercise 3 method 1
    public static LocalDate findLastMonday(int dayOfWeek){
        LocalDate current = LocalDate.now();
        LocalDate lastMonday;
        int dayToday = Integer.parseInt(current.format(DateTimeFormatter.ofPattern("e")));
        System.out.println("Day of Today is:"+ dayToday);
        for(int i = 0; i<7; i++){
            if(dayToday-i == 1){
                lastMonday = current.minusDays(i+7);
                return lastMonday;
            }
        }
        return null;
    }

    //        Exercise 3 method 2
    public static void showDaysFromLastMonday(LocalDate lastMonday){
        String targetDate;
        for(int i = 0; i < 7; i++){
            targetDate = lastMonday.plusDays(i).format(DateTimeFormatter.ISO_DATE);
            System.out.println("The date is: " + targetDate);
        }
    }


}
