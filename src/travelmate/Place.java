package travelmate;

public abstract class Place extends Attraction {
    private String description;
    private double entryFee;
    private String openingHours;

    public Place(int id, String name, String address, String description, double entryFee, String openingHours) {
        super(id, name, address);
        this.description = description;
        this.entryFee = entryFee;
        this.openingHours = openingHours;
    }

    public String getDescription() {
        return description;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName() + "\nAddress: " + getAddress() + "\nDescription: " + description + "\nEntry Fee: $" + entryFee + "\nOpening Hours: " + openingHours);
    }
}