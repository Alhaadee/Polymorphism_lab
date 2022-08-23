package Athletes;

public class RelayAthlete extends  Sprinter{
    private int startPosition;

    public RelayAthlete(int startPosition, int age, int shoeSize, String name, String nationality){
        super(shoeSize, name, nationality, age);
        this.startPosition = startPosition;
    }

    public String passBaton(){
        return String.format("%s is passing the baton to the next teammate",name);
    }
}
