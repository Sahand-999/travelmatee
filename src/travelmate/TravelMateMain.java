package travelmate;

import java.util.Scanner;

public class TravelMateMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define cities
        City[] cities = {
            new City(1, "Erbil"),
            new City(2, "Sulaymaniyah"),
            new City(3, "Duhok")
        };

        while (true) {
            // Display city choices
            System.out.println("\nSelect a city from the following:");
            for (int i = 0; i < cities.length; i++) {
                System.out.println((i + 1) + ". " + cities[i].getName());
            }
            System.out.println((cities.length + 1) + ". Exit");

            System.out.print("Enter the number of your choice: ");
            int cityChoice = scanner.nextInt();

            if (cityChoice == cities.length + 1) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            if (cityChoice < 1 || cityChoice > cities.length) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            City selectedCity = cities[cityChoice - 1];
            selectedCity.displayCityInfo();

            while (true) {
                // Display options for the selected city
                System.out.println("\nWhat would you like to explore in " + selectedCity.getName() + "?");
                System.out.println("1. Accommodation");
                System.out.println("2. Places");
                System.out.println("3. Restaurants");
                System.out.println("4. Activities");
                System.out.println("5. Go back to city selection");
                System.out.println("6. Exit");

                System.out.print("Enter your choice (1-6): ");
                int choice = scanner.nextInt();

                if (choice == 5) {
                    break;
                }

                if (choice == 6) {
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                }

                switch (choice) {
                    case 1: // Accommodation
                        System.out.println("\nSelect type of accommodation:");
                        System.out.println("1. Hotels");
                        System.out.println("2. Hostels");
                        System.out.println("3. Houses");

                        System.out.print("Enter your choice (1-3): ");
                        int accommodationType = scanner.nextInt();

                        Accommodation[] accommodations = null;
                        switch (accommodationType) {
                            case 1: // Hotels
                                accommodations = Accommodation.getHotelsForCity(selectedCity);
                                break;
                            case 2: // Hostels
                                accommodations = Hostel.getHostelsForCity(selectedCity);
                                break;
                            case 3: // Houses
                                accommodations = House.getHousesForCity(selectedCity);
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                continue;
                        }

                        if (accommodations != null && accommodations.length > 0) {
                            System.out.println("\nAccommodations in " + selectedCity.getName() + ":");
                            for (Accommodation accommodation : accommodations) {
                                accommodation.displayDetails();
                                System.out.println();
                            }
                        } else {
                            System.out.println("No accommodations found for this type in " + selectedCity.getName() + ".");
                        }
                        break;

                    case 2: // Places
                        System.out.println("\nSelect type of places to explore:");
                        System.out.println("1. Historical Places");
                        System.out.println("2. Cultural Places");
                        System.out.println("3. Sacred Places");

                        System.out.print("Enter your choice (1-3): ");
                        int placeChoice = scanner.nextInt();

                        Attraction[] places = null;
                        switch (placeChoice) {
                            case 1:
                                places = HistoricalPlace.getHistoricalPlacesForCity(selectedCity);
                                break;
                            case 2:
                                places = CulturalPlace.getCulturalPlacesForCity(selectedCity);
                                break;
                            case 3:
                                places = SacredPlace.getSacredPlacesForCity(selectedCity);
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                continue;
                        }

                        if (places != null && places.length > 0) {
                            System.out.println("\nPlaces in " + selectedCity.getName() + ":");
                            for (Attraction place : places) {
                                place.displayDetails();
                                System.out.println();
                            }
                        } else {
                            System.out.println("No places found for this category in " + selectedCity.getName() + ".");
                        }
                        break;

                    case 3: // Restaurants
                        System.out.println("\nSelect a cuisine type:");
                        System.out.println("1. Western");
                        System.out.println("2. Eastern");
                        System.out.println("3. Sweets");

                        System.out.print("Enter your choice (1-3): ");
                        int cuisineChoice = scanner.nextInt();

                        switch (cuisineChoice) {
                            case 1: // Western
                                WesternRestaurant[] westernRestaurants = WesternRestaurant.getWesternRestaurantsForCity(selectedCity);
                                if (westernRestaurants.length > 0) {
                                    System.out.println("\nWestern Restaurants in " + selectedCity.getName() + ":");
                                    for (WesternRestaurant restaurant : westernRestaurants) {
                                        restaurant.displayDetails();
                                        System.out.println();
                                    }
                                } else {
                                    System.out.println("No Western restaurants found in " + selectedCity.getName() + ".");
                                }
                                break;

                            case 2: // Eastern
                                EasternRestaurant[] easternRestaurants = EasternRestaurant.getEasternRestaurantsForCity(selectedCity);
                                if (easternRestaurants.length > 0) {
                                    System.out.println("\nEastern Restaurants in " + selectedCity.getName() + ":");
                                    for (EasternRestaurant restaurant : easternRestaurants) {
                                        restaurant.displayDetails();
                                        System.out.println();
                                    }
                                } else {
                                    System.out.println("No Eastern restaurants found in " + selectedCity.getName() + ".");
                                }
                                break;

                            case 3: // Sweets
                                SweetsRestaurant[] sweetsRestaurants = SweetsRestaurant.getSweetsRestaurantsForCity(selectedCity);
                                if (sweetsRestaurants.length > 0) {
                                    System.out.println("\nSweets Restaurants in " + selectedCity.getName() + ":");
                                    for (SweetsRestaurant restaurant : sweetsRestaurants) {
                                        restaurant.displayDetails();
                                        System.out.println();
                                    }
                                } else {
                                    System.out.println("No Sweets restaurants found in " + selectedCity.getName() + ".");
                                }
                                break;

                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }
                        break;

                    case 4: // Activities
                        Activity[] activities = Activity.getActivitiesForCity(selectedCity);
                        if (activities.length > 0) {
                            System.out.println("\nActivities in " + selectedCity.getName() + ":");
                            for (Activity activity : activities) {
                                activity.displayDetails();
                                System.out.println();
                            }
                        } else {
                            System.out.println("No activities found for this city.");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }

        scanner.close();
    }
}
