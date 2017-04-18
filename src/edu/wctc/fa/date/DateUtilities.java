/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.fa.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Demonstrate Java 8 Date/Time API
 *
 * @author Ferit Agar
 * @since 1.8
 */
public class DateUtilities {

    /**
     * Get current date and convert to string. e.g.: "18 Apr 17"
     * currentDate - your "computer date" 
     * "d MMM yy" - d = day, MMM = Month, yy = year
     * You can change pattern."MM-dd-yyyy","yyyy-MMM-dd","MM/dd/yyyy" etc.
     *
     * @param formattedDate
     * @return formattedDate
     */
    public String currentDateToStringFormat(String formattedDate) {

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yy");

        formattedDate = currentDate.format(formatter);

        return formattedDate;
    }
    
    /**
     * Get current time and convert to string. e.g.: "18 Apr 17"
     * currentTime - your "computer time" 
     * "hh:mm:ss a" - hh = hours, mm = minutes, ss = seconds a = am/pm
     * You can change pattern."a hh:mm:ss","hh:mm a","hh:mm" etc.
     *
     * @param formattedTime
     * @return formattedTime
     */
     public String currentTimeToStringFormat(String formattedTime) {

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        formattedTime = currentTime.format(formatter);

        return formattedTime;
    }
     /**
      * Get how many days left to picked date.
      * today - your computer current time
      * you can add any date to calculate in this format
      * LocalDate name = LocalDate.of(Year, Month.MonthName, Day);
      * e.g.    
      * LocalDate newYearEve = LocalDate.of(2017, Month.DECEMBER, 31);
      * LocalDate valentinesDay = LocalDate.of(2018, Month.FEBRUARY, 14);
      * LocalDate summerFest = LocalDate.of(2017, Month.JUNE, 28);
      * @param formattedTime
      * @return 
      */
    public long calculateHowManyDaysBetweenTodayToSpecialDay(Long formattedTime) {
     LocalDate today = LocalDate.now();
     LocalDate independenceDay = LocalDate.of(2017, Month.JULY, 4);
     
     LocalDate holiday = independenceDay;
     
     formattedTime = today.until(holiday,ChronoUnit.DAYS);
     return formattedTime;
    }
    
    /**
     * This method convert string to LocalDate
     * LocalDate format is "yyyy-MM-dd"
     * yyyy = year, MM=month(numeric),dd=day
     * @return 
     */
    
     public LocalDate stringDateToLocalDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yy");
        String date  = "4/12/17";
        LocalDate localDate = LocalDate.parse(date,formatter);
        System.out.println(localDate);
        return localDate;
    }
    
    

}
