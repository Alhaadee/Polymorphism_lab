package Stadiums;

import Athletes.Athlete;
import Athletes.RelayAthlete;
import Athletes.Sprinter;
import Athletes.Swimmer;
import Stadium.Stadium;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StadiumTest {

    private Stadium stadium;
    private RelayAthlete relayAthlete;
    private Swimmer swimmer;

    @BeforeEach
    public void Setup(){
        this.stadium = new Stadium(100,"wembley");
        this.swimmer = new Swimmer(true,20,"john","england");
        this.relayAthlete = new RelayAthlete(1,20,10,"john","england");
    }

    @Test
    public void canAddAthlete(){
        stadium.addAthlete(swimmer);
        stadium.addAthlete(relayAthlete);
        int expected = 2;
        int actual = stadium.getAthletes().size();
        assertEquals(expected,actual);
    }
}
