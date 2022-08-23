package Athletes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HurdlesAthleteTest {

    private HurdlesAthlete hurdlesAthlete;

    @BeforeEach
    public void setUp(){
        this.hurdlesAthlete = new HurdlesAthlete(30,20,"james",12,"england");
    }

    @Test
    public void canJump(){
        String actual = hurdlesAthlete.jump();
        String expected = "james is jumping";
        assertEquals(expected,actual);
    }
}
