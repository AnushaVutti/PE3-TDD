package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    private ConsecutiveNumbers consecutiveSeries = new ConsecutiveNumbers();

    @Test
    public void checkSeriesNotConsecutive () {
        assertEquals("Not a consecutive series",consecutiveSeries.consecutiveNumbers("56,54,53"));
    }
    @Test
    public void checkSeriesConsecutive () {
        assertNotSame("Not a consecutive series",consecutiveSeries.consecutiveNumbers("56,55,54"));
    }


}