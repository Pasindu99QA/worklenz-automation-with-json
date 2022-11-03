package org.example;

public class Member {
    private  String name;

    public String getName(){
        this.name=name;
        return name;
    }
    public void setName(String name){
        this.name=name;
    }


    @Override
    public String toString() {
        return "[name="+name+"]";
    }
}
