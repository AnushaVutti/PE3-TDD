package com.stackroute.pe3;

public class Exceptions {
    public void arrayIndexOutOfBoundsException(){
        try{
            int a[] = new int[5];
            a[6] = 9;
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println (ex);
        }
    }
    public void negativeArraySizeException(){
        try{
            int arr[] = new int[-5];
        }
        catch (NegativeArraySizeException ex) {
            System.out.println(ex);
        }
    }
    public void nullPointerException() {
        try{
            String str=null;
            char c = str.charAt(0);
        }
        catch (NullPointerException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String args[])
    {
        Exceptions exception = new Exceptions();
        exception.arrayIndexOutOfBoundsException();
        exception.negativeArraySizeException();
        exception.nullPointerException();

    }
}
