package by.tr.academy.tour;

import java.util.Objects;

public class AbroadTour extends BusTour{
    private String destinationCountry;
    private boolean viza;

    public AbroadTour(String tourName, String tourRoute, String tourDescription, double price, String date, String placeOfDeparture, String busType, int numberOfSeats, String destinationCountry, boolean viza) {
        super(tourName, tourRoute, tourDescription, price, date, placeOfDeparture, busType, numberOfSeats);
        this.destinationCountry = destinationCountry;
        this.viza = viza;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public boolean isViza() {
        return viza;
    }

    public void setViza(boolean viza) {
        this.viza = viza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbroadTour)) return false;
        if (!super.equals(o)) return false;
        AbroadTour that = (AbroadTour) o;
        return isViza() == that.isViza() && Objects.equals(getDestinationCountry(), that.getDestinationCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDestinationCountry(), isViza());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Страна: " + destinationCountry + '\'' +
                "Виза: " + viza;
    }
}
