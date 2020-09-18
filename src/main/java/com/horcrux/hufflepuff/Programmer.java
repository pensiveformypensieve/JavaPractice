package com.horcrux.hufflepuff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Programmer {

    List<String> list = new ArrayList<String>();

    public Programmer() {
    }

    public Collection<String> getLanguages(){

        List<String> newList = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++){
            newList.add(list.get(i));
        }

        return newList;
    }

    public void addLanguage(String language){
        list.add(language);
    }
}
