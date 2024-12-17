package travelmate;

public class Hotel extends Accommodation {
    private int stars;

    public Hotel(int id, String name, String address, int stars) {
        super(id, name, address);
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public void displayDetails() {
        System.out.println("Hotel Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Stars: " + stars);
    }

    public static Accommodation[] getHotelsForCity(City city) {
        if (city.getName().equals("Erbil")) {
            return new Accommodation[]{
                new Hotel(1, "Erbil International Hotel", "100 Meter Street", 5),
                new Hotel(2, "Divan Erbil", "Downtown", 5)
            };
        } else if (city.getName().equals("Sulaymaniyah")) {
            return new Accommodation[]{
                new Hotel(3, "Grand Millennium", "City Center", 5),
                new Hotel(4, "Titanic Hotel", "Salim Street", 4)
            };
        } else if (city.getName().equals("Duhok")) {
            return new Accommodation[]{
                new Hotel(5, "Parliament Hotel", "Main Square", 4),
                new Hotel(6, "Khan Hotel", "Barzani Road", 3)
            };
        }
        return new Accommodation[0];
    }
}
