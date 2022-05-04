package by.tr.academy.tour;

import java.util.Objects;

public class OvernightBusTour extends AbroadTour{
    private String Hotel;
    private boolean breakfast;
    private  String apartmentFacilities;

    public OvernightBusTour(String tourName, String tourRoute, String tourDescription, double price, String date, String placeOfDeparture, String busType, int numberOfSeats, String destinationCountry, boolean viza, String hotel, boolean breakfast, String apartmentFacilities) {
        super(tourName, tourRoute, tourDescription, price, date, placeOfDeparture, busType, numberOfSeats, destinationCountry, viza);
        Hotel = hotel;
        this.breakfast = breakfast;
        this.apartmentFacilities = apartmentFacilities;
    }

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String hotel) {
        Hotel = hotel;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public String getApartmentFacilities() {
        return apartmentFacilities;
    }

    public void setApartmentFacilities(String apartmentFacilities) {
        this.apartmentFacilities = apartmentFacilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OvernightBusTour)) return false;
        if (!super.equals(o)) return false;
        OvernightBusTour that = (OvernightBusTour) o;
        return isBreakfast() == that.isBreakfast() && Objects.equals(getHotel(), that.getHotel()) && Objects.equals(getApartmentFacilities(), that.getApartmentFacilities());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHotel(), isBreakfast(), getApartmentFacilities());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Отель: " + Hotel + '\n' +
                "Завтрак: " + breakfast  + '\n' +
                "Удобства в отеле: " + apartmentFacilities + '\n';
    }
}
