package Athletes;

public abstract class Athlete {

    private int age;
    private String name;
    private String nationality;


    public Athlete(String name, String nationality, int age){
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public String winMedal(){
        return String.format("My name is %s, and I won a medal!",this.name);
    }

    public String train(){
        return "I am training";
    }
}
