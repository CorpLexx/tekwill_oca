import java.util.ArrayList;

public class League {
    private String name;
    public final static int NR_OF_TEAMS = 20;
    public final static int POINTS_FOR_WIN = 3;
    public final static int POINTS_FOR_DRAW = 1;
    private ArrayList<Team> teams;


    public League(String name, ArrayList<Team> teams) {
        this.name = name;
        this.teams = teams;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public String getName() {
        return name;
    }


}
