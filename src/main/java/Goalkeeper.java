public class Goalkeeper extends Player implements  Actionable{

    public Goalkeeper(String firstName, String secondName, int age, String nationality, String colorEyes, String colorHair) {

        super(firstName, secondName, age, nationality, colorEyes, colorHair);
        this.position = "goalkeeper";

    }

    public void act(){
        System.out.println("What a magnificent save he made there !");
    }

    public void printShout(){
        System.out.println("You shall not pass !!");
    }

}
