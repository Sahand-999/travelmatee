package travelmate;

public class Hostel extends Accommodation {
    private boolean sharedRooms;

    public Hostel(int id, String name, String address, int numberOfBeds, double pricePerNight, String mobileNumber, boolean sharedRooms) {
        super(id, name, address, numberOfBeds, pricePerNight, mobileNumber);
        this.sharedRooms = sharedRooms;
    }

    public boolean hasSharedRooms() {
        return sharedRooms;
    }

    public static Hostel[] getHostelsForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new Hostel[] {
                new Hostel(1, "Erbil Youth Hostel", "Near Citadel", 50, 25.0, "+964-111-111111", true),
                new Hostel(2, "Backpacker's Haven", "100 Meter Street", 30, 20.0, "+964-222-222222", true),
                new Hostel(3, "Budget Stay Hostel", "Downtown", 40, 15.0, "+964-333-333333", true)
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new Hostel[] {
                new Hostel(4, "Suli Travelers Hostel", "Salim Street", 60, 18.0, "+964-444-444444", true),
                new Hostel(5, "Mount View Hostel", "Near Azmar Mountain", 20, 30.0, "+964-555-555555", false),
                new Hostel(6, "Sarchnar Budget Hostel", "Sarchnar", 25, 22.0, "+964-666-666666", true)
            };
        } else if (city.getName().equals("Duhok")) {
            return new Hostel[] {
                new Hostel(7, "Duhok Adventure Hostel", "Near Zawa Mountain", 35, 20.0, "+964-777-777777", true),
                new Hostel(8, "Dream City Hostel", "Dream City", 50, 28.0, "+964-888-888888", true),
                new Hostel(9, "Quiet Stay Hostel", "City Center", 40, 25.0, "+964-999-999999", false)
            };
        }
        return new Hostel[0];
    }
}
