/*
 *isabelle andre
 * 14/06/18
 * converts seconds into minutes and hours, format into 00h 00m 00s, constants
 */

package com.isabelle;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";        //constant Maj cant change

    public static void main(String[] args) {
        getDurationString(3660);
    }

    public static String getDurationString (int minutes, int seconds) {
        int nhours;
        int nremainingmin;
        int nseconds;

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        nhours = (int) (minutes/60);
        nremainingmin = (int) (minutes % 60);
        nseconds = seconds;
        System.out.println(minutes +" minutes " +seconds +" seconds = " +nhours +"h " +nremainingmin +"m " +nseconds +"s");

        //BONUS
        String shours = nhours +"h ";
        String smin = nremainingmin +"m ";
        String ssec = nseconds +"s ";

        if (nhours < 10) {
            shours = "0" +shours;
        }
        if (nremainingmin < 10) {
            smin = "0" +smin;
        }
        if (nseconds < 10) {
            ssec = "0" +ssec;
        }
        System.out.println(minutes +" minutes " +seconds +" seconds = " +shours +smin +ssec);
        return nhours +"h " +nremainingmin +"m " +nseconds +"s";
    }

    public static String getDurationString (int seconds) {
        int min;
        int remainingsec;
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        min = (int) (seconds/60);
        remainingsec = (int) (seconds % 60);
        System.out.println(seconds +" seconds = " +min +"m " +remainingsec +"s");
        return getDurationString(min, remainingsec);
    }


}
