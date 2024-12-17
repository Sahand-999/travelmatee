package travelmate;

public class Restaurant extends Attraction {
    private String cuisine;
    private double averagePrice;

    public Restaurant(int id, String name, String address, String cuisine, double averagePrice) {
        super(id, name, address);
        this.cuisine = cuisine;
        this.averagePrice = averagePrice;
    }

    public String getCuisine() {
        return cuisine;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public static Restaurant[] getRestaurantsForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new Restaurant[] {
                new Restaurant(1, "Royal Galaxy", "100 Meter Street", "Iraqi", 25.0),
                new Restaurant(2, "Levantine", "Downtown", "Mediterranean", 30.0),
                new Restaurant(3, "Bakdash Ice Cream", "Citadel", "Desserts", 10.0)
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new Restaurant[] {
                new Restaurant(4, "Dukan Fish", "Dukan Road", "Seafood", 35.0),
                new Restaurant(5, "Shandee", "City Center", "Kurdish", 20.0),
                new Restaurant(6, "Kebab House", "Salim Street", "Grill", 15.0)
            };
        } else if (city.getName().equals("Duhok")) {
            return new Restaurant[] {
                new Restaurant(7, "Tavern", "Main Square", "International", 28.0),
                new Restaurant(8, "Kurdish Delight", "Barzani Street", "Kurdish", 18.0),
                new Restaurant(9, "Sweet Tooth", "Dream City", "Desserts", 12.0)
            };  }
        return new Restaurant[0];
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName() + "\nAddress: " + getAddress() + "\nCuisine: " + cuisine + "\nAverage Price: $" + averagePrice);
    }
}
