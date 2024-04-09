package zooassignmentoop;

public class Main {
    public static void main(String[] args) {
        Guard guard1 = new Guard(1, "Maximilian", 1000, "for big animals");
        Guard guard2 = new Guard(2, "Albert", 900, "for small animals");

//        guard1.introduceMyself();
//        guard2.introduceMyself();

        Veterinarian vet1 = new Veterinarian(3, "Mark", 2000, "everything");
        Veterinarian vet2 = new Veterinarian(4, "Peter", 1800, "big animals");
        Veterinarian vet3 = new Veterinarian(5, "Timo", 1500, "small animals");

//        vet1.introduceMyself();
//        vet2.introduceMyself();
//        vet3.introduceMyself();

        MaintenanceWorkerFactory maintenanceWorkerFactory = new MaintenanceWorkerFactory();
        MaintenanceWorker janitor1 = maintenanceWorkerFactory.getWorkerType(6, "Sebastian", 400.0, "JANITOR");
        MaintenanceWorker handyman1 = maintenanceWorkerFactory.getWorkerType(7, "Fritz", 500.0, "HANDYMAN");
        MaintenanceWorker animalKeeper1 = maintenanceWorkerFactory.getWorkerType(8, "Hans", 600.0, "ANIMAL KEEPER");
        MaintenanceWorker botanist1 = maintenanceWorkerFactory.getWorkerType(9, "Klaus", 700.0, "BOTANIST");

//        janitor1.introduceMyself();
//        janitor1.describeMyJob();
//        handyman1.introduceMyself();
//        handyman1.describeMyJob();
//        animalKeeper1.introduceMyself();
//        animalKeeper1.describeMyJob();
//        botanist1.introduceMyself();
//        botanist1.describeMyJob();

        Animal elephantDumbo = new Mammal(2, 500.0, 200.0, 10.0, "Elephant", vet2);
        Animal tigerTom = new Mammal(5, 150.0, 50.0, 150.0, "Tiger", vet2);
        Animal dodoBirdy = new Bird(3, 30.0, 50.0, 40, "Dodo bird", vet1, 60.0);
        Animal atomicAnt = new Insect(1, 0.001, 0.0001, 0.1, "Ant", vet3, 6);

//        elephantDumbo.move();
//        tigerTom.move();
//        dodoBirdy.move();
//        atomicAnt.move();

        WriteToFile.writeToFile("~~ An ordinary day in the zoo ~~\n");

        WriteToFile.writeToFile("06:00 - botanists water the plants:");
        botanist1.introduceMyself();
        botanist1.describeMyJob();

        WriteToFile.writeToFile("08:00 - the janitor opens the gates to the park:");
        janitor1.introduceMyself();
        janitor1.describeMyJob();

        WriteToFile.writeToFile("09:00 - one of the animals breaks out of its cage:");
        Animal runAwayAnimal = getRandomAnimal(elephantDumbo, tigerTom, dodoBirdy, atomicAnt);
        runAwayAnimal.move();

        WriteToFile.writeToFile("11:00 - the break out was noticed:");
        double distance = runAwayAnimal.movementSpeed * 2;
        WriteToFile.writeToFile(" The " + runAwayAnimal.getSpecies() + " managed to make a " + distance + "km distance from the zoo.");

        Guard chosenGuard = getRandomGuard(guard1, guard2);
        WriteToFile.writeToFile(" The guard " + chosenGuard.getName() + " tranquilized the animal.");

        WriteToFile.writeToFile(" The vet " + runAwayAnimal.getDesignatedVeterinarian().getName() + " made sure the animal was OK before it was put back in the cage.\n");

        WriteToFile.writeToFile("14:00 - one of the animal keepers is fined with a salary cut and one of the handymen repairs the cage:");
        WriteToFile.writeToFile(" Animal keeper " + animalKeeper1.getName() + " was responsible for the breakout.");
        WriteToFile.writeToFile(" The animal keeper's salary before he was fined: " + animalKeeper1.getSalary());
        animalKeeper1.setSalary(animalKeeper1.getSalary() * 0.9);
        WriteToFile.writeToFile(" The animal keeper's salary after he was fined: " + animalKeeper1.getSalary());

        WriteToFile.writeToFile(" Handyman " + handyman1.getName() + " repairs the cage.\n");

        WriteToFile.writeToFile("16:00 - the janitor closes the gates and the day is over:");
        janitor1.introduceMyself();
        janitor1.describeMyJob();
    }

    public static Animal getRandomAnimal(Animal elephantDumbo, Animal tigerTom, Animal dodoBirdy, Animal atomicAnt) {
        Animal[] animals = {elephantDumbo, tigerTom, dodoBirdy, atomicAnt};

        double[] probabilities = {0.25, 0.25, 0.3, 0.2};

        double randomNumber = Math.random();

        double cumulativeProbability = 0;

        for (int i = 0; i < animals.length; i++) {
            cumulativeProbability += probabilities[i];

            if (randomNumber < cumulativeProbability) {
                return animals[i];
            }
        }

        return elephantDumbo;
    }

    public static Guard getRandomGuard(Guard guard1, Guard guard2) {
        return Math.random() > 0.5 ? guard1 : guard2;
    }
}
