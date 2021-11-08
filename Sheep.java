public class Sheep extends FarmAnimal {

    private static int count = 0;
    
    public Sheep(String name) {
        super(name);
        count++;
    }
    
    public static int getCount() {
        return count;
    }

    @Override
    public void makeSound() {
        System.out.println("Mbek");
    }
}