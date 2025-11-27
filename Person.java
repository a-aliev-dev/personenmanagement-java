public class Person {

    //Variablen für Person
    private final String name;
    private int alter;

    //Konstruktor
    public Person(String n, int a) {
        this.name = n;
        this.alter = a;
    }

    //getter für Personenmanagement
    public String getName() {
        return name;
    }
    public int getAlter() {
        return alter;
    }

    //toString methode überschreiben
    @Override
    public String toString() {
        return String.format("| %-20s | %-5d |", name, alter);
    }
}
