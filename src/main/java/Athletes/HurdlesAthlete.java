package Athletes;

public class HurdlesAthlete extends Sprinter{

    private int strideLength;

    public HurdlesAthlete(int strideLength, int age, String name, int shoeSize, String nationality){
        super(shoeSize, name, nationality, age);
        this.strideLength = strideLength;
    }

    public String jump(){
        return "I am jumping";
    }
}
