package Athletes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwimmerTest {

    private Swimmer swimmer;

    @BeforeEach
    public void setUp(){
        this.swimmer = new Swimmer(true,20,"john","germany");
    }

    @Test
    public void canDive(){
        String actual = swimmer.dive();
        String expected = "john dived into the pool";
        assertEquals(expected,actual);
    }

    @Test
    public void canTrain(){
        String actual = swimmer.train();
        String expected = "john is training in the swimming pool";
        assertEquals(expected,actual);
    }
}
