package zooassignmentoop;

public abstract class Animal {
    protected int age;
    protected double weight;
    protected double height;
    protected double movementSpeed;
    protected String species;
    protected Veterinarian designatedVeterinarian;


    public Animal(int age, double weight, double height, double movementSpeed, String species, Veterinarian designatedVeterinarian) {
        this.setAge(age);
        this.setWeight(weight);
        this.setHeight(height);
        this.setMovementSpeed(movementSpeed);
        this.setSpecies(species);
        this.setDesignatedVeterinarian(designatedVeterinarian);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMovementSpeed() {
        return this.movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Veterinarian getDesignatedVeterinarian() {
        return this.designatedVeterinarian;
    }

    public void setDesignatedVeterinarian(Veterinarian designatedVeterinarian) {
        this.designatedVeterinarian = designatedVeterinarian;
    }

    public abstract void move();

}
