public class Fish extends Animal {
    private String scaleType;

    public Fish() {
        super();
        this.scaleType = "Smooth";
    }

    public Fish(String scaleType) {
        super();
        this.scaleType = scaleType;
    }

    public Fish(String name, int age, double weight, String scaleType) {
        super(name, age, weight);
        this.scaleType = scaleType;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the fish is eating algae.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " is silent.");
    }

    public String getScaleType() { return scaleType; }
    public void setScaleType(String scaleType) { this.scaleType = scaleType; }

    @Override
    public String toString() {
        return super.toString() + " -> Fish{scaleType='" + scaleType + "'}";
    }}