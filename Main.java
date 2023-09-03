public class Main {
    public static void main(String[] args) {
        //Dog dog1 = new Dog(args[0], 12, args[1], "husky"); //Don't need to use this, can make it the same as dog2
        Dog dog1 = new Dog("Snoopy", 12, "Black", "Husky");
        Dog dog2 = new Dog("Spot", 10, "Brown", "Collie");
        Dog dog3 = new Dog("Wolf", 14, "Tan", "Lab");
        System.out.println("Dog Name and Behavior: " + dog1.getName() + " likes to sleep.");
        System.out.println("Dog Color: " + dog1.getColor());
        System.out.println("Dog Age: " + dog1.getAge());
        System.out.println("Dog Breed: " + dog1.getBreed());

//Dog Object2
        System.out.println("Dog Name and Behavior: " + dog2.getName() + " enjoys long walks.");
        System.out.println("Dog Color: " + dog2.getColor());
        System.out.println("Dog Age: " + dog2.getAge());
        System.out.println("Dog Breed: " + dog2.getBreed());

        System.out.println("Dog Name and Behavior: " + dog3.getName() + " is a great companion.");
        System.out.println("Dog Color: " + dog3.getColor());
        System.out.println("Dog Age: " + dog3.getAge());
        System.out.println("Dog Breed: " + dog3.getBreed());
    }
}