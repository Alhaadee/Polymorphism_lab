package Athletes;

public class HurdlesAthlete extends Sprinter{

    private int strideLength;

    public HurdlesAthlete(int strideLength, int age, String name, int shoeSize, String originCountry){
        super(shoeSize, name, originCountry, age);
        this.strideLength = strideLength;
    }

    public String jump(){
        return String.format("%s is jumping",name);
    }

    public String train(){
        return String.format("%s is training his jumping skills",name);
    }

}
