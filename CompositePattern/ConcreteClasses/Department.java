package CompositePattern.ConcreteClasses;

import CompositePattern.Interface.EducationalUnit;

import java.util.ArrayList;
import java.util.List;

public class Department implements EducationalUnit {
    private String name;
    private List<EducationalUnit> members = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        members.add(unit);
    }

    public void remove(EducationalUnit unit) {
        members.remove(unit);
    }

    @Override
    public int getNumberOfStudents() {
        int total = 0;
        for (EducationalUnit unit : members) {
            total += unit.getNumberOfStudents();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : members) {
            total += unit.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("  Department: " + name);
        for (EducationalUnit unit : members) {
            unit.displayDetails();
        }
    }
}