public class Pigeon extends Bird {
    private String species; // specific field for pigeon

    public Pigeon() {
        super();
        this.species = "Rock Dove";
    }

    public Pigeon(String species) {
        super();
        this.species = species;
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the pigeon is pecking breadcrumbs.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " says: Coo! Coo!");
    }

    public void deliverLetter() {
        System.out.println(getName() + " is delivering a message!");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() {
        return super.toString() + " -> Pigeon{species='" + species + "'}";
    }
}