package travelmate;

public class SacredPlace extends Place {
    public SacredPlace(int id, String name, String address, String description, double entryFee, String openingHours) {
        super(id, name, address, description, entryFee, openingHours);
    }

    public static SacredPlace[] getSacredPlacesForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new SacredPlace[] {
                new SacredPlace(1, "Jalil Khayat Mosque", "Downtown", "Largest mosque in Erbil.", 0.0, "5:00 AM - 10:00 PM"),
                new SacredPlace(2, "Choli Minaret", "Choli Area", "Historic mosque with unique architecture.", 0.0, "Open 24 Hours"),
                new SacredPlace(3, "Mar Elia Church", "Ainkawa", "One of the oldest churches in Erbil.", 0.0, "9:00 AM - 7:00 PM")
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new SacredPlace[] {
                new SacredPlace(4, "Sarchnar Mosque", "Sarchnar", "Beautiful mosque near the mountains.", 0.0, "5:00 AM - 10:00 PM"),
                new SacredPlace(5, "Chwar Chra Church", "City Center", "Historic Christian site.", 0.0, "9:00 AM - 6:00 PM"),
                new SacredPlace(6, "Kani Sazi Shrine", "Near Dukan", "A peaceful sacred site.", 0.0, "Open 24 Hours")
            };
        } else if (city.getName().equals("Duhok")) {
            return new SacredPlace[] {
                new SacredPlace(7, "Lalish Temple", "Lalish", "Yazidi's holiest site.", 0.0, "Open 24 Hours"),
                new SacredPlace(8, "Great Mosque of Duhok", "City Center", "Central mosque of Duhok.", 0.0, "5:00 AM - 10:00 PM"),
                new SacredPlace(9, "Mar Addai Church", "Near Dream City", "Old Christian church.", 0.0, "9:00 AM - 7:00 PM")
            };
        }
        return new SacredPlace[0];
    }
}