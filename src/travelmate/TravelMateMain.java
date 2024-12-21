package travelmate;

public class TravelMateMain {
    public static void main(String[] args) {
        Input input = new Input();

        City[] cities = {
            new City(1, "Erbil"),
            new City(2, "Sulaymaniyah"),
            new City(3, "Duhok")
        };

        while (true) {
            int cityChoice = input.getCityChoice(cities);

            if (cityChoice == cities.length + 1) {
                System.out.println("Exiting the program. Goodbye");
                break;
            }

            City selectedCity = cities[cityChoice - 1];
            selectedCity.displayCityInfo();

            while (true) {
                int choice = input.getCityOption();

                if (choice == 5) {
                    break;
                }

                if (choice == 6) {
                    System.out.println("Exiting the program. Goodbye");
                    return;
                }

                switch (choice) {
                    case 1:
                        int accommodationType = input.getAccommodationChoice();
                        input.handleAccommodation(accommodationType, selectedCity);
                        break;

                    case 2:
                        int placeChoice = input.getPlaceChoice();
                        input.handlePlaces(placeChoice, selectedCity);
                        break;

                    case 3:
                        int cuisineChoice = input.getCuisineChoice();
                        input.handleCuisine(cuisineChoice, selectedCity);
                        break;

                    case 4:
                        input.handleActivity(selectedCity);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    }
}
