public class Pwd implements Command {
    public void execute(String[] args) {
        System.out.println("Вы находитесь в директории: ");
        System.out.println(System.getProperty("user.dir"));
    }
}
