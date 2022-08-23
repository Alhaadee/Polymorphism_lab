package Athletes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CyclistTest {

    private Cyclist cyclist;

    @BeforeEach
    public void setUp(){
        this.cyclist = new Cyclist("bmx",20,"england","john");
    }


//    Testing the superclass methods of Athlete
    @Test
    public void canRide(){
        String actual = cyclist.ride();
        String expected = "john is cycling";
        assertEquals(expected,actual);
    }

    @Test
    public void canTrain(){
        String actual = cyclist.train();
        String expected = "john is training";
        assertEquals(expected,actual);
    }

    @Test
    public void canTrain__With_Argument(){
        String actual = cyclist.train("velodrome");
        String  expected = "john is training at the velodrome";
        assertEquals(expected,actual);
    }

    @Test
    public void canWinMedal(){
        String actual = cyclist.winMedal();
        String expected = "john won a medal!";
        assertEquals(expected,actual);
    }
}
