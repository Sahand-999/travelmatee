/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmate;


public class hotel {
    private int hotelId;
    private String name;
    private city city;
    private String address;
    private double rating;
    private double pricePerNight;

    public hotel(int hotelId, String name, city city, String address, double rating, double pricePerNight) {
        this.hotelId = hotelId;
        this.name = name;
        this.city = city;
        this.address = address;
        this.rating = rating;
        this.pricePerNight = pricePerNight;
    }

    public String getDetails() {
        return name + " - Address: " + address + ", Rating: " + rating + ", Price per Night: $" + pricePerNight;
    }

    

    public static hotel[] getHotelsForCity(city selectedCity) {
        hotel[] hotels = new hotel[4];
        if (selectedCity.getName().equals("erbil")) {
            hotels[0] = new hotel(1, "erbil rotana", selectedCity, "gulan street", 4.5, 150.00);
            hotels[1] = new hotel(2, "divan erbil", selectedCity, "60m street", 4.7, 200.00);
            hotels[2] = new hotel(3, "capitol hotel", selectedCity, "ankawa road", 4.3, 120.00);
            hotels[3] = new hotel(4, "hyatt regency erbil", selectedCity, "dream city", 4.8, 250.00);
        } else if (selectedCity.getName().equals("sulaymaniyah")) {
            hotels[0] = new hotel(1, "grand millennium sulaymaniyah", selectedCity, "bakhtiary", 4.8, 180.00);
            hotels[1] = new hotel(2, "ramada sulaymaniyah", selectedCity, "salim street", 4.5, 130.00);
            hotels[2] = new hotel(3, "copthorne hotel", selectedCity, "baranan", 4.2, 100.00);
            hotels[3] = new hotel(4, "sulaymaniyah palace", selectedCity, "city center", 4.6, 140.00);
        } else if (selectedCity.getName().equals("duhok")) {
            hotels[0] = new hotel(1, "duhok palace", selectedCity, "city center", 4.2, 100.00);
            hotels[1] = new hotel(2, "hilton duhok", selectedCity, "near university", 4.6, 150.00);
            hotels[2] = new hotel(3, "kurdistan hotel", selectedCity, "mountain view road", 4.4, 110.00);
            hotels[3] = new hotel(4, "zawa hotel", selectedCity, "zawa street", 4.3, 90.00);
        }
        return hotels;
    }
}
