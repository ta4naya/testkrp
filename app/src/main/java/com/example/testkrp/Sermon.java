package com.example.testkrp;

public class Sermon {
    private String name,days;
    private int ImageResourceId;


    public static final Sermon [] sermons ={
            new Sermon("Sunday Sermons","Sundays", R.drawable.sermon),
            new Sermon("Early Favour Hour","Monday-Friday", R.drawable.early),
            new Sermon("Digging Deep","Tuesdays", R.drawable.digdeep),
            new Sermon("Faith Clinic","Thursday", R.drawable.fclinic),
            new Sermon("Friday Meetings","Fridays", R.drawable.friday),
            new Sermon("Workers Meeting","Tuesdays", R.drawable.worker),
            new Sermon("Monday dew","Fridays", R.drawable.monday),
            new Sermon("Mentorship","Wednesdays", R.drawable.mentorship),
            new Sermon("Special Services","Miscellaneous", R.drawable.mentorship),

    };

    private Sermon( String name, String day, int ImageResourceId) {
        this.name =name;
        this.days =day;
        this.ImageResourceId = ImageResourceId;


    }
    public String getName() {
        return name;
    }
    public String getDay() {
        return days;
    }
    public int getImageResourceId() {
        return ImageResourceId;
    }

}
