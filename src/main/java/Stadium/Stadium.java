package Stadium;

import Athletes.Athlete;

import java.util.ArrayList;

public class Stadium {

    private int attendance;
    private String name;
    private ArrayList<Athlete> athletes;


    public  Stadium( int attendance, String name){
        this.attendance = attendance;
        this.name = name;
        this.athletes = new ArrayList<Athlete>();
    }

    public void addAthlete(Athlete athlete){
        athletes.add(athlete);
    }
}
