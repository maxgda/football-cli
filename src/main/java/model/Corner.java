package model;

public class Corner extends MatchEvent {

    public Corner(Team team, MatchTime matchTime, String player) {
        super(team, matchTime, player);
    }

    public String description() {
        return "Corner";
    }
}
