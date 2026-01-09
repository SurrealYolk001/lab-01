package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    protected Date RecordedMoodDate;
    public Mood(){
        this.RecordedMoodDate = new Date();
    }

    public Mood(Date RecordedMoodDate){
        this.RecordedMoodDate = RecordedMoodDate;
    }

    public Date getRecordedMoodDate() {
        return RecordedMoodDate;
    }

    public void setRecordedMoodDate(Date recordedMoodDate) {
        RecordedMoodDate = recordedMoodDate;
    }

    public abstract String getMood();
}
