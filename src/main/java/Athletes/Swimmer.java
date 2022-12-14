package Athletes;

public class Swimmer extends Athlete{
    private boolean hasGoggles;

    public Swimmer(boolean hasGoggles, int age, String name,String originCountry ){
        super( name, originCountry, age);
        this.hasGoggles = hasGoggles;
    }


    public String dive(){
        return String.format("%s dived into the pool",this.name);
    }

    public String train(){
        return String.format("%s is training in the swimming pool",name);
    }

}
