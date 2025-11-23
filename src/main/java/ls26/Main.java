public class Main {
    public static void main(String[] args) {
        Fernbedienung remote = new Fernbedienung();

        Licht licht = new Licht();
        Garage garage = new Garage();
        Stereoanlage stereo = new Stereoanlage();

        Command lichtAn = new LichtAnCommand(licht);
        Command lichtAus = new LichtAusCommand(licht);
        Command garageHoch = new GarageHochCommand(garage);
        Command garageRunter = new GarageRunterCommand(garage);
        Command stereoAn = new StereoAnCommand(stereo);
        Command stereoAus = new StereoAusCommand(stereo);

        Command[] macroOn = { lichtAn, garageHoch, stereoAn };
        Command[] macroOff = { stereoAus, garageRunter, lichtAus };

        Command macroCommandAn = new MacroCommand(macroOn);
        Command macroCommandAus = new MacroCommand(macroOff);

        remote.setCommand(0, lichtAn, lichtAus);
        remote.setCommand(1, garageHoch, garageRunter);
        remote.setCommand(2, stereoAn, stereoAus);
        remote.setCommand(3, macroCommandAn, macroCommandAus);

        System.out.println("--- Ablauf ---");
        remote.anGedoct(0);
        remote.undoGedrueckt();
        remote.anGedoct(1);
        remote.anGedoct(2);
        remote.undoGedrueckt();
        remote.undoGedrueckt();
        remote.anGedoct(3);
        remote.ausGedrueckt(3);
    }
}
