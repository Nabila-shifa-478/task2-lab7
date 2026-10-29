public class Main {
    public static void main(String[] args) {
        // Creating an array of Animal references containing objects from our classes using different constructors
        Animal[] zoo = new Animal[6];

        zoo[0] = new Mammal("Rex", 4, 15.5, "Black");
        zoo[1] = new Dog("Buddy", 2, 8.0, "Golden", "Golden Retriever");
        zoo[2] = new Bird("Sky"); // using partial parameters constructor
        zoo[3] = new Pigeon("Percy", 1, 0.4, "Grey/Green", "City Pigeon");
        zoo[4] = new Fish(); // using default constructor
        zoo[5] = new Blowfish("Puffy", 3, 1.2, "Spiky", true);

        System.out.println("=== ANIMAL ACTIONS & METHODS ===");
        for (int i = 0; i < zoo.length; i++) {
            System.out.println("\n--- Index " + i + " ---");
            System.out.println(zoo[i].toString());
            zoo[i].eat();
            zoo[i].getVoice();

            // Calling class-specific methods using downcasting
            if (zoo[i] instanceof Dog) {
                ((Dog) zoo[i]).fetch();
            } else if (zoo[i] instanceof Pigeon) {
                ((Pigeon) zoo[i]).deliverLetter();
            } else if (zoo[i] instanceof Blowfish) {
                ((Blowfish) zoo[i]).inflate();
            }
        }
    }
}