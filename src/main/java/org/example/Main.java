package org.example;

import me.xdrop.fuzzywuzzy.FuzzySearch;

public class Main {
    public static void main(String[] args) {
        System.out.println(FuzzySearch.tokenSetRatio("Vladimir", "Vladimir"));
        System.out.println(FuzzySearch.tokenSetRatio("Vladimir Ostrovski", "Vladimir Padrino Lopez"));
    }
}