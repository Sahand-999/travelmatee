package travelmate;

import java.util.Scanner;

public class travelmateapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            city[] cities = city.getCities();

            System.out.println("\nselect a city from the following:");
            for (int i = 0; i < cities.length; i++) {
                System.out.println((i + 1) + ". " + cities[i].getName());
            }
            System.out.println((cities.length + 1) + ". exit");

            System.out.print("enter the number of your choice: ");
            int cityChoice = scanner.nextInt();

            if (cityChoice == cities.length + 1) {
                System.out.println("exiting the program. goodbye!");
                break;
            }

            if (cityChoice < 1 || cityChoice > cities.length) {
                System.out.println("invalid choice. please try again.");
                continue;
            }

            city selectedCity = cities[cityChoice - 1];
            selectedCity.displayCityInfo();

            while (true) {
                System.out.println("\nwhat would you like to know about " + selectedCity.getName() + "?");
                System.out.println("1. hotels");
                System.out.println("2. restaurants");
                System.out.println("3. places");
                System.out.println("4. activities");
                System.out.println("5. go back to city choices");
                System.out.println("6. exit");

                System.out.print("enter your choice (1-6): ");
                int choice = scanner.nextInt();

                if (choice == 5) {
                    break;
                }

                if (choice == 6) {
                    System.out.println("exiting the program.");
                    return;
                }

                attraction[] attractions;

                switch (choice) {
                    case 1:
                        attractions = hotel.getHotelsForCity(selectedCity);
                        break;
                    case 2:
                        attractions = restaurant.getRestaurantsForCity(selectedCity);
                        break;
                    case 3:
                        attractions = place.getPlacesForCity(selectedCity);
                        break;
                    case 4:
                        attractions = activity.getActivitiesForCity(selectedCity);
                        break;
                    default:
                        System.out.println("invalid choice. please try again.");
                        continue;
                }

                for (attraction attr : attractions) {
                    attr.displayDetails();
                }
            }
        }

        scanner.close();
    }
}
