package zooassignmentoop;

public class AnimalKeeper extends MaintenanceWorker {
    public AnimalKeeper(int staffId, String name, double salary, String maintenanceWorkType) {
        super(staffId, name, salary, maintenanceWorkType);
    }

    @Override
    public void describeMyJob() {
        FilePrinter.writeToFile(" I keep animals in their cages.\n");
    }
}
