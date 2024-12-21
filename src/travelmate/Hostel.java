package travelmate;

import java.util.ArrayList;
import java.util.List;

class Hostel extends Accommodation {
    public Hostel(int id, String name, String address) {
        super(id, name, address);
    }

    @Override
    public void displayDetails() {
        System.out.println("Hostel Details: " + getName() + ", " + getAddress());
    }

    public static Accommodation[] getAccommodationsForCity(City city) {
        List<Accommodation> hostels = new ArrayList<>();
        switch (city.getName().toLowerCase()) {
            case "erbil":
                hostels.add(new Hostel(1, "Erbil Youth Hostel", "60 Meter Road, Erbil"));
                hostels.add(new Hostel(2, "SafeStay Erbil", "Ankawa District, Erbil"));
                break;
            case "sulaymaniyah":
                hostels.add(new Hostel(3, "Sulaymaniyah Backpackers", "City Center, Sulaymaniyah"));
                hostels.add(new Hostel(4, "Suli Hostel", "Azadi Park Area, Sulaymaniyah"));
                break;
            case "duhok":
                hostels.add(new Hostel(5, "Duhok Adventure Hostel", "Zakho Road, Duhok"));
                hostels.add(new Hostel(6, "Mountain Hostel Duhok", "Gali Zanta, Duhok"));
                break;
        }
        return hostels.toArray(new Accommodation[0]);
    }
}