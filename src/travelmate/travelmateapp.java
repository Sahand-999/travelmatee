/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package travelmate;

/**
 *
 * @author Soma
 */
import java.util.Scanner;

public class travelmateapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        city[] cities = city.getCities();

        System.out.println("select a city from the following:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println((i + 1) + ". " + cities[i].getName());
        }

        System.out.print("enter the number of your choice: ");
        int cityChoice = scanner.nextInt();
        city selectedCity = cities[cityChoice - 1];

        selectedCity.displayCityInfo();

        System.out.println("\nwhat would you like to know about " + selectedCity.getName() + "?");
        System.out.println("1. hotels");
        System.out.println("2. restaurants");
        System.out.println("3. places");
        System.out.println("4. activities");

        System.out.print("enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                hotel[] hotels = hotel.getHotelsForCity(selectedCity);
                System.out.println("\nhotels in " + selectedCity.getName() + ":");
                for (hotel h : hotels) {
                    h.getDetails();
                }
                break;

            case 2:
                restaurant[] restaurants = restaurant.getRestaurantsForCity(selectedCity);
                System.out.println("\nrestaurants in " + selectedCity.getName() + ":");
                for (restaurant r : restaurants) {
                    System.out.println(r.getDetails());
                }
                break;

            case 3:
                place[] places = place.getPlacesForCity(selectedCity);
                System.out.println("\nplaces in " + selectedCity.getName() + ":");
                for (place p : places) {
                    System.out.println(p.getDetails());
                }
                break;

            case 4:
                activity[] activities = activity.getActivitiesForCity(selectedCity);
                System.out.println("\nactivities in " + selectedCity.getName() + ":");
                for (activity a : activities) {
                    System.out.println(a.getDetails());
                }
                break;

            default:
                System.out.println("invalid choice.");
        }

        
    }
}
