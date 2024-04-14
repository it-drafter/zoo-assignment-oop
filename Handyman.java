package zooassignmentoop;

public class Handyman extends MaintenanceWorker {
    public Handyman(int staffId, String name, double salary, String maintenanceWorkType) {
        super(staffId, name, salary, maintenanceWorkType);
    }

    @Override
    public void describeMyJob() {
        FilePrinter.writeToFile(" I fix things.\n");
    }
}
