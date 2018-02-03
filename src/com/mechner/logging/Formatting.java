package com.mechner.logging;

public class Formatting {

    // TODO: single-threaded but make it thread-local anyway so we can use it elsewhere? Any zero-cost way to do both?
    private static StringBuilder sb = new StringBuilder(1024 * 8);

    public static CharSequence fmt(int intValue) {
        sb.setLength(0);
        sb.append(intValue);
        return sb;
    }

}
