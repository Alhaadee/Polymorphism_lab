package Athletes;

public class Cyclist extends Athlete {
    private String bikeType;

    public  Cyclist(String bikeType, int age, String nationality, String name){
        super(name, nationality, age);
        this.bikeType = bikeType;
    }


    public String ride(){
        return String.format("%s is cycling",name);
    }
}
