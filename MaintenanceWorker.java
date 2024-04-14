package zooassignmentoop;

public abstract class MaintenanceWorker extends Staff {
    protected String maintenanceWorkType; // janitor, handyman, animal keeper, botanist

    public MaintenanceWorker(int staffId, String name, double salary, String maintenanceWorkType) {
        super(staffId, name, salary);
        this.setMaintenanceWorkType(maintenanceWorkType);
    }

    public String getMaintenanceWorkType() {
        return this.maintenanceWorkType;
    }

    public void setMaintenanceWorkType(String maintenanceWorkType) {
        this.maintenanceWorkType = maintenanceWorkType;
    }

    @Override
    public void introduceMyself() {
        FilePrinter.writeToFile(" Hi! I am " + this.getName() + ", a zoo maintenance worker! " + this.getMaintenanceWorkType() + " to be precise.");
    }

    public abstract void describeMyJob();

}
