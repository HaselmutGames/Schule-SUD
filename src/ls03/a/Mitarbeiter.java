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
    private final String regex = "^[a-zA-Z]*$";

    public static void main(String[] vargs) {
        final Mitarbeiter mitarbeiter = new Mitarbeiter();

        mitarbeiter.setId(10);
        mitarbeiter.setName("Hola");
        System.out.println("Id \t" + "| \t" + "Name");
        System.out.println(mitarbeiter.getId() + "\t" + "|" + "\t" + mitarbeiter.getName());
    }

    public void setId(int id) {
        if (id < 0) {
            this.id = -id;
        } else {
            this.id = id;
        }
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        if (name.matches(regex) && !name.isEmpty() && name != null && !name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Entered String" + name + "for name was not valid!");
        }
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}