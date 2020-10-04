package com.horcrux.hufflepuff;

public class ProgrammerTeacher extends Programmer {
    public boolean teach(Programmer programmer, String language){

        if(this.getLanguages().contains(language)){
                programmer.addLanguage(language);
                return true;
        }
        return false;
    }
}
