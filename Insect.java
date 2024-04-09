package zooassignmentoop;

public class Insect extends Animal {
    protected int numberOfLegs;

    public Insect(int age, double weight, double height, double movementSpeed, String species, Veterinarian vet, int numberOfLegs) {
        super(age, weight, height, movementSpeed, species, vet);
        this.setNumberOfLegs(numberOfLegs);
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void move() {
        WriteToFile.writeToFile(" " + this.getSpecies() + " on the loose! Catch me if you can! My speed is: " + this.getMovementSpeed() + "km/h" +
                "\n I have " + this.getNumberOfLegs() + " legs.\n");
    }
}
