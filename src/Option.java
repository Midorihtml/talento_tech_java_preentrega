import java.util.concurrent.Callable;

public class Option {
    private String title;
    private Callable command;

    public Option(String title, Callable command) {
        this.title = title;
        this.command = command;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCommand(Callable command) {
        this.command = command;
    }

    public void execute() throws Exception {
        this.command.call();
    }
}

