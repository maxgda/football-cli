package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MatchTimeTests {

    @Test
    @DisplayName("when matchTime is smaller than 0 set baseTime to 0")
    void whenMatchTimeSmallerThanZero_thanBaseTimeZero() {
        MatchTime matchTime = new MatchTime(-1);
        Assertions.assertEquals(0, matchTime.getBasetime());
    }


    @Test
    @DisplayName("when matchTime is valid - happy path")
    void happyPath() {
        MatchTime matchTime = new MatchTime(1);
        Assertions.assertNotNull(matchTime);
        Assertions.assertEquals(1, matchTime.getBasetime());
    }

    @Test
    @DisplayName("when constructing, overtime is set to 0")
    void overTimeSetToZeroOnConstruction() {
        MatchTime matchTime = new MatchTime(1);
        Assertions.assertEquals(0, matchTime.getOvertime());
    }




}
