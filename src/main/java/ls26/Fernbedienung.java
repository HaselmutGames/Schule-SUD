class Fernbedienung {

    Command[] anCommands;
    Command[] ausCommands;
    Command undoCommand;

    public Fernbedienung() {
        anCommands = new Command[7];
        ausCommands = new Command[7];

        Command noCommand = new Command() {
            public void execute() {
            }

            public void undo() {
            }
        };

        for (int i = 0; i < 7; i++) {
            anCommands[i] = noCommand;
            ausCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command anCommand, Command ausCommand) {
        anCommands[slot] = anCommand;
        ausCommands[slot] = ausCommand;
    }

    public void anGedoct(int slot) {
        anCommands[slot].execute();
        undoCommand = anCommands[slot];
    }

    public void ausGedrueckt(int slot) {
        ausCommands[slot].execute();
        undoCommand = ausCommands[slot];
    }

    public void undoGedrueckt() {
        undoCommand.undo();
    }
}
