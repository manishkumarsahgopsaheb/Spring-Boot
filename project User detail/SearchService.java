package com.example.spring_boot_App_1;

import java.util.HashMap;

public class SearchService {
    private HashMap<String,String> dataStore;

    public  SearchService()
    {
        dataStore = new HashMap<String,String>();
        dataStore.put("manish","Manish is A Great Batsman");
        dataStore.put("Ds-Algo","A must have skill");
    }

    public String search(String word) {
        return dataStore.get(word);
    }
}
