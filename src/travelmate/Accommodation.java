package travelmate;

public abstract class Accommodation {
    private int id;
    private String name;
    private String address;

    public Accommodation(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public abstract void displayDetails();

    public static Accommodation[] getHotelsForCity(City city) {
        return new Accommodation[0]; 
    }

    public static Accommodation[] getHostelsForCity(City city) {
        return new Accommodation[0]; 
    }

    public static Accommodation[] getHousesForCity(City city) {
        return new Accommodation[0];
    }
} 