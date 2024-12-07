/**
 * @author Hammoud Aldalati
 * @version 27.11.2024
 *
 * Implementierung der Klasse Mitarbeiter mit 2 Attributen/Eigenschaften
 * Id und Name
 * Entsprechend sind getter und setter fuer die Attribute vorhanden
 * */

package ls03.a;

public class Mitarbeiter {
    private int id;
    private String name;

    // Setter fuer ID mit Fehlerabfang
    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Die ID darf nicht negativ sein.");
        }
        this.id = id;
    }

    // Getter fuer ID
    public int getId() {
        return id;
    }

    // Setter fuer Name mit Fehlerabfang
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Der Name darf nicht leer sein.");
        }
        this.name = name;
    }

    // Getter fuer Name
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
