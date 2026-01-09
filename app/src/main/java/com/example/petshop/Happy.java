package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {

    public Happy(){
        super();
    }

    public Happy(Date RecordedMoodDate){
        super(RecordedMoodDate);
    }

    @Override
    public String getMood(){
        return "happy!";
    }
}
