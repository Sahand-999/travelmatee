package travelmate;

public class EasternRestaurant extends Restaurant {
    public EasternRestaurant(int id, String name, String address, double averagePrice) {
        super(id, name, address, "Eastern", averagePrice);
    }

    public static EasternRestaurant[] getEasternRestaurantsForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new EasternRestaurant[] {
                new EasternRestaurant(10, "Kurdish Delight", "Barzani Street", 18.0),
                new EasternRestaurant(11, "Al-Maza", "Cultural Center", 22.0),
                new EasternRestaurant(12, "Oriental Flavors", "Downtown", 20.0)
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new EasternRestaurant[] {
                new EasternRestaurant(13, "Dukan Fish", "Dukan Road", 35.0),
                new EasternRestaurant(14, "Shandee", "City Center", 20.0),
                new EasternRestaurant(15, "Bazian Grill", "Bazian", 25.0)
            };
        } else if (city.getName().equals("Duhok")) {
            return new EasternRestaurant[] {
                new EasternRestaurant(16, "Sweet Spice", "Dream City", 20.0),
                new EasternRestaurant(17, "Kebab House", "Old Town", 18.0),
                new EasternRestaurant(18, "Eastern Palace", "Park Avenue", 22.0)
            };
        }
        return new EasternRestaurant[0];
    }
}
