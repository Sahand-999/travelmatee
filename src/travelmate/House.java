package travelmate;

public class House extends Accommodation {
    private int bedrooms;

    public House(int id, String name, String address, int bedrooms) {
        super(id, name, address);
        this.bedrooms = bedrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    @Override
    public void displayDetails() {
        System.out.println("House Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Bedrooms: " + bedrooms);
    }

    public static Accommodation[] getHousesForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new Accommodation[]{
                new House(13, "Rose Villa", "Empire City", 3),
                new House(14, "Hawler Home", "Dream City", 4)
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new Accommodation[]{
                new House(15, "Mountain Retreat", "Dukan Road", 3),
                new House(16, "Sulaymaniyah Villa", "City Center", 5)
            };
        } else if (city.getName().equals("Duhok")) {
            return new Accommodation[]{
                new House(17, "Duhok Getaway", "Main Street", 4),
                new House(18, "Barzani House", "Dream City", 3)
            };
        }
        return new Accommodation[0];
    }
}
