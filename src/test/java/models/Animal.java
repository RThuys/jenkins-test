package models;

public class Animal {
    public Integer id;
    public String name;
    public String description;
    public String image;


    public Animal(Integer id, String name, String description, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public Animal( String name, String image) {
        this.name = name;
        this.image = image;
    }
}
