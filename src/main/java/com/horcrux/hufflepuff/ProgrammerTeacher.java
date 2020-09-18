package com.horcrux.hufflepuff;

public class ProgrammerTeacher extends Programmer {
    public boolean teach(Programmer programmer, String language){

        if ("language".equals(this.getLanguages())){
            return true;
        }
        else{
            return false;
        }
    }
}
