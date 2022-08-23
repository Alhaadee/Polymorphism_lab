package Athletes;

public abstract class Athlete {

    private int age;
    protected String name;
    private String nationality;


    public Athlete(String name, String nationality, int age){
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public String winMedal(){
        return String.format("%s won a medal!",this.name);
    }

    public String train(){
        return String.format("%s is training",name);
    }

    public String train(String location){
        return  String.format("%s is training at the %s",name,location);
    }
}
