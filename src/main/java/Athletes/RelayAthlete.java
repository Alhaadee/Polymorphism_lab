package Athletes;

public class RelayAthlete extends  Sprinter{
    private int startPosition;

    public RelayAthlete(int startPosition, int age, int shoeSize, String name, String nationality){
        super(shoeSize, name, nationality, age);
        this.startPosition = startPosition;
    }

    public String passBaton(){
        return "I am passing the baton";
    }
}
