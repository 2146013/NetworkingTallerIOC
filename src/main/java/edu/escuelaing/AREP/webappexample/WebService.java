package edu.escuelaing.AREP.webappexample;

import edu.escuelaing.AREP.nextspring.GetMapping;

public class WebService {
    @GetMapping("/fecha")
    public static String date(String s){
        return java.time.LocalTime.now();
    }
}
