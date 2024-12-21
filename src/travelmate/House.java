package travelmate;

import java.util.ArrayList;
import java.util.List;

class House extends Accommodation {
    public House(int id, String name, String address) {
        super(id, name, address);
    }

    @Override
    public void displayDetails() {
        System.out.println("House Details: " + getName() + ", " + getAddress());
    }

    public static Accommodation[] getAccommodationsForCity(City city) {
        List<Accommodation> houses = new ArrayList<>();
        switch (city.getName().toLowerCase()) {
            case "erbil":
                houses.add(new House(1, "Villa Erbil 1", "Italian Village, Erbil"));
                houses.add(new House(2, "Modern House Erbil", "Empire City, Erbil"));
                break;
            case "sulaymaniyah":
                houses.add(new House(3, "Mountain View House", "Goizha District, Sulaymaniyah"));
                houses.add(new House(4, "City House Sulaymaniyah", "Chwar Bagh, Sulaymaniyah"));
                break;
            case "duhok":
                houses.add(new House(5, "Countryside House", "Akre Road, Duhok"));
                houses.add(new House(6, "Luxury Villa", "Dream City, Duhok"));
                break;
        }
        return houses.toArray(new Accommodation[0]);
    }
}