package travelmate;

public class HistoricalPlace extends Place {
    public HistoricalPlace(int id, String name, String address, String description, double entryFee, String openingHours) {
        super(id, name, address, description, entryFee, openingHours);
    }

    public static HistoricalPlace[] getHistoricalPlacesForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new HistoricalPlace[] {
                new HistoricalPlace(1, "Erbil Citadel", "Citadel Hill", "Oldest continuously inhabited settlement.", 0.0, "Open 24 Hours"),
                new HistoricalPlace(2, "Mudhafaria Minaret", "Minaret Park", "12th-century minaret.", 0.0, "Open 24 Hours"),
                new HistoricalPlace(3, "Qaysari Bazaar", "Near Citadel", "Historic market.", 0.0, "9:00 AM - 8:00 PM")
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new HistoricalPlace[] {
                new HistoricalPlace(4, "Amna Suraka", "Salim Street", "Kurdistan's Red Prison.", 5.0, "9:00 AM - 5:00 PM"),
                new HistoricalPlace(5, "Dukan Dam", "Dukan", "Historic water resource.", 0.0, "Open 24 Hours"),
                new HistoricalPlace(6, "Bazian Waterfall", "Bazian", "A beautiful natural waterfall in the area.", 3.0, "9:00 AM - 6:00 PM")
    };
        }
          return new HistoricalPlace [0];
    }
}