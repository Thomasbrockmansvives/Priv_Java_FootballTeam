public class Main {
    public static void main(String[] args) {
        try {

            Player joangarcia = new Goalkeeper("joan", "GARCIA", 24, "Spanish", "brown", "brown");
            Player ericgarcia = new Defender("Eric","Garcia",25, "Spanish", "brown","brown");
            Player juleskounde = new Defender("Jules", "kounde", 27, "French", "brown", "brown");
            Player alejandrobalde = new Defender("alejandro", "balde", 22, "Spanish", "brown", "black");
            Player paucubarsi = new Defender("Pau", "Cubarsi", 19, "Spanish", "brown", "brown");
            Player pedri = new Midfielder("","Pedri",23, "Spanish", "brown", "brown");
            Player frenkiedejong = new Midfielder("frenkie", "de jong",28, "Dutch", "green", "blond");
            Player ferminlopez = new Midfielder("fermin", "lopez",22, "Spanish","brown", "blond");
            Player raphinha = new Winger("","Raphinha", 29, "Brasilian", "brown", "brown");
            Player lamineyamal = new Winger("Lamine","Yamal", 18, "Spanish", "brown", "white");
            Player robertlewandowski = new Attacker("Robert","Lewandowski",37, "Polish", "green", "black");



            Player[] players = {joangarcia, ericgarcia, juleskounde, alejandrobalde, paucubarsi, pedri, frenkiedejong, ferminlopez, raphinha, lamineyamal, robertlewandowski};
            Team barcelona = new Team(players);
            barcelona.presentTeam();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
