public class Team {
    private Player[] players;

    public Team(Player[] players) {
        this.players = players;
    }

    public void presentTeam(){
        for(Player p : players){
            p.printDescription();
            p.printShout();
            p.act();
        }
    }

}
