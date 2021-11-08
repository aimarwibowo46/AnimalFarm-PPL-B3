public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Sheep("S1"),
                new Sheep("S2"),
                new Sheep("S3"),
                new Sheep("S4"),
                new Chicken("C1"),
                new Chicken("C2"),
                new Chicken("C3"),
                new Chicken("C4"),
                new Chicken("C5"),
                new Chicken("C6"),
        };
        
        System.out.println("Number of Sheep = " + Sheep.getCount());
        System.out.println("Number of Chicken = " + Chicken.getCount());
    }
}