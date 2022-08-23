package Athletes;

import interfaces.IWearShoes;

public class Cyclist extends Athlete implements IWearShoes {
    private String bikeType;

    public  Cyclist(String bikeType, int age, String nationality, String name){
        super(name, nationality, age);
        this.bikeType = bikeType;
    }


    public String ride(){
        return String.format("%s is cycling",name);
    }

    public String train(){
        return String.format("%s is training with his %s bike",name,bikeType);
    }

    @Override
    public String wearShoes() {
        return String.format("%s is wearing his cycling shoes",name);
    }
}
