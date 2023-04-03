import java.util.*;

public class Shell {
    private Map<String, Command> commands;

    public Shell() {
        commands = new HashMap<>();
        commands.put("time", new Time());
        commands.put("date", new Date());
        commands.put("ls", new Ls());
        commands.put("pwd", new Pwd());
        commands.put("cd", new Cd());
        commands.put("exit", new Exits());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input;
        Command command;

        while (true) {
            System.out.print("> ");
            input = scanner.nextLine().trim();

            command = commands.get(input.split(" ")[0]);
            if (command == null) {
                System.out.println("Unknown command: " + input);
            } else {
                command.execute(input.split(" "));
            }
        }
    }
}
