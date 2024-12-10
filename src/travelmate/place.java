/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmate;

public class place extends attraction {
    public place(int id, String name, city city, String address) {
        super(id, name, city, address);
    }

    @Override
    public void displayDetails() {
        System.out.println("place: " + getName() + ", located at: " + getCity().getName());
    }

    public static place[] getPlacesForCity(city selectedCity) {
        place[] places = new place[4];
        if (selectedCity.getName().equalsIgnoreCase("erbil")) {
            places[0] = new place(1, "citadel of erbil", selectedCity, "city center");
            places[1] = new place(2, "sami abdulrahman park", selectedCity, "60m road");
            places[2] = new place(3, "shanidar cave", selectedCity, "mountains near erbil");
            places[3] = new place(4, "jalil khayat mosque", selectedCity, "city center");
        } else if (selectedCity.getName().equalsIgnoreCase("sulaymaniyah")) {
            places[0] = new place(1, "chavi land", selectedCity, "goizha mountains");
            places[1] = new place(2, "amna suraka", selectedCity, "city center");
            places[2] = new place(3, "dokan lake", selectedCity, "dokan");
            places[3] = new place(4, "ahmad awa waterfall", selectedCity, "ahmad awa");
        } else if (selectedCity.getName().equalsIgnoreCase("duhok")) {
            places[0] = new place(1, "zawa mountain", selectedCity, "zawa");
            places[1] = new place(2, "duhok dam", selectedCity, "near city");
            places[2] = new place(3, "bekhal waterfall", selectedCity, "bekhal");
            places[3] = new place(4, "delal bridge", selectedCity, "zakho");
        }
        return places;
    }
}
