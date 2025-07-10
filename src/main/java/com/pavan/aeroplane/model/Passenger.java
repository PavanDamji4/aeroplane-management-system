package com.pavan.aeroplane.model;

public class Passenger {
    private int id;
    private String name;
    private int age;
    private String gender;

    // Default constructor (required by DAO when using set methods)
    public Passenger() {}

    public Passenger(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
}

    // Param constructor (optional)
    public Passenger(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }



    @Override
    public String toString() {
    return "Passenger ID: " + id +
           ", Name: " + name +
           ", Age: " + age +
           ", Gender: " + gender;
}

}
