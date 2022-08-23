package Athletes;

import interfaces.IWearShoes;

public class Sprinter extends  Athlete implements IWearShoes {

    private int shoeSize;

    public Sprinter(int shoeSize, String name, String nationality, int age){
        super(name, nationality, age);
        this.shoeSize = shoeSize;
    }

    public String run(){
        return String.format("%s is running",name);
    }

    public String train(){
        return String.format("%s is training at the track",name);
    }


//    implementing the interface
    @Override
    public String wearShoes() {
        return String.format("%s is wearing his running shoes");
    }
}
