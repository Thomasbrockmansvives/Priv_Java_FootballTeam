public class Defender extends Player implements  Actionable{

    public Defender(String firstName, String secondName, int age, String nationality, String colorEyes, String colorHair) {

        super(firstName, secondName, age, nationality, colorEyes, colorHair);
        this.position = "defender";

    }

    public void act(){
        System.out.println("That looks like a sturdy player...");
    }

    public void printShout(){
        System.out.println("Ok guys, let's build a wall !!");
    }

}
