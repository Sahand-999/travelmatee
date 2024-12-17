package travelmate;

public class Activity extends Attraction {
    private String activityType;
    private double duration;

    public Activity(int id, String name, String address, String activityType, double duration) {
        super(id, name, address);
        this.activityType = activityType;
        this.duration = duration;
    }

    public String getActivityType() {
        return activityType;
    }

    public double getDuration() {
        return duration;
    }

    public static Activity[] getActivitiesForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new Activity[] {
                new Activity(1, "Citadel Tour", "Citadel", "Walking Tour", 2.0),
                new Activity(2, "Erbil Park", "Sami Abdulrahman Park", "Leisure", 3.0),
                new Activity(3, "Shopping", "Family Mall", "Shopping", 2.5)
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new Activity[] {
                new Activity(4, "Azmar Mountain Hike", "Azmar Mountain", "Hiking", 4.0),
                new Activity(5, "Cinema", "City Cinema", "Entertainment", 2.5),
                new Activity(6, "Museum Tour", "Amna Suraka", "Historical Tour", 3.0)
            };
        } else if (city.getName().equals("Duhok")) {
            return new Activity[] {
                new Activity(7, "Zawa Mountain Hike", "Zawa Mountain", "Hiking", 4.0),
                new Activity(8, "Dream City Amusement Park", "Dream City", "Leisure", 3.5),
                new Activity(9, "Dam Picnic", "Duhok Dam", "Picnic", 3.0)
            };  }
        return new Activity[0];
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName() + "\nAddress: " + getAddress() + "\nActivity Type: " + activityType + "\nDuration: " + duration + " hours");
    }
}