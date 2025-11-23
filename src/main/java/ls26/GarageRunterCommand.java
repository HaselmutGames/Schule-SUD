class GarageRunterCommand implements Command {
    private Garage garage;

    public GarageRunterCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.runter();
    }

    @Override
    public void undo() {
        garage.hoch();
    }
}
