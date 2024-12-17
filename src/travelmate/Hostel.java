package travelmate;

public class Hostel extends Accommodation {
    private boolean hasSharedRooms;

    public Hostel(int id, String name, String address, boolean hasSharedRooms) {
        super(id, name, address);
        this.hasSharedRooms = hasSharedRooms;
    }

    public boolean hasSharedRooms() {
        return hasSharedRooms;
    }

    @Override
    public void displayDetails() {
        System.out.println("Hostel Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Shared Rooms: " + (hasSharedRooms ? "Yes" : "No"));
    }

    public static Accommodation[] getHostelsForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new Accommodation[]{
                new Hostel(7, "Erbil Backpackers", "Citadel Area", true),
                new Hostel(8, "Youth Hostel Erbil", "City Center", true)
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new Accommodation[]{
                new Hostel(9, "Sulaymaniyah Lodge", "Main Street", true),
                new Hostel(10, "Budget Stay Hostel", "Salim Street", false)
            };
        } else if (city.getName().equals("Duhok")) {
            return new Accommodation[]{
                new Hostel(11, "Duhok Youth Hostel", "Dream City", true),
                new Hostel(12, "Nomad's Nest", "University Area", true)
            };
        }
        return new Accommodation[0];
    }
}
