import java.util.Locale;

abstract class Player implements Actionable{
    private String firstName;
    private String secondName;
    private int age;
    private String colorEyes;
    private String colorHair;
    protected String position;
    private String nationality;

    public Player(String firstName, String secondName, int age, String nationality, String colorEyes, String colorHair) {

        this.firstName = NameMaker.makeName(firstName);

        this.secondName = NameMaker.makeName(secondName);

        if(age < 16 || age > 45){
            throw new AgeException();
        }
        else {
            this.age = age;
        }
        this.nationality = nationality;
        this.colorEyes = colorEyes;
        this.colorHair = colorHair;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return firstName + " " + secondName;
    }

    public String getColorEyes(){
        return this.colorEyes;
    }

    public String getColorHair(){
        return this.colorHair;
    }

    public String getPosition(){
        return this.position;
    }

    public String getNationality(){
        return this.nationality;
    }

    abstract void printShout();

    public void printDescription(){
        System.out.println("As a " + getPosition() + ", we have " + getName() + " (" + getAge() + ", " + getNationality() + "). He has " + getColorHair() + " hair and " + getColorEyes() + " eyes.");
    }
}
