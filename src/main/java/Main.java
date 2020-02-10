public class Main {
    public static void main(String[] args) {
        Logging object = new Logging();
        String password ="Phindile@";
        object.PasswordIsValid(password);
        System.out.println(object.PasswordIsOk(password));

    }
}
