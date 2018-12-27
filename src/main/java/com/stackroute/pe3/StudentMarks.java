package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {

    public void studentMarks () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num of Students : ");
        int numOfStudents = scanner.nextInt();
        int[] stuGrades = new int[numOfStudents];

        for (int i = 0; i < stuGrades.length; i++) {
            System.out.println("Enter grade of Student " + (i + 1));
            stuGrades[i] = scanner.nextInt();
            if (!(stuGrades[i] >= 0 && stuGrades[i] <= 100)) {
                System.out.println("Grades should be between 0 and 100");
                stuGrades[i] = scanner.nextInt();
            }
        }
    }
    public String validInput(int numOfStudents) {


        if (numOfStudents<0)
            return "error";
        else
        return "no error";
    }
    public static void main (String args[]) {
        StudentMarks stuMarks = new StudentMarks();
        stuMarks.studentMarks();
    }
}
