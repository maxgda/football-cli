package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;


public class CornerTests {

    @Test
    public void createCorner() {
        MatchTime matchTime = Mockito.mock(MatchTime.class);
        Mockito.when(matchTime.getBasetime()).thenReturn(0);
        Corner corner = new Corner(Team.GUEST, matchTime, "test-player");
        Assertions.assertEquals(corner.getTeam(), Team.GUEST);
    }

}
