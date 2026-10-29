public class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Mixed";
    }

    public Dog(String breed) {
        super();
        this.breed = breed;
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the dog is crunching on kibble.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " says: Woof! Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching a stick!");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return super.toString() + " -> Dog{breed='" + breed + "'}";
    }
}