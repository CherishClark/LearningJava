package com.cherishclark;



public class Main {

    public static void main(String[] args) {
	    repeatStr(5, "howdy");
    }

    public static String repeatStr(final int repeat, final String string) {

        if(repeat > 0 ) {
            repeatStr(repeat-1, string);
            return string;

        }
    }
}
