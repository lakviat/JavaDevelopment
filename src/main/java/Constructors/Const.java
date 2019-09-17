package Constructors;

import Inherritance.CondigBootcamp;

public class Const {
    //This is the constructor metho
    int age;
    private String name;

    public Const (){
        age = 21;
    }
    public void SetConst (String name) {
        this.name = name;
    }
    public String GetConst (){
        return this.name;
    }
}
