package me.coding.interview.stream;

import java.util.Objects;

public class Trader {
    private final String name;
    private final City city;

    private Trader(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public static Trader of(String name, City city) {
        return new Trader(name, city);
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Trader trader = (Trader) o;
        return Objects.equals(getName(), trader.getName()) && Objects.equals(getCity(), trader.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity());
    }

    @Override
    public String toString() {
        return "Trader: " + name + " in " + city;
    }
}
