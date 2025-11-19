package org.example;

import me.xdrop.fuzzywuzzy.FuzzySearch;

public class Main {
    public static void main(String[] args) {
        System.out.println(FuzzySearch.tokenSetRatio("Vietnam Vietnam", "vietnam russia joint venture bank")); // 100
        System.out.println(FuzzySearch.weightedRatio("Vietnam Vietnam", "vietnam russia joint venture bank")); // 100
//        System.out.println(FuzzySearch.tokenSetRatio("Vladimir Ostrovski", "Vladimir Padrino Lopez")); // 62
    }
}