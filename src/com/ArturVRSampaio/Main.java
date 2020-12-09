package com.ArturVRSampaio;

import com.ArturVRSampaio.warmup.*;
import com.ArturVRSampaio.warmup2.*;


public class Main {

    public static void main(String[] args) {
        //sleep();
        //havetrouble();
        //sumOrDouble();
        stimes();

    }

//warmup
    // will sleep more today???
    private static void sleep() {
        boolean weekday, vacation;
        weekday = true;
        vacation = false;
        sleepln slpn= new sleepln();
        System.out.println(slpn.willSleep(weekday,vacation));
    }
    // do we have some trouble???
    private static void havetrouble() {
        boolean aSmile, bSmile;
        aSmile = true;
        bSmile = false;
        monkeyTrouble trbl= new monkeyTrouble();
        System.out.println(trbl.trouble(aSmile,bSmile));
    }
    // sumdouble
    private static void sumOrDouble() {
        int a, b;
        a = 2;
        b = 2;
        sumDouble sum= new sumDouble();
        System.out.println(sum.sum(a,b));
    }

//warmup2
    // stringtimes
    private static void stimes() {
        String a= "123";
        int b= 3;

        stringTimes string= new stringTimes();
        System.out.println(string.times(a,b));
    }
}
