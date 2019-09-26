package com.example.imgstreamproject.utils;

public class MathUtil {

    /**
     * Knowing the proportional relation between two given values A and B, and the value of Y that we are gonna use to get the value of X
     *
     * @param knownA The first one of the known relation's values
     * @param knownB The second one of the known relation's values
     * @param knownY The value used for calculate X
     * @return X - The result. Y multiplied for B, divided for A
     */
    public static Double ruleOfThree(Double knownA, Double knownB, Double knownY) {
        return (knownY * knownB) / knownA;
    }

}
