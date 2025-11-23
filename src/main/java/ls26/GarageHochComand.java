class GarageHochCommand implements Command {
    private Garage garage;

    public GarageHochCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.hoch();
    }

    @Override
    public void undo() {
        garage.runter();
    }
}
