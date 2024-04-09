package zooassignmentoop;

public class Guard extends Staff {
    protected String tranquilizerType; // "for big animals", "for small animals"...

    public Guard(int staffId, String name, double salary, String tranquilizerType) {
        super(staffId, name, salary);
        this.setTranquilizerType(tranquilizerType);
    }

    public String getTranquilizerType() {
        return this.tranquilizerType;
    }

    public void setTranquilizerType(String tranquilizerType) {
        this.tranquilizerType = tranquilizerType;
    }

    @Override
    public void introduceMyself() {
        WriteToFile.writeToFile(" Fear me! I am " + this.getName() + ", the zoo guard! I have a tranquilizer " + this.getTranquilizerType() + ".\n");
    }
}
