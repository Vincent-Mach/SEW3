package persMgmt;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class PersMgmtTester {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        Set<City> cities = new HashSet<>();
        // Felix, 3 cities
        cities.add(new City(4780, "Schärding"));
        cities.add(new City(1210, "Wien"));
        cities.add(new City(4600, "Wels"));
        persons.add(new Person("Felix", 2001, cities));
        cities.clear();
        // Manuela, 2 cities
        cities.add(new City(4861, "Schörfling am Attersee"));
        cities.add(new City(4910, "Ried im Innkreis"));
        persons.add(new Person("Manuela", 2003, cities));
        cities.clear();
        // David, 1 city
        persons.add(new Person("David", 1999, new City(4020, "Linz")));
        System.out.println(persons);
    }
}
