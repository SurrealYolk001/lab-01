package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable{
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public void pet(){
        System.out.println(getName() + "wags its tail!");
    }

    @Override
    public String speak(){
        return "bark";
    }


}
