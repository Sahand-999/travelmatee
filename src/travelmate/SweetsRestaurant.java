package travelmate;

public class SweetsRestaurant extends Restaurant {
    public SweetsRestaurant(int id, String name, String address, double averagePrice) {
        super(id, name, address, "Sweets", averagePrice);
    }

    public static SweetsRestaurant[] getSweetsRestaurantsForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new SweetsRestaurant[] {
                new SweetsRestaurant(19, "Bakdash Ice Cream", "Citadel", 10.0),
                new SweetsRestaurant(20, "Sweet Tooth", "Mall Street", 12.0),
                new SweetsRestaurant(21, "Dessert Dreams", "100 Meter Street", 15.0)
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new SweetsRestaurant[] {
                new SweetsRestaurant(22, "Kurdish Sweets", "Bazian", 15.0),
                new SweetsRestaurant(23, "Dessert Heaven", "Main Road", 13.0),
                new SweetsRestaurant(24, "Ice Cream Paradise", "City Center", 12.0)
            };
        } else if (city.getName().equals("Duhok")) {
            return new SweetsRestaurant[] {
                new SweetsRestaurant(25, "Sweet Tooth", "Dream City", 12.0),
                new SweetsRestaurant(26, "Ice Cream Magic", "Main Square", 14.0),
                new SweetsRestaurant(27, "Candy Haven", "Old Bazaar", 15.0)
            };
        }
        return new SweetsRestaurant[0];
    }
}
