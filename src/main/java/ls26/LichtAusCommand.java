public class LichtAusCommand implements Command {
    private Licht licht;

    public LichtAusCommand(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void execute() {
        licht.setLichtAus();
    }

    @Override
    public void undo() {
        licht.setLichtAn();
    }
}
