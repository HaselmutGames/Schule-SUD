package ls04.mitarbeiter;

public abstract class Mitarbeiter {
    private int id;
    private String name;

    protected Mitarbeiter(int id, String name) {
        setId(id);
        setName(name);
    }

    protected void setId(int id) {
        if(id < 1000 || id > 9999){
            throw new IllegalArgumentException("Die ID muss vierstellig und positiv sein.");
        }
        this.id = id;
    }

    public int getId() {
        return id;
    }

    protected void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Der Name darf nicht leer sein.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double einkommen(); // Abstrakte Methode, die in den Unterklassen implementiert werden muss

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
