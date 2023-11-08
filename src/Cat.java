public class Cat {
    private String name; // Must NOT be null and must NOT be empty
    private char gender; // Must be either 'M' or 'F'
    private double weightInKg; // Must be greater than zero AND lower than or equal to 10

    public Cat(String name, char gender, double weightInKg) {
        this.name = name;
        this.gender = gender;
        this.weightInKg = weightInKg;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public double getWeightInKg() {
        return weightInKg;
    }
}