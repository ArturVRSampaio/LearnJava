package com.ArturVRSampaio.warmup2;

public class stringTimes {
    //Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    public static String times(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }
}
