package com.example.calculator;

public class Kalkulator {
        public double addAToB ( double a, double b){
            return a + b;
        }
        public double subtractAFromB ( double a, double b){
            return a - b;
        }


        public static void main (String[]args) {


            Kalkulator calculator = new Kalkulator();

            double result = calculator.subtractAFromB(20.5, 9.6);
            System.out.println("Result is:  " + result);
        }
}
