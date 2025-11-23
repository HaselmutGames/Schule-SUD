class StereoAnCommand implements Command {
    private Stereoanlage stereo;

    public StereoAnCommand(Stereoanlage stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.anschalten();
        stereo.legeCDEin("Greatest Hits");
        stereo.spieleCDAb();
        stereo.setLautstaerke(10);
    }

    @Override
    public void undo() {
        stereo.ausschalten();
    }
}
