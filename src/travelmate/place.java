/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmate;

public class place {
    private int placeId;
    private String name;
    private city city;
    private String description;

    public place(int placeId, String name, city city, String description) {
        this.placeId = placeId;
        this.name = name;
        this.city = city;
        this.description = description;
    }

    public String getDetails() {
        return name + ": " + description;
    }

    public static place[] getPlacesForCity(city selectedCity) {
        place[] places = new place[4];
        if (selectedCity.getName().equalsIgnoreCase("erbil")) {
            places[0] = new place(1, "Erbil Citadel", selectedCity, "A historical fortress in the city center.");
            places[1] = new place(2, "Qaysari Bazaar", selectedCity, "An ancient market area in Erbil.");
            places[2] = new place(3, "Musharrif Mosque", selectedCity, "A beautiful mosque known for its architecture.");
            places[3] = new place(4, "Mansour Mall", selectedCity, "A large shopping mall in the city.");
        } else if (selectedCity.getName().equalsIgnoreCase("sulaymaniyah")) {
            places[0] = new place(1, "Shanidar Cave", selectedCity, "An ancient archaeological site just outside the city.");
            places[1] = new place(2, "Sulaymaniyah City Center", selectedCity, "The bustling heart of the city.");
            places[2] = new place(3, "Taqtaq Museum", selectedCity, "A historical museum showcasing local culture.");
            places[3] = new place(4, "Mardin Park", selectedCity, "A popular park with scenic views of the city.");
        } else if (selectedCity.getName().equalsIgnoreCase("duhok")) {
            places[0] = new place(1, "Duhok Dam", selectedCity, "A large dam offering scenic views and a popular tourist spot.");
            places[1] = new place(2, "Chwarta Canyon", selectedCity, "A beautiful natural canyon near Duhok.");
            places[2] = new place(3, "Duhok Market", selectedCity, "A bustling market selling local goods and crafts.");
            places[3] = new place(4, "Zakho Bridge", selectedCity, "An ancient bridge crossing the Khabur River.");
        }
        return places;
    }
}
