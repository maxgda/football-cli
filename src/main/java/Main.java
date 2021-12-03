import model.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<MatchEvent> history = new LinkedList<>();
        history.add(new Corner(Team.GUEST, new MatchTime(110), "Kainz"));
        history.add(new Goal(Team.GUEST, new MatchTime(75), "Arnautovic", "Alaba"));
        history.add(new Goal(Team.GUEST, new MatchTime(45, 4), "Ronaldo").ownGoal());
        history.add(new Goal(Team.GUEST, new MatchTime(45, 2), "Holzhauser").ownGoal());
        history.add(new Goal(Team.HOME, new MatchTime(150), "Schöpf").penalty());
        history.add(new Goal(Team.HOME, new MatchTime(45, 1), "Arnautovic").penalty());
        history.add(new Goal(Team.GUEST, new MatchTime(90, 5), "Arnautovic", "Alaba"));
        history.add(new Goal(Team.HOME, new MatchTime(22), "Alaba", "Arnautovic"));
        history.add(new Goal(Team.HOME, new MatchTime(46), "Alaba", "Arnautovic"));
        history.add(new Goal(Team.GUEST, new MatchTime(-9), "<Illegal MatchTime>", "NN"));
        history.add(new Goal(Team.HOME, new MatchTime(20), "<Illegal Team>", "NN"));


        Collections.sort(history);

        System.out.println("Sorted:");
        for (MatchEvent matchEvent : history)
            System.out.println(matchEvent);

        System.out.println("\nGUEST:");
        for (MatchEvent matchEvent : history)
            if (matchEvent.getTeam() == Team.GUEST)
                System.out.println(matchEvent);

        System.out.println("\nHOME:");
        for (MatchEvent matchEvent : history)
            if (matchEvent.getTeam() == Team.HOME)
                System.out.println(matchEvent);
    }
}
