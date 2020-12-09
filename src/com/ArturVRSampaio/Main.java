package com.ArturVRSampaio;

import com.ArturVRSampaio.warmup.*;


public class Main {

    public static void main(String[] args) {
        sleep();
        havetrouble();
        sumOrDouble();

    }


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

}
