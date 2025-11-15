import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args){
    HashMap <String, String> names= new HashMap<>();
    names.put("matthew","max");
    names.put("michael","mix");
    names.put("arthur","artie");
    String s= names.get("matthew");
    System.out.println(s);
}
}
