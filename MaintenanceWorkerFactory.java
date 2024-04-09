package zooassignmentoop;

public class MaintenanceWorkerFactory {

    public MaintenanceWorker getWorkerType(int staffId, String name, double salary, String maintenanceWorkType) {
        if (maintenanceWorkType == null) {
            return null;
        }

        if (maintenanceWorkType.equalsIgnoreCase("JANITOR")) {
            return new Janitor(staffId, name, salary, maintenanceWorkType);
        } else if (maintenanceWorkType.equalsIgnoreCase("HANDYMAN")) {
            return new Handyman(staffId, name, salary, maintenanceWorkType);
        } else if (maintenanceWorkType.equalsIgnoreCase("ANIMAL KEEPER")) {
            return new AnimalKeeper(staffId, name, salary, maintenanceWorkType);
        } else if (maintenanceWorkType.equalsIgnoreCase("BOTANIST")) {
            return new Botanist(staffId, name, salary, maintenanceWorkType);
        }

        return null;
    }
}
