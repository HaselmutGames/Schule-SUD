package ls03.c;

public abstract class Mitarbeiter {
    private int id;
    private String name;

    public Mitarbeiter(int id, String name) {
        setId(id);
        setName(name);
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Die ID darf nicht negativ sein. Gegeben: " + id);
        }
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Der Name darf nicht leer oder null sein.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstrakte Methode für das Einkommen
    public abstract double einkommen();

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}