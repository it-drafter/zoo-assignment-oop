package zooassignmentoop;

public class Bird extends Animal {
    protected double wingSpan;

    public Bird(int age, double weight, double height, double movementSpeed, String species, Veterinarian vet, double wingSpan) {
        super(age, weight, height, movementSpeed, species, vet);
        this.setWingSpan(wingSpan);
    }

    public double getWingSpan() {
        return this.wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public void move() {
        FilePrinter.writeToFile(" " + this.getSpecies() + " on the loose! Catch me if you can! My speed is: " + this.getMovementSpeed() + "km/h" +
                "\n My wing span is " + this.getWingSpan() + "cm.\n");
    }
}
