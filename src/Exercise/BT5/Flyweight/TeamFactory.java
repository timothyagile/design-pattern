package Exercise.BT5.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeamFactory {
    private static Map<String, Team> teamMap = new HashMap<>();

    public static Team getTeam(String name, String logo, String color) {
        if (!teamMap.containsKey(name)) {
            teamMap.put(name, new Team(name, logo, color));
        }
        return teamMap.get(name);
    }
}
