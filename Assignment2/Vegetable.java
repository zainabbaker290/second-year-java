package Assignment2;

public class Vegetable implements Food{
    //instance variables
    private String name;
    private int kCals;
    private double protein;
    private double fat;
    private double vitaminA;
    private double vitaminB;
    private double vitaminC;

    //constructor
    public Vegetable(String newName, int newKCals, double newProtein, double newFat, double newVitaminA,
                     double newVitaminB, double newVitaminC){
        this.name = newName;
        this.kCals = newKCals;
        this.protein = newProtein;
        this.fat = newFat;
        this.vitaminA = newVitaminA;
        this.vitaminB = newVitaminB;
        this.vitaminC = newVitaminC;
    }
    //getters and setters and display method
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getKCals() {
        return kCals;
    }

    @Override
    public double getProtein() {
        return protein;
    }

    @Override
    public double getFat() {
        return fat;
    }

    @Override
    public double getVitaminA() {
        return vitaminA;
    }

    @Override
    public double getVitaminB() {
        return vitaminB;
    }

    @Override
    public double getVitaminC() {
        return vitaminC;
    }

    /**
     * This method tells you is the food is healthy or not
     * the food is healthy if the vitamin contented combined is bigger than the sum of the fat and calories combined
     *
     * @return - if this is true then the food is healthy, if not, then it is not healthy
     */
    @Override
    public boolean healthy() {
        double sumVitamins = vitaminA + vitaminB + vitaminC;
        double sumFatKcals = fat + kCals;
        if(sumVitamins > sumFatKcals){
            return true;
        }
        return false;
    }

    @Override
    public void display() {
        System.out.println("name of vegetable " + getName());
        System.out.println("amount of calories " + getKCals());
        System.out.println("amount of protein " + getName());
        System.out.println("amount of fat " + getName());
        System.out.println("amount of vitamin A " + getName());
        System.out.println("amount of vitamin B " + getName());
        System.out.println("amount of vitamin C " + getName());
        System.out.println(healthy());
    }
}
