package by.tr.academy.tour;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class WalkingTour extends Tour implements Guide, Serializable, Comparable, Cloneable {

    private String lengthOfRoute;
    private String duration;

    public WalkingTour(String tourName, String tourRoute, double price, String date,
                       String placeOfDeparture, String lengthOfRoute, String duration) {
        super(tourName, tourRoute, price, date, placeOfDeparture);
        this.lengthOfRoute = lengthOfRoute;
        this.duration = duration;
    }

    public String getLengthOfRoute() {
        return lengthOfRoute;
    }

    public void setLengthOfRoute(String lengthOfRoute) {
        this.lengthOfRoute = lengthOfRoute;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String selectGuide(List<String> guides, String guide) {
        return guide;
    }

    @Override
    public String selectLanguage(List<String> languages, String language) {

        return language;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (this == o) return true;
        if (!(o instanceof WalkingTour)) return false;
        if (getClass() != o.getClass()) return false;
        WalkingTour that = (WalkingTour) o;
        return Objects.equals(getLengthOfRoute(), that.getLengthOfRoute()) && Objects.equals(getDuration(), that.getDuration());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLengthOfRoute(), getDuration());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Длина маршрута: '" + lengthOfRoute + '\n' +
                "Продолжительность: " + duration + '\n';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
