package com.hakim;

public enum MorseCode {
    A(".-"),
    B("-..."),
    C("-.-."),
    D("-.."),
    E("."),
    F("..-."),
    G("--.");

    private final String code;

    MorseCode(String code){
        this.code=code;
    }
}
