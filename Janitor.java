package zooassignmentoop;

public class Janitor extends MaintenanceWorker {
    public Janitor(int staffId, String name, double salary, String maintenanceWorkType) {
        super(staffId, name, salary, maintenanceWorkType);
    }

    @Override
    public void describeMyJob() {
        WriteToFile.writeToFile(" I open and close the gates to the park.\n");
    }
}
