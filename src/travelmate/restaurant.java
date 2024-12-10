/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmate;

public class restaurant extends attraction {
    private double rating;
    private double priceRange;

    public restaurant(int id, String name, city city, String address, double rating, double priceRange) {
        super(id, name, city, address);
        this.rating = rating;
        this.priceRange = priceRange;
    }

    @Override
    public void displayDetails() {
        System.out.println("restaurant: " + getName() + ", address: " + getCity().getName() + ", rating: " + rating + ", Avg price: $" + priceRange);
    }

    public static restaurant[] getRestaurantsForCity(city selectedCity) {
        restaurant[] restaurants = new restaurant[4];
        if (selectedCity.getName().equalsIgnoreCase("erbil")) {
            restaurants[0] = new restaurant(1, "fazenda", selectedCity, "gulan street", 4.7, 25.00);
            restaurants[1] = new restaurant(2, "kebab street", selectedCity, "city center", 4.6, 15.00);
            restaurants[2] = new restaurant(3, "naranj", selectedCity, "ankawa road", 4.8, 35.00);
            restaurants[3] = new restaurant(4, "amaya", selectedCity, "dream city", 4.5, 20.00);
        } else if (selectedCity.getName().equalsIgnoreCase("sulaymaniyah")) {
            restaurants[0] = new restaurant(1, "chai khana", selectedCity, "bakhtiary", 4.9, 25.00);
            restaurants[1] = new restaurant(2, "aseel", selectedCity, "salim street", 4.7, 20.00);
            restaurants[2] = new restaurant(3, "bazar restaurant", selectedCity, "baranan", 4.6, 18.00);
            restaurants[3] = new restaurant(4, "the garden", selectedCity, "city center", 4.8, 30.00);
        } else if (selectedCity.getName().equalsIgnoreCase("duhok")) {
            restaurants[0] = new restaurant(1, "zakho grill", selectedCity, "zakho street", 4.5, 20.00);
            restaurants[1] = new restaurant(2, "duhok lounge", selectedCity, "city center", 4.6, 25.00);
            restaurants[2] = new restaurant(3, "kurdish house", selectedCity, "mountain road", 4.4, 15.00);
            restaurants[3] = new restaurant(4, "soran restaurant", selectedCity, "zawa street", 4.7, 28.00);
        }
        return restaurants;
    }
}
