public class Main{
    public static void main(String[] args) {

        Personenmanagement pm = new Personenmanagement(20);

        pm.add(new Person("Max", 24));
        pm.add(new Person("Anna", 19));
        pm.add(new Person("Tom", 32));
        pm.add(new Person("Lena", 27));
        pm.add(new Person("Paul", 41));
        pm.add(new Person("Laura", 22));
        pm.add(new Person("Jonas", 35));
        pm.add(new Person("Sophia", 29));
        pm.add(new Person("Leon", 18));
        pm.add(new Person("Mia", 21));
        pm.add(new Person("Felix", 45));
        pm.add(new Person("Nina", 31));
        pm.add(new Person("Tim", 26));
        pm.add(new Person("Marie", 33));
        pm.add(new Person("Jan", 38));
        pm.add(new Person("Lisa", 23));
        pm.add(new Person("David", 28));
        pm.add(new Person("Sarah", 34));
        pm.add(new Person("Daniel", 40));
        pm.add(new Person("Emma", 20));


        pm.printAll();
    }
}
