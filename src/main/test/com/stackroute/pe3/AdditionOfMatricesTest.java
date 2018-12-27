package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatricesTest {
    private AdditionOfMatrices addMatrices = new AdditionOfMatrices();
    @Test
    public void additionSuccess () {
        int[][] A = { {2,3},{4,5} };
        int[][] B = { {6,7},{8,2} };
        int[][] sum = { {8,10},{12,7} };
        assertEquals(sum,addMatrices.additionOfMatrices(A,B));  //To test if expected and actual values are equal
    }
    @Test
    public void additionNotNull () {
        int[][] A = { {2,3},{4,5} };
        int[][] B = { {6,7},{8,2} };
        int[][] sum = { {8,10},{12,7} };
        assertNotNull(addMatrices.additionOfMatrices(A,B));   //To check that the matrix addition is not null
    }
    @Test
    public void additionFailure () {
        int[][] A = { {2,3},{4,5} };
        int[][] B = { {6,7},{8,2} };
        int[][] sum = { {8,11},{12,7} };
        assertNotSame(sum,addMatrices.additionOfMatrices(A,B));   //To check the failure case
    }



}