public class NameMaker {

    static String makeName(String name) {
        if(name.length()>0){
            StringBuilder sb = new StringBuilder();
            String nameFirstLetter = name.substring(0,1).toUpperCase();
            String nameRest = name.substring(1).toLowerCase();
            sb.append(nameFirstLetter);
            sb.append(nameRest);
            return sb.toString();
        }
        else{
            return name;
        }

    }

}
