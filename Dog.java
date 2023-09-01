public class Dog {
    private String name;
    private int age;
    private String color;
    private String breed;

    public Dog(String name, int age, String color, String breed) {
        this.age = age;
        this.color = color;
        this.name = name;
        this.breed = breed;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    }