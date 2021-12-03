package model;

public abstract class MatchEvent implements Comparable<MatchEvent> {

    private final MatchTime matchTime;
    private final String player;
    protected final Team team;

    public MatchEvent(Team team, MatchTime matchTime, String player) {
        this.team = team;
        this.matchTime = matchTime;
        this.player = player;
    }

    public String toString() {
        return String.format("%s %s: %s by %s", this.matchTime, this.team, this.description(), this.player);
    }

    public abstract String description();

    @Override
    public int compareTo(MatchEvent other) {
        return this.matchTime.compareTo(other.matchTime);
    }

    public Team getTeam() {
        return this.team;
    }


}
