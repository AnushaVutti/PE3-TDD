package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {
    public String calendarClass () {
        //String monday;
        //String sunday;
        String result;
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        // To print last and first dates of current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        String monday = df.format(c.getTime());
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        String sunday = df.format(c.getTime());
        System.out.println(df.format(c.getTime()));
        System.out.println();
        return (monday + " " + sunday);
    }

    public static void main (String args[]) {
        CalendarClass calClass = new CalendarClass(); //Object of calendar class
        calClass.calendarClass();

    }
}
