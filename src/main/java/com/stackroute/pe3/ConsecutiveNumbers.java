package com.stackroute.pe3;

import java.util.Scanner;

public class ConsecutiveNumbers {
    public String consecutiveNumbers (String series) {
        String[] numberSeries = series.split(",");
        int[] numberInt = new int[numberSeries.length];
        for (int i=0; i<numberSeries.length; i++) {
            numberInt[i] = Integer.parseInt(numberSeries[i].trim());
        }
        for (int i=0; i<numberSeries.length-2; i++) {
            if ((numberInt[i]-numberInt[i+1]==-1)||(numberInt[i]-numberInt[i+1]==1))
                return "Consecutive series";
        }
        return "Not a onsecutive series";
    }
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the series");
        String series = scanner.next();
        ConsecutiveNumbers consecNumbers = new ConsecutiveNumbers();
        String res = consecNumbers.consecutiveNumbers(series);
        System.out.println(res);
    }
}
