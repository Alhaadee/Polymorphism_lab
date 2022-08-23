package Athletes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SprinterTest {

    private Sprinter sprinter;

    @BeforeEach
    public void setUp(){
        this.sprinter = new Sprinter(11,"james","england", 23);
    }

    @Test
    public void canRun(){
        String actual = sprinter.run();
        String expected = "james is running";
        assertEquals(expected,actual);
    }
}
