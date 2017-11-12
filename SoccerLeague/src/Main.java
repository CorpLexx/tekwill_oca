import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Mancester United FC", 30, 5, 3);
        Team team2 = new Team("Chelsea FC", 29, 5, 4);
        Team team3 = new Team("Liverpool FC", 25, 10 ,3);
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        League league1 = new League("Premier League", teams);
        System.out.println(league1.getName());
        System.out.println("-------------------");
        for (Team team: teams) {
            team.setTeamPoints(team.getWinGames() * league1.POINTS_FOR_WIN + team.getDrawGames() * league1.POINTS_FOR_DRAW);
            System.out.println(team.getName()+ ": "+team.getTeamPoints()+" points");
        }
    }
}
