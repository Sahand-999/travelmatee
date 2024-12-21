package travelmate;

import java.util.ArrayList;
import java.util.List;

class Hotel extends Accommodation {
    public Hotel(int id, String name, String address) {
        super(id, name, address);
    }

    @Override
    public void displayDetails() {
        System.out.println("Hotel Details: " + getName() + ", " + getAddress());
    }

    public static Accommodation[] getAccommodationsForCity(City city) {
        List<Accommodation> hotels = new ArrayList<>();
        switch (city.getName().toLowerCase()) {
            case "erbil":
                hotels.add(new Hotel(1, "Divan Erbil", "Gulan Street, Erbil"));
                hotels.add(new Hotel(2, "Erbil Rotana", "100 Meter Road, Erbil"));
                break;
            case "sulaymaniyah":
                hotels.add(new Hotel(3, "Grand Millennium Hotel", "Bakhtiary, Sulaymaniyah"));
                hotels.add(new Hotel(4, "Ramada Sulaymaniyah", "Salim Street, Sulaymaniyah"));
                break;
            case "duhok":
                hotels.add(new Hotel(5, "Kristal Hotel", "Zakho Street, Duhok"));
                hotels.add(new Hotel(6, "Parwar Hotel", "KRO District, Duhok"));
                break;
        }
        return hotels.toArray(new Accommodation[0]);
    }
}