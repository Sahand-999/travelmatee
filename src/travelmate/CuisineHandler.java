package travelmate;

public class CuisineHandler {

    public static void handleCuisine(int cuisineChoice, City selectedCity) {
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
}
