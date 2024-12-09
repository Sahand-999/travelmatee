/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmate;

public class city {
    private int cityId;
    private String name;
    private String description;
    private String province;

    public city(int cityId, String name, String description) {
        this.cityId = cityId;
        this.name = name;
        this.description = description;
   
    }

    public int getCityId() {
        return cityId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

  
    

    public void displayCityInfo() {
        System.out.println("City: " + name);
        System.out.println("Description: " + description);
      
    }

    public static city[] getCities() {
        city[] cities = new city[3];
        cities[0] = new city(1, "erbil", "capital of kurdistan, known for its citadel");
        cities[1] = new city(2, "sulaymaniyah", "cultural hub with beautiful mountains");
        cities[2] = new city(3, "duhok", "known for its scenic landscapes and ancient sites");
        return cities;
    }
}
