package zooassignmentoop;

public class Mammal extends Animal {
    public Mammal(int age, double weight, double height, double movementSpeed, String species, Veterinarian vet) {
        super(age, weight, height, movementSpeed, species, vet);
    }

    @Override
    public void move() {
        WriteToFile.writeToFile(" " + this.getSpecies() + " on the loose! Catch me if you can! My speed is: " + this.getMovementSpeed() + "km/h\n");
    }


}
