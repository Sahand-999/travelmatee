package travelmate;

public class House extends Accommodation {
    private boolean petFriendly;

    public House(int id, String name, String address, int numberOfBeds, double pricePerNight, String mobileNumber, boolean petFriendly) {
        super(id, name, address, numberOfBeds, pricePerNight, mobileNumber);
        this.petFriendly = petFriendly;
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    public static House[] getHousesForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new House[] {
                new House(1, "Cozy Family House", "Citadel Area", 4, 75.0, "+964-111-111112", true),
                new House(2, "Modern Villa", "100 Meter Street", 6, 120.0, "+964-111-111113", false),
                new House(3, "Rustic Cottage", "Downtown", 3, 50.0, "+964-111-111114", true)
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new House[] {
                new House(4, "Mountain View House", "Azmar Area", 5, 85.0, "+964-222-222223", true),
                new House(5, "City Escape Villa", "Sarchnar", 6, 100.0, "+964-222-222224", false),
                new House(6, "Lakeside Cottage", "Dukan", 4, 70.0, "+964-222-222225", true)
            };
        } else if (city.getName().equals("Duhok")) {
            return new House[] {
                new House(7, "Countryside Home", "Zawa Village", 3, 60.0, "+964-333-333334", true),
                new House(8, "Modern Bungalow", "Dream City", 4, 80.0, "+964-333-333335", false),
                new House(9, "Hilltop Villa", "City Outskirts", 5, 95.0, "+964-333-333336", true)
            };
        }
        return new House[0];
    }
}
