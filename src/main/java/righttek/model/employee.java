package righttek.model;

/**
 * @author Diego Yance
 */
public class employee {
    private Float salary;
    private String name;
    private boolean hasChild, hasCouple, hasAdult;

    /**
     *
     * @param salary amount that an employee wins monthly
     * @param name name of the employee
     * @param hasChild if an employee has or not child
     * @param hasCouple if an employee is or not married
     * @param hasAdult if an employee has or not old persons at his care
     */
    public employee(float salary, String name, boolean hasChild, boolean hasCouple, boolean hasAdult) {
        this.salary = salary;
        this.name = name;
        this.hasChild = hasChild;
        this.hasCouple = hasCouple;
        this.hasAdult = hasAdult;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasChild() {
        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public boolean isHasCouple() {
        return hasCouple;
    }

    public void setHasCouple(boolean hasCouple) {
        this.hasCouple = hasCouple;
    }

    public boolean isHasAdult() {
        return hasAdult;
    }

    public void setHasAdult(boolean hasAdult) {
        this.hasAdult = hasAdult;
    }
}
