package model;

public class Goal extends MatchEvent {


    private Type type = Type.REGULAR;
    private String assist;

    public Goal(Team team, MatchTime mt, String player) {
        super(team, mt, player);
    }

    public Goal(Team team, MatchTime matchTime, String player, String assist) {
        super(team, matchTime, player);
        this.assist = assist;
    }

    public Goal ownGoal() {
        this.type = Type.OWN_GOAL;
        return this;
    }

    public Goal penalty() {
        this.type = Type.PENALTY;
        return this;
    }

    public String typeString() {
        return this.type.toString();
    }

    public String description() {
        return "Goal";
    }

    public String toString() {
        String resultString = super.toString();
        if (this.assist != null)
            resultString = resultString + String.format(" (assist %s)", this.assist);

        switch (type) {
            case PENALTY:
                resultString = resultString + " P";
                break;
            case OWN_GOAL:
                resultString = resultString + " OG";
                break;
        }
        return resultString;
    }
}
