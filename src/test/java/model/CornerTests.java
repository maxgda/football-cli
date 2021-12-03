package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CornerTests {

    @Test
    public void createCorner() {
        Corner corner = new Corner(Team.GUEST, new MatchTime(2), "test-player");
        Assertions.assertEquals(corner.getTeam(), Team.GUEST);
    }

}
