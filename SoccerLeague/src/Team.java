public class Team {
    private String name;
    private int winGames;
    private int drawGames;
    private int loseGames;
    private int teamPoints;
    private int rank;


    public Team(String name, int winGames, int drawGames, int loseGames) {
        this.name = name;
        this.winGames = winGames;
        this.drawGames = drawGames;
        this.loseGames = loseGames;
    }

    public void setTeamPoints(int teamPoints) {
        this.teamPoints = teamPoints;
    }

    public String getName() {
        return name;
    }

    public int getWinGames() {
        return winGames;
    }

    public int getDrawGames() {
        return drawGames;
    }

    public int getLoseGames() {
        return loseGames;
    }

    public int getTeamPoints() {
        return teamPoints;
    }
}
