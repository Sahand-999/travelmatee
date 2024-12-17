package travelmate;

public class WesternRestaurant extends Restaurant {
    public WesternRestaurant(int id, String name, String address, double averagePrice) {
        super(id, name, address, "Western", averagePrice);
    }

    public static WesternRestaurant[] getWesternRestaurantsForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new WesternRestaurant[] {
                new WesternRestaurant(1, "Royal Galaxy", "100 Meter Street", 25.0),
                new WesternRestaurant(2, "Levantine", "Downtown", 30.0),
                new WesternRestaurant(3, "Italian Bistro", "Nergiz Street", 35.0)
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new WesternRestaurant[] {
                new WesternRestaurant(4, "Western Grill", "City Center", 28.0),
                new WesternRestaurant(5, "The Western Cafe", "Downtown", 20.0),
                new WesternRestaurant(6, "Burger Spot", "Main Road", 18.0)
            };
        } else if (city.getName().equals("Duhok")) {
            return new WesternRestaurant[] {
                new WesternRestaurant(7, "The Grill House", "Main Square", 28.0),
                new WesternRestaurant(8, "International Bites", "Park Street", 22.0),
                new WesternRestaurant(9, "Steakhouse Haven", "Main Avenue", 40.0)
            };
        }
        return new WesternRestaurant[0];
    }
}
