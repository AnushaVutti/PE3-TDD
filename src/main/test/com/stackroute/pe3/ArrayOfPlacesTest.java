package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOfPlacesTest {
    private ArrayOfPlaces placesArray = new ArrayOfPlaces();
    @Test
    public void checkSuccess () {
        String[] places = new String[] {"nd","Jpn"};
        String[] input = new String[] {"India","Japan"};
        assertEquals(places,placesArray.arrayOfPlaces(input));
    }
    @Test
    public void checkFailure () {
        String[] places = new String[] {"Ind","Jpn"};
        String[] input = new String[] {"India","Japan"};
        assertNotSame(places,placesArray.arrayOfPlaces(input));
    }
    @Test
    public void checkNotNull () {
        String[] input = new String[] {"India","Japan"};
        assertNotNull(placesArray.arrayOfPlaces(input));
    }

}