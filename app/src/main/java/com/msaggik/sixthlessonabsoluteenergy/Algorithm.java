package com.msaggik.sixthlessonabsoluteenergy;

import org.w3c.dom.ls.LSOutput;

public class Algorithm {

    //
    float difference = 9.806f / 3.721f;
    float fuelPerOneKgInMars = 100.0f / difference;

    // создание пустого конструктора
    public Algorithm() {
    }

    public double Result(int mass){

        return (long) (mass * fuelPerOneKgInMars);
    }



}
