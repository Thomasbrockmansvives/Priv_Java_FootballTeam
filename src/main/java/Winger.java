public class Winger extends Player implements  Actionable{

    public Winger(String firstName, String secondName, int age, String nationality, String colorEyes, String colorHair) {

        super(firstName, secondName, age, nationality, colorEyes, colorHair);
        this.position = "winger";

    }

    public void act(){
        System.out.println("Look at that speed.");
    }

    public void printShout(){
        System.out.println("Play it through, in my run !!");
    }

}
