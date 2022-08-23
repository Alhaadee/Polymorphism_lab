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


    @Test
    public void canRide(){
        String actual = cyclist.ride();
        String expected = "john is cycling";
        assertEquals(expected,actual);
    }


    @Test
    public void canTrain(){
        String actual = cyclist.train();
        String  expected = "john is training with his bmx bike";
        assertEquals(expected,actual);
    }

//    testing the superclass methods of athlete
    @Test
    public void canWinMedal(){
        String actual = cyclist.winMedal();
        String expected = "john won a medal!";
        assertEquals(expected,actual);
    }

    @Test
    public void canWinMedal__With__Argument(){
        String actual = cyclist.winMedal("gold");
        String expected = "john finished with a gold medal!";
        assertEquals(expected,actual);
    }
}
