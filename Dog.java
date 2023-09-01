public class Dog {
    private String name;
    private int age;
    private String color;
    private String breed;

    public Dog(String name, int age, String color, String breed){
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
        {

            public static void main(String[] args) {
                Dog dog1 = new Dog(args[0], 12, args[1], "husky"); //Don't need to use this, can make it the same as dog2
                dog1.setName("Snoopy");
                dog1.setAge(Integer.parseInt("12"));
                dog1.setColor("Black");
                dog1.setBreed("Husky");
                Dog dog2 = new Dog("Spot", 10, "brown", "collie");
                Dog dog3 = new Dog("Wolf", 14, "tan", "lab");
                System.out.println("Dog Name: " + dog1.getName() + "Likes to sleep.");
                System.out.println("Dog Color: " + dog1.getColor());
                System.out.println("Dog Age: " + dog1.getAge());
                System.out.println("Dog Breed: " + dog1.getBreed());

//Dog Object2
                System.out.println("Dog Name: " + dog2.getName() + "Enjoys long walks.");
                System.out.println("Dog Color: " + dog2.getColor());
                System.out.println("Dog Age: " + dog2.getAge());
                System.out.println("Dog Breed: " + dog2.getBreed());

                System.out.println("Dog Name: " + dog3.getName() + "Is a great companion.");
                System.out.println("Dog Color: " + dog3.getColor());
                System.out.println("Dog Age: " + dog3.getAge());
                System.out.println("Dog Breed: " + dog3.getBreed());}
            }
        }
    }