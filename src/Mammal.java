public class Mammal extends Animal {
    private String furColor;

    public Mammal() {
        super();
        this.furColor = "white";
    }

    public Mammal(String furColor) {
        super();
        this.furColor = furColor;
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the mammal is eating.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes a mammal sound.");
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public String toString() {
        return super.toString() + " -> Mammal{furColor='" + furColor + "'}";
    }
}