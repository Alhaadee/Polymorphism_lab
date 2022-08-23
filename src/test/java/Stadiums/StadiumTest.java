package Stadiums;

import Athletes.*;
import Stadium.Stadium;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StadiumTest {

    private Stadium stadium;
    private RelayAthlete relayAthlete;
    private Swimmer swimmer;
    private Sprinter sprinter;
    private Cyclist cyclist;
    private  Cyclist cyclist2;

    @BeforeEach
    public void setUp(){
        this.stadium = new Stadium(100,"wembley");
        this.swimmer = new Swimmer(true,20,"john","england");
        this.relayAthlete = new RelayAthlete(1,20,10,"jake","england");
        this.cyclist = new Cyclist("bmx",20,"germany","james");
        this.sprinter = new Sprinter(12,"mike","france",23);
        this.cyclist2 = new Cyclist("bmx",23,"england","sam");
    }

    @Test
    public void canAddAthlete(){
        stadium.addAthlete(swimmer);
        stadium.addAthlete(relayAthlete);
        int expected = 2;
        int actual = stadium.getAthletes().size();
        assertEquals(expected,actual);
    }

    @Test
    public void canAddShoeAthlete(){
        stadium.addShoeAthlete(cyclist2);
        stadium.addShoeAthlete(cyclist);
        stadium.addShoeAthlete(sprinter);
        stadium.addShoeAthlete(relayAthlete);
        int expected = 4;
        int actual = stadium.getNeedsShoes().size();
        assertEquals(expected,actual);
    }
}
