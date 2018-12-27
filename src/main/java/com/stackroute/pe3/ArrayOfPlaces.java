package com.stackroute.pe3;

import java.util.Scanner;

public class ArrayOfPlaces {
    public String[] arrayOfPlaces (String[] placesArray) {
        String[] res = new String[placesArray.length];

        for ( int i=0; i<placesArray.length; i++) {
           res[i] = placesArray[i].replaceAll("[aeiouAEIOU]", "");
        }
        return res;
    }
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input");
        String[] placesArray = new String[scanner.nextInt()];
        for ( int i=0; i<placesArray.length; i++) {
            System.out.println("Enter place " + (i+1));
            placesArray[i] = scanner.next();

        }
        ArrayOfPlaces array = new ArrayOfPlaces();
        String[] res = array.arrayOfPlaces(placesArray);
        System.out.println("Output: ");
        for ( int i=0; i<res.length; i++) {
            System.out.println(res[i]);

        }
    }

}
