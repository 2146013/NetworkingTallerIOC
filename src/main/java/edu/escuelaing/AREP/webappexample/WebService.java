package edu.escuelaing.AREP.webappexample;

import edu.escuelaing.AREP.nextspring.GetMapping;


class WebServices {
    @GetMapping("/fecha")
    public static String date(String s){
        return java.time.LocalTime.now().toString();
    }
}
