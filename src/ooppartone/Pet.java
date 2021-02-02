package ooppartone;

public class Pet {

    //Instance Variables

    private String name;
    private String location;
    private String type;
    private Integer age;

    //Empty Constructor

    public Pet() {
        name = "The Unnamed Dog";
        location = "Just around the horizon";
        type = "Good dog";
        age = 0;
    }

    //Constructor with arguments

    public Pet(String petName, String petLocation, String petType, Integer petAge) {
        this.name = petName;
        this.location = petLocation;
        this.type = petType;
        this.age = petAge;
    }

    //Getters
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getType() {
        return type;
    }

    //Setters
    public void setName(String newName) {
        this.name = newName;
    }
    public void setName(Integer newAge) {
        this.age = newAge;
    }
    public void setLocation(String newLocation) {
        this.location = newLocation;
    }

}
