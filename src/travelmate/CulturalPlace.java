package travelmate;

public class CulturalPlace extends Place {
    public CulturalPlace(int id, String name, String address, String description, double entryFee, String openingHours) {
        super(id, name, address, description, entryFee, openingHours);
    }

    public static CulturalPlace[] getCulturalPlacesForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new CulturalPlace[] {
                new CulturalPlace(1, "Kurdish Textile Museum", "Citadel Area", "Museum showcasing traditional Kurdish weaving.", 2.0, "9:00 AM - 6:00 PM"),
                new CulturalPlace(2, "Erbil Art Center", "Downtown", "Exhibits of Kurdish art.", 0.0, "10:00 AM - 5:00 PM"),
                new CulturalPlace(3, "Malla Afandi Park", "City Center", "Cultural events and gatherings.", 0.0, "Open 24 Hours")
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new CulturalPlace[] {
                new CulturalPlace(4, "Sulaymaniyah Museum", "Salim Street", "Second-largest museum in Iraq.", 3.0, "9:00 AM - 5:00 PM"),
                new CulturalPlace(5, "Tawela Village", "Near Tawela", "Known for traditional Kurdish lifestyle.", 0.0, "Open 24 Hours"),
                new CulturalPlace(6, "Goizha Gallery", "Downtown", "Modern Kurdish art gallery.", 2.0, "10:00 AM - 7:00 PM")
            };
        } else if (city.getName().equals("Duhok")) {
            return new CulturalPlace[] {
                new CulturalPlace(7, "Duhok Cultural Center", "City Center", "Events and cultural festivals.", 0.0, "9:00 AM - 9:00 PM"),
                new CulturalPlace(8, "Dream City Cultural Park", "Dream City", "Cultural performances and exhibitions.", 0.0, "10:00 AM - 10:00 PM"),
                new CulturalPlace(9, "Zakho Cultural House", "Zakho", "Local Kurdish culture exhibits.", 1.0, "9:00 AM - 6:00 PM")
            };
        }
        return new CulturalPlace[0];
    }
}