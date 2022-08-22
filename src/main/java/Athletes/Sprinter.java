package Athletes;

public class Sprinter extends  Athlete{

    private int shoeSize;

    public Sprinter(int shoeSize, String name, String nationality, int age){
        super(name, nationality, age);
        this.shoeSize = shoeSize;
    }

    public String run(){
        return "I am running!";
    }
}
