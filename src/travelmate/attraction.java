/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmate;

public abstract class attraction {
    private int id;
    private String name;
    private city city;
    private String address;

    public attraction(int id, String name, city city, String address) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public city getCity() {
        return city;
    }

    public abstract void displayDetails();
}
