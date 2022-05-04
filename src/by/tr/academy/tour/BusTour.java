package by.tr.academy.tour;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class BusTour extends Tour implements Guide, Serializable, Comparable, Cloneable{
    private String busType;
    private int numberOfSeats;

    public BusTour(String tourName, String tourRoute, String tourDescription, double price, String date, String placeOfDeparture, String busType, int numberOfSeats) {
        super(tourName, tourRoute, price, date, placeOfDeparture);
        this.busType = busType;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String selectGuide(List<String> guides, String guide) {
        return guide;
    }

    @Override
    public String selectLanguage(List<String> languages, String language) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusTour)) return false;
        if (!super.equals(o)) return false;
        BusTour busTour = (BusTour) o;
        return numberOfSeats == busTour.numberOfSeats && Objects.equals(busType, busTour.busType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), busType, numberOfSeats);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Тип автобуса: " + busType + '\'' +
                "Количество сидений: " + numberOfSeats;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
