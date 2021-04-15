import java.util.HashMap;

public class IDandPassword {


    HashMap<String, String> loginInfos = new HashMap<>();

    IDandPassword() {
        loginInfos.put("cat", "kittyCat");
        loginInfos.put("dog", "wofwof");
        loginInfos.put("dainel", "markoski");

    } // constructor

    protected HashMap getLoginInfos() {
        return loginInfos;
    } // getter
}
