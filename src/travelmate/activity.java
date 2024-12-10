/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmate;

public class activity extends attraction {
    private String activityType;
    private int duration;  // Duration in hours

    public activity(int id, String name, city city, String address, String activityType, int duration) {
        super(id, name, city, address);
        this.activityType = activityType;
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Activity: " + getName() + " | Duration: " + duration + " hours");
    }

    public static activity[] getActivitiesForCity(city selectedCity) {
        activity[] activities = new activity[4];
        if (selectedCity.getName().equals("erbil")) {
            activities[0] = new activity(1, "Shopping at Family Mall", selectedCity, "Family Mall", "Shopping", 2);
            activities[1] = new activity(2, "Hiking in Safin Mountain", selectedCity, "Safin Mountain", "Hiking", 3);
            activities[2] = new activity(3, "Cable Car Ride", selectedCity, "Shanidar Park", "Adventure", 1);
            activities[3] = new activity(4, "Visiting Local Bazaars", selectedCity, "Erbil City Center", "Cultural", 2);
        } else if (selectedCity.getName().equals("sulaymaniyah")) {
            activities[0] = new activity(1, "Hiking in Goizha Mountains", selectedCity, "Goizha Mountains", "Hiking", 4);
            activities[1] = new activity(2, "Cultural Tours", selectedCity, "City Center", "Cultural", 3);
            activities[2] = new activity(3, "Boat Rides in Dokan Lake", selectedCity, "Dokan Lake", "Adventure", 2);
            activities[3] = new activity(4, "Picnic in Chavi Land", selectedCity, "Azadi Park", "Leisure", 2);
        } else if (selectedCity.getName().equals("duhok")) {
            activities[0] = new activity(1, "Hiking in Zawa Mountain", selectedCity, "Zawa", "Hiking", 3);
            activities[1] = new activity(2, "Boating in Duhok Dam", selectedCity, "Duhok Dam", "Adventure", 2);
            activities[2] = new activity(3, "Exploring Delal Bridge", selectedCity, "Zakho", "Sightseeing", 1);
            activities[3] = new activity(4, "Relaxing at Bekhal Waterfall", selectedCity, "Bekhal", "Leisure", 2);
        }
        return activities;
    }
}
