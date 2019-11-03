package com.oyol.seven.composite;

import java.util.ArrayList;
import java.util.List;

public class Emplayee {
    private String name;
    private String phoneNum;
    // 下属集合
    private List<Emplayee> emplayees;

    public Emplayee(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
        emplayees = new ArrayList<Emplayee>();
    }

    public void add(Emplayee emplayee){
        this.emplayees.add(emplayee);
    }

    public void remove(Emplayee emplayee){
        this.emplayees.remove(emplayee);
    }

    public List<Emplayee> getChildren(){
        return this.emplayees;
    }

    public String toString(){
        return "Emplayee:[name:"+this.name+", phoneNum:"+this.phoneNum+"]";
    }
}
