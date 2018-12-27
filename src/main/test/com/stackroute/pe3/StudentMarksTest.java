package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    private StudentMarks stuMarks = new StudentMarks();
    @Test
    public void validInputNegativeStudents() {

        assertEquals("error",stuMarks.validInput(-4));
    }
    @Test
    public void validInputNoError() {

        assertEquals("no error",stuMarks.validInput(4));
    }

}