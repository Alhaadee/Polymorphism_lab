package Athletes;

public class Swimmer extends Athlete{
    private boolean hasGoggles;

    public Swimmer(boolean hasGoggles, int age, String name,String nationality ){
        super( name, nationality, age);
        this.hasGoggles = hasGoggles;
    }


    public String dive(){
        return String.format("%s dived into the pool",this.name);
    }
}
