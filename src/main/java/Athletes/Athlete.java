package Athletes;

public abstract class Athlete {

    private int age;
    protected String name;
    private String originCountry;


    public Athlete(String name, String originCountry, int age){
        this.name = name;
        this.originCountry = originCountry;
        this.age = age;
    }



//    METHOD OVERLOADING
    public String winMedal(){
        return String.format("%s won a medal!",this.name);
    }
    public String winMedal(String finishingPosition){
        return  String.format("%s finished with a %s medal!",name,finishingPosition);
    }

//     ABSTRACT METHOD EXAMPLE BELOW
    public abstract String train();


}


