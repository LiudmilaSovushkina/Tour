package by.tr.academy.tour;

import java.util.Objects;

public abstract class Tour {
    private String tourName;
    private String tourRoute;
    private double price;
    private String date;
    private String placeOfDeparture;

    public Tour(String tourName, String tourRoute, double price, String date, String placeOfDeparture) {
        this.tourName = tourName;
        this.tourRoute = tourRoute;
        this.price = price;
        this.date = date;
        this.placeOfDeparture = placeOfDeparture;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getTourRoute() {
        return tourRoute;
    }

    public void setTourRoute(String tourRoute) {
        this.tourRoute = tourRoute;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlaceOfDeparture() {
        return placeOfDeparture;
    }

    public void setPlaceOfDeparture(String placeOfDeparture) {
        this.placeOfDeparture = placeOfDeparture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tour)) return false;
        Tour tour = (Tour) o;
        return Double.compare(tour.getPrice(), getPrice()) == 0 && Objects.equals(getTourName(), tour.getTourName()) && Objects.equals(getTourRoute(), tour.getTourRoute()) && Objects.equals(getDate(), tour.getDate()) && Objects.equals(getPlaceOfDeparture(), tour.getPlaceOfDeparture());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTourName(), getTourRoute(), getPrice(), getDate(), getPlaceOfDeparture());
    }

    @Override
    public String toString() {
        return "Тур: " + tourName + '\n' +
                "Маршрут тура: " + tourRoute + '\n' +
                "Стоимость: " + price + "$" + '\n' +
                "Даты тура: " + date + '\n' +
                "Место отправления: " + placeOfDeparture + '\n';
    }
}
