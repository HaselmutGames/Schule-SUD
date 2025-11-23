class StereoAusCommand implements Command {
    private Stereoanlage stereo;

    public StereoAusCommand(Stereoanlage stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.ausschalten();
    }

    @Override
    public void undo() {
        stereo.anschalten();
        stereo.spieleCDAb();
    }
}
