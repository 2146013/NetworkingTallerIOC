package edu.escuelaing.AREP.webappexample;

import edu.escuelaing.AREP.nextspring.GetMapping;

public class MathServices {
    @GetMapping("/square")
    public static Double square(String n){
        Double number = Double.valueOf(n);
        return number * number;
    }
    @GetMapping("/PI")
    public static Double PI(String n){
        //Double number = Double.valueOf(n);
        return Math.PI;
    }
    @GetMapping("/strlength")
    public static String length(String s){
       return "The length of the string is : "+s.length();
    }
}