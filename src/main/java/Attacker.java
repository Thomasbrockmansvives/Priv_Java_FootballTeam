public class Attacker extends Player implements  Actionable{

    public Attacker(String firstName, String secondName, int age, String nationality, String colorEyes, String colorHair) {

        super(firstName, secondName, age, nationality, colorEyes, colorHair);
        this.position = "attacker";

    }

    public void act(){
        System.out.println("That is one efficient player...");
    }

    public void printShout(){
        System.out.println("GOAL !!");
    }

}
