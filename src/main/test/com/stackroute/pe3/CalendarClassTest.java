package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalendarClassTest {
    private CalendarClass calClass = new CalendarClass();
    @Test
    public void calendarSuccess () {
        String dates = "Mon 24/12/2018" + " " + "Sun 30/12/2018";
        assertEquals(dates,calClass.calendarClass());
    }
    @Test
    public void calendarFailure () {
        String dates = "Mon 24/12/2019" + " " + "Sun 30/12/2018";
        assertNotSame(dates,calClass.calendarClass());
    }
    @Test
    public void calendarNotNull () {
        assertNotNull(calClass.calendarClass());
    }


}