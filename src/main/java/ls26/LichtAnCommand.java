public class LichtAnCommand implements Command {
    private Licht licht;

    public LichtAnCommand(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void execute() {
        licht.setLichtAn();
    }

    @Override
    public void undo() {
        licht.setLichtAus();
    }
}
