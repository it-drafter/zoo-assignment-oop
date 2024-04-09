package zooassignmentoop;

public class Veterinarian extends Staff {
    protected String areaOfExpertise;

    public Veterinarian(int staffId, String name, double salary, String areaOfExpertise) {
        super(staffId, name, salary);
        this.setAreaOfExpertise(areaOfExpertise);
    }

    public String getAreaOfExpertise() {
        return this.areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }

    @Override
    public void introduceMyself() {
        WriteToFile.writeToFile(" I am here to help! I am " + this.getName() + ", the zoo vet! I am an expert at: " + this.getAreaOfExpertise() + ".\n");
    }
}
