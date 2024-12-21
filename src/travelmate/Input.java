package travelmate;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public int getCityChoice(City[] cities) {
        System.out.println("\nSelect a city from the following:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println((i + 1) + ". " + cities[i].getName());
        }
        System.out.println((cities.length + 1) + ". Exit");

        System.out.print("Enter the number of your choice: ");
        return scanner.nextInt();
    }

    public int getCityOption() {
        System.out.println("\nWhat would you like to explore?");
        System.out.println("1. Accommodation");
        System.out.println("2. Places");
        System.out.println("3. Restaurants");
        System.out.println("4. Activities");
        System.out.println("5. Go back to city selection");
        System.out.println("6. Exit");

        System.out.print("Enter your choice (1-6): ");
        return scanner.nextInt();
    }

    public int getAccommodationChoice() {
        System.out.println("\nSelect type of accommodation:");
        System.out.println("1. Hotels");
        System.out.println("2. Hostels");
        System.out.println("3. Houses");

        System.out.print("Enter your choice (1-3): ");
        return scanner.nextInt();
    }

    public int getPlaceChoice() {
        System.out.println("\nSelect type of places to explore:");
        System.out.println("1. Historical Places");
        System.out.println("2. Cultural Places");
        System.out.println("3. Sacred Places");

        System.out.print("Enter your choice (1-3): ");
        return scanner.nextInt();
    }

    public int getCuisineChoice() {
        System.out.println("\nSelect a cuisine type:");
        System.out.println("1. Western");
        System.out.println("2. Eastern");
        System.out.println("3. Sweets");

        System.out.print("Enter your choice (1-3): ");
        return scanner.nextInt();
    }

    public void handleAccommodation(int accommodationType, City selectedCity) {
        Accommodation[] accommodations = null;
        switch (accommodationType) {
            case 1:
                accommodations = Accommodation.getHotelsForCity(selectedCity);
                break;
            case 2:
                accommodations = Hostel.getHostelsForCity(selectedCity);
                break;
            case 3:
                accommodations = House.getHousesForCity(selectedCity);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
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
    }

    public void handlePlaces(int placeChoice, City selectedCity) {
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
                return;
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
    }

    public void handleCuisine(int cuisineChoice, City selectedCity) {
        switch (cuisineChoice) {
            case 1:
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

            case 2:
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

            case 3:
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
    }

    public void handleActivity(City selectedCity) {
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
    }
}
