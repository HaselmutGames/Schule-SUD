/**
 * @author Hammoud
 * @version 27.11.2024
 *
 * Implementierung der Klasse Mitarbeiter mit 2 Attributen/Eigenschaften
 * Id und Name
 * Entsprechend sind getter und setter für die Attribute vorhanden
 */

package ls03.a;

public class Mitarbeiter {
    private int id;
    private String name;

    /**
     * Parametrisierter Konstruktor zur Initialisierung von ID und Name.
     *
     * @param id   Die eindeutige Mitarbeiter-ID (muss positiv sein).
     * @param name Der Name des Mitarbeiters (darf nicht leer sein).
     */
    public Mitarbeiter(int id, String name) {
        setId(id); // Validierung durch Setter
        setName(name); // Validierung durch Setter
    }

    // Setter für ID mit Fehlerprüfung
    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Die ID darf nicht negativ sein. Gegeben: " + id);
        }
        this.id = id;
    }

    // Getter für ID
    public int getId() {
        return id;
    }

    // Setter für Name mit Fehlerprüfung
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Der Name darf nicht leer oder null sein.");
        }
        this.name = name;
    }

    // Getter für Name
    public String getName() {
        return name;
    }

    // toString-Methode
    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
