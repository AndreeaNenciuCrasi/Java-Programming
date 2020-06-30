package com.example;

//Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
//
//        Your task is to make 'Past' function which returns time converted to milliseconds.
//
//        Example:
//        Past(0, 1, 1) == 61000
//        Input constraints: 0 <= h <= 23, 0 <= m <= 59, 0 <= s <= 59




public class Clock {
    public static int Past(int h, int m, int s)
    {
        return h * 3600000 + m * 60000 + s * 1000;
    }
}


//import java.time.Duration;
//
//public class Clock {
//    public static int Past(int h, int m, int s) {
//        return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
//    }
//}

//import java.util.concurrent.TimeUnit;
//
//public class Clock
//{
//    public static int Past(int h, int m, int s)
//    {
//        return (int)(TimeUnit.HOURS.toMillis(h) + TimeUnit.MINUTES.toMillis(m) + TimeUnit.SECONDS.toMillis(s));
//    }
//}