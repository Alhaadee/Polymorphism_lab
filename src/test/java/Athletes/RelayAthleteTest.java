package Athletes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelayAthleteTest {

    private RelayAthlete relayAthlete;

    @BeforeEach
    public void setUp(){
        this.relayAthlete = new RelayAthlete(1,20,12,"john","spain");
    }

    @Test
    public void canPassBaton(){
        String actual = relayAthlete.passBaton();
        String expected = "john is passing the baton to the next teammate";
        assertEquals(expected,actual);
    }

    @Test
    public void canTrain(){
        String actual = relayAthlete.train();
        String expected = "john is training with teammates";
        assertEquals(expected,actual);
    }
}
