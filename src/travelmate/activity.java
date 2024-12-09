/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmate;

public class activity {
    private int activityId;
    private String name;
    private city city;
    private String description;

    public activity(int activityId, String name, city city, String description) {
        this.activityId = activityId;
        this.name = name;
        this.city = city;
        this.description = description;
    }

    public String getDetails() {
        return name + ": " + description;
    }

    public static activity[] getActivitiesForCity(city selectedCity) {
        activity[] activities = new activity[4];
        if (selectedCity.getName().equalsIgnoreCase("erbil")) {
            activities[0] = new activity(1, "Visit the Citadel", selectedCity, "A historic site in the heart of Erbil.");
            activities[1] = new activity(2, "Shopping in Gulan Street", selectedCity, "A popular street for shopping and dining.");
            activities[2] = new activity(3, "Kurdistan Museum", selectedCity, "Learn about the history of the Kurdistan region.");
            activities[3] = new activity(4, "Erbil Park", selectedCity, "A large public park perfect for family outings.");
        } else if (selectedCity.getName().equalsIgnoreCase("sulaymaniyah")) {
            activities[0] = new activity(1, "Visit Sarchnar Park", selectedCity, "A beautiful park with lakes and green areas.");
            activities[1] = new activity(2, "Bazaar Shopping", selectedCity, "Explore the markets and local crafts of Sulaymaniyah.");
            activities[2] = new activity(3, "Visit ahmad awa ", selectedCity, "A stunning place located outside Sulaymaniyah.");
            activities[3] = new activity(4, "visit chavi land ", selectedCity, "Chavi Land is a prominent amusement park situated on the Goizha Mountains in Sulaymaniyah.");
        } else if (selectedCity.getName().equalsIgnoreCase("duhok")) {
            activities[0] = new activity(1, "Mountain Hiking", selectedCity, "Trek in the beautiful mountains surrounding Duhok.");
            activities[1] = new activity(2, "Visit the Ancient Ruins", selectedCity, "Explore historical ruins in the region.");
            activities[2] = new activity(3, "Lake Duhok", selectedCity, "Relax by the scenic lake in Duhok.");
            activities[3] = new activity(4, "Visit the Duhok Archaeological Museum", selectedCity, "Explore artifacts from ancient civilizations.");
        }
        return activities;
    }
}
