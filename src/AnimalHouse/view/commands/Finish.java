package AnimalHouse.view.commands;

public class Finish extends Command {

    public Finish(ConsoleUI consoleUI) {
        super((consoleUI));
        description = "Завершить работу";
    }

    public void execute(){
        consoleUI.finish();
    }
}
