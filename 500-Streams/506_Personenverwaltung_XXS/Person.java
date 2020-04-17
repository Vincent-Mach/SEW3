package persMgmt;

import java.util.Collection;
import java.util.LinkedList;

public class Person {
    private String name;
    private int year;
    private Collection<City> cities = new LinkedList<>(); // Map|Set|Stack|DeQueue|...
    private transient int cityCount = 0;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Person(String name, int year, City city) {
        this(name, year);
        this.cities.add(city);
        cityCount = cities.size();
    }

    public Person(String name, int year, Collection<City> cities) {
        this(name, year);
        //this.cities.addAll(cities);
        //cityCount = cities.size();
        this.setCities(cities);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Collection<City> getCities() {
        return new LinkedList<>(cities);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCities(Collection<City> cities) {
        this.cities.clear();
        this.cities.addAll(cities);
        cityCount = cities.size();
    }

    public void addCity(City city) {
        this.cities.add(city);
        cityCount = cities.size();
    }

    public void removeCity(City city) {
        this.cities.remove(city);
        cityCount = cities.size();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", year=").append(year);
        sb.append(", cityCount=").append(cityCount);
        sb.append(", cities=").append(cities);
        sb.append('}').append('\n');
        return sb.toString();
    }
}
