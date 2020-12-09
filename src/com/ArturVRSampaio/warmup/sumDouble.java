package com.ArturVRSampaio.warmup;

//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
public class sumDouble {

    public static int sum(int a, int b) {
        if (a==b){
            return((a + a)*2);
        }else {
            return (a+b);
        }

    }

}
