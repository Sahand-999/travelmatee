/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmate;

public class restaurant {
    private int restaurantId;
    private String name;
    private city city;
    private String address;
    private double rating;
    private double priceRange;

    public restaurant(int restaurantId, String name, city city, String address, double rating, double priceRange) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.city = city;
        this.address = address;
        this.rating = rating;
        this.priceRange = priceRange;
    }

    public String getDetails() {
        return name + " - Address: " + address + ", Rating: " + rating + ", Avg price: $" + priceRange;
    }

    public static restaurant[] getRestaurantsForCity(city selectedCity) {
        restaurant[] restaurants = new restaurant[4];
        if (selectedCity.getName().equalsIgnoreCase("erbil")) {
            restaurants[0] = new restaurant(1, "Fazenda", selectedCity, "Gulan Street", 4.7, 25.00);
            restaurants[1] = new restaurant(2, "Kebab Street", selectedCity, "City Center", 4.6, 15.00);
            restaurants[2] = new restaurant(3, "Naranj", selectedCity, "Ankawa Road", 4.8, 35.00);
            restaurants[3] = new restaurant(4, "Amaya", selectedCity, "Dream City", 4.5, 20.00);
        } else if (selectedCity.getName().equalsIgnoreCase("sulaymaniyah")) {
            restaurants[0] = new restaurant(1, "Chai Khana", selectedCity, "Bakhtiary", 4.9, 25.00);
            restaurants[1] = new restaurant(2, "Aseel", selectedCity, "Salim Street", 4.7, 20.00);
            restaurants[2] = new restaurant(3, "Bazar Restaurant", selectedCity, "Baranan", 4.6, 18.00);
            restaurants[3] = new restaurant(4, "The Garden", selectedCity, "City Center", 4.8, 30.00);
        } else if (selectedCity.getName().equalsIgnoreCase("duhok")) {
            restaurants[0] = new restaurant(1, "Zakho Grill", selectedCity, "Zakho Street", 4.5, 20.00);
            restaurants[1] = new restaurant(2, "Duhok Lounge", selectedCity, "City Center", 4.6, 25.00);
            restaurants[2] = new restaurant(3, "Kurdish House", selectedCity, "Mountain Road", 4.4, 15.00);
            restaurants[3] = new restaurant(4, "Soran Restaurant", selectedCity, "Zawa Street", 4.7, 28.00);
        }
        return restaurants;
    }
}
