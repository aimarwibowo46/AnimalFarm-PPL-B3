public abstract class FarmAnimal extends Animal {

    protected String name;

    public FarmAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}