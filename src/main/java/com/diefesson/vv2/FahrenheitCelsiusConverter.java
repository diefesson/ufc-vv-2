package com.diefesson.vv2;

public class FahrenheitCelsiusConverter {

    public static final double CMIN = 0;
    public static final double CMAX = 100;
    public static final double FMIN = 32;
    public static final double FMAX = 212;

    private FahrenheitCelsiusConverter() {
    }

    private static double map(double value, double fromMin, double fromMax, double toMin, double toMax) {
        double fromRange = fromMax - fromMin;
        double toRange = toMax - toMin;
        return (value - fromMin) * toRange / fromRange + toMin;
    }

    public static int toFahrenheit(int c) {
        return (int) Math.floor(map(c, CMIN, CMAX, FMIN, FMAX));
    }

    public static Integer toCelsius(int f) {
        return (int) Math.floor(map(f, FMIN, FMAX, CMIN, CMAX));
    }

}
