public class Blowfish extends Fish {
    private Boolean isToxical;

    public Blowfish() {
        super();
        this.isToxical = true;
    }

    public Blowfish(Boolean isToxical) {
        super();
        this.isToxical = isToxical;
    }

    public Blowfish(String name, int age, double weight, String scaleType, Boolean isToxical) {
        super(name, age, weight, scaleType);
        this.isToxical = isToxical;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the blowfish is eating small crustaceans.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes quiet clicking sounds.");
    }

    public void inflate() {
        System.out.println(getName() + " puffed up like a spiked ball!");
    }

    public Boolean getIsToxical() { return isToxical; }
    public void setIsToxical(Boolean isToxical) { this.isToxical = isToxical; }

    @Override
    public String toString() {
        return super.toString() + " -> Blowfish{isToxical=" + isToxical + "}";
    }
}