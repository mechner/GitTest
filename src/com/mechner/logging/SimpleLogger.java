package com.mechner.logging;

public final class SimpleLogger implements Logger {

    private StringBuilder sb = new StringBuilder(1024 * 8);

    @Override
    public void log(CharSequence message) {
        System.out.println(message);
    }

    @Override
    public void log(CharSequence message, CharSequence p1) {
        System.out.print(message);
        System.out.println(p1);
    }

}
