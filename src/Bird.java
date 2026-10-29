public class Bird extends Animal {
    private String featherColor;
    public Bird() {
        super();
        this.featherColor = "Grey";
    }

    public Bird(String featherColor) {
        super();
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the bird is eating seeds.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " chirps.");
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return super.toString() + " -> Bird{featherColor='" + featherColor + "'}";
    }
}