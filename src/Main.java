public class Main {

    public static void main(String[] args) {

        var idAndPassword = new IDandPassword();
        var loginPage = new LoginPage(idAndPassword.getLoginInfos());

    }
}
