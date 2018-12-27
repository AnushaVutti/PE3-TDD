package com.stackroute.pe3;

import java.util.Scanner;

public class AdditionOfMatrices {
    public int[][] additionOfMatrices (int[][] matrixA,int[][] matrixB) {

        int[][] matrixSum = new int[matrixA.length][matrixA[0].length];
       // To print the matrix A
        System.out.println("Matrix A: ");
        for ( int i =0; i<matrixA.length; i++) {
            for ( int j=0; j<matrixA[0].length; j++) {
                System.out.print(matrixA[i][j] +"  ");
            }
            System.out.println(" ");
        }
       // To print matrix B
        System.out.println("Matrix B: ");
        for ( int i =0; i<matrixB.length; i++) {
            for ( int j=0; j<matrixB[0].length; j++) {

                System.out.print(matrixB[i][j] +"  ");
            }
            System.out.println(" ");
        }
        // addition of matrices
        System.out.println("The resultant matrix is :");
        for ( int i =0; i<matrixSum.length; i++) {
            for ( int j=0; j<matrixSum[0].length; j++) {
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
            }

        }
        return matrixSum;

    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of Rows: ");
        int numOfRows = scanner.nextInt();
        System.out.println("Enter no of Columns: ");
        int numOfColumns = scanner.nextInt();
        int[][] matrixA = new int[numOfRows][numOfColumns];
        int[][] matrixB = new int[numOfRows][numOfColumns];
        System.out.println("Enter values of matrix A: ");
        for ( int i =0; i<matrixA.length; i++) {
            for ( int j=0; j<matrixA[0].length; j++) {
                matrixA[i][j] = scanner.nextInt();
                System.out.print(matrixA[i][j] +"  ");
            }
            System.out.println(" ");
        }
        System.out.println("Enter values of matrix A: ");
        for ( int i =0; i<matrixB.length; i++) {
            for ( int j=0; j<matrixB[0].length; j++) {
                matrixB[i][j] = scanner.nextInt();
                System.out.print(matrixB[i][j] +"  ");
            }
            System.out.println(" ");
        }
        AdditionOfMatrices addOfMatrices = new AdditionOfMatrices();
        int[][] sum = addOfMatrices.additionOfMatrices(matrixA,matrixB);
        for ( int i =0; i<sum.length; i++) {
            for ( int j=0; j<sum[0].length; j++) {
                System.out.print(sum[i][j] +"  ");
            }
            System.out.println(" ");
        }
    }
}
