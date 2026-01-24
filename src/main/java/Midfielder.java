public class Midfielder extends Player implements  Actionable{

    public Midfielder(String firstName, String secondName, int age, String nationality, String colorEyes, String colorHair) {

        super(firstName, secondName, age, nationality, colorEyes, colorHair);
        this.position = "midfielder";

    }

    public void act(){
        System.out.println("He has some flair...");
    }

    public void printShout(){
        System.out.println("Pass it around, pass it around...");
    }

}
