package Stadium;

import Athletes.Athlete;
import interfaces.IWearShoes;

import java.util.ArrayList;

public class Stadium {

    private int attendance;
    private String name;
    private ArrayList<Athlete> athletes;

    private ArrayList<IWearShoes> needsShoes;


    public  Stadium( int attendance, String name){
        this.attendance = attendance;
        this.name = name;
        this.athletes = new ArrayList<>();
        this.needsShoes = new ArrayList<>();
    }

    public void addAthlete(Athlete athlete){
        athletes.add(athlete);
    }

    public ArrayList<Athlete> getAthletes(){
        return athletes;
    }


//    Adding athletes who require shoes to an array list..
    public void addShoeAthlete(IWearShoes wearsShoes){
        needsShoes.add(wearsShoes);
    }

    public ArrayList<IWearShoes> getNeedsShoes(){
        return  needsShoes;
    }



    public int getAttendance(){
        return attendance;
    }

    public void setAttendance(int attendance){
        this.attendance = attendance;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
