package zooassignmentoop;

public abstract class Staff {
    protected int staffId;
    protected String name;
    protected double salary;

    public Staff(int staffId, String name, double salary) {
        this.setStaffId(staffId);
        this.setName(name);
        this.setSalary(salary);
    }

    public int getStaffId() {
        return this.staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void introduceMyself();
}
