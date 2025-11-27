public class Personenmanagement {
    private final Person[] personen;
    private int count = 0;

    //Konstruktor
    public Personenmanagement(int anzahl) {
        if (anzahl > 0) {
            personen = new Person[anzahl];
        } else {
            throw new IllegalArgumentException("Anzahl muss größer als 0 sein");
        }
    }

    //methode zum Hinzufügen
    public void add(Person p) {
        if (count == 0) {
            System.out.println("Keine Personen im Array.");
            return;
        }
        for (int i = 0; i < personen.length; i++) {
            if (personen[i] == null) {
                personen[i] = p;
                count++;
                return;
            }
        }
        throw new IllegalStateException("Array ist voll!");
    }

    //methode zum Entfernen
    public void remove(Person p) {
        if (p == null) {
            throw new IllegalArgumentException("Person darf nicht null sein");
        }
        for(int i = 0; i < personen.length; i++) {
            if (personen[i] == p) {
                personen[i] = null;
                count--;
                return;
            }
        } throw new IllegalArgumentException("Person wurde nicht gefunden");
    }

    //methode um nach name zu suchen
    public Person findByName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name darf nicht null sein");
        }
        for (int i = 0; i < personen.length; i++) {
            if (personen[i] != null && personen[i].getName().equals(name)) {
                return personen[i];
            }
        }
        throw new IllegalArgumentException("Person wurde nicht gefunden");
    }

    //methode um nach namen zu löschen
    public void removeByName(String name) {
        Person p = findByName(name);
        remove(p);
    }

    //methode um Durchschnittsalter zu berechnen
    public double getAverageAge() {
        double summe = 0;
        for (int i = 0; i < personen.length; i++) {
            if (personen[i] != null) {
                summe += personen[i].getAlter();
            }
        }
        if (count != 0) {
            return summe / count;
        }
        throw new IllegalArgumentException("Durchschnitt kann nicht berechnet werden!");
    }

    //methode älteste Person ausgeben
    public void printOldestPerson() {
        if (count == 0) {
            throw new IllegalStateException("Array ist leer! Es gibt keine älteste Person");
        }
        int oldest = -1;
        for (int i = 0; i < personen.length; i++) {
            if (personen[i] != null) {
                oldest = personen[i].getAlter();
                break;
            }
        }
        for (int i = 0; i < personen.length; i++) {
            if ((personen[i] != null) && (personen[i].getAlter() > oldest )){
                oldest = personen[i].getAlter();
            }
        }
        System.out.println("Älteste Person/ Personen: ");
        System.out.println("--------------------------------");
        System.out.printf("| %-20s | Alter |\n", "Name");
        System.out.println("--------------------------------");
        for (int i = 0; i < personen.length; i++) {
            if ((personen[i] != null) && (personen[i].getAlter() == oldest )) {
                System.out.println(personen[i].toString());
            }
        }
        System.out.println("--------------------------------");
    }

    //methode um das Array auszugeben
    public void printAll() {
        if (count == 0) {
            throw new IllegalStateException("Keine Personen im Array");
        }
        System.out.println("Personenmanagement");
        System.out.println("--------------------------------");
        System.out.printf("| %-20s | Alter |\n", "Name");
        System.out.println("--------------------------------");
        for (int i = 0; i < personen.length; i++) {
            if (personen[i] != null) {
                System.out.println(personen[i].toString());
            }
        }
        System.out.println("--------------------------------");
    }
}
