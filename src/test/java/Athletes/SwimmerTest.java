package Athletes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwimmerTest {

    private Swimmer swimmer;

    @Test
    public void canDive(){
        Swimmer swimmer = new Swimmer(true,20,"john","germany");
        String actual = swimmer.dive();
        String expected = "john dived into the pool";
        assertEquals(expected,actual);
    }
}
