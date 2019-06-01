import java.io.*;
public class Fraction{
    private int numerator;
    private int denominator;

    public String toString(){
        int n = numerator;
        int d = denominator;
        System.out.println(n/d);
    }
public Fraction(int numberator, int denominator){ 
if(denominator == 0){
    throw new IllegalArgumentException("denominator is zero");
}
if(denominator < 0) {
        numerator *= -1;
        denominator *= -1;
}
}
public Fraction(int wholeNumber){
wholeNumber = numerator;
denominator = 1;
}
public Fraction(String fraction){
    String fraction = new String();
    fraction = fraction.trim();
    int fraction = Integer.parseInt(String);
}