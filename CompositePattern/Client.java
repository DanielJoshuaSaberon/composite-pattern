package CompositePattern;

import CompositePattern.ConcreteClasses.*;

public class Client {
    public static void main(String[] args) {

        Teacher csTeacher = new Teacher("Dr. Villanueva", "Artificial Intelligence", 72000);
        Teacher itTeacher = new Teacher("Engr. Soriano", "Cloud Computing", 68000);

        Student csStudent1 = new Student("Alexa", "23-11223-456", 36000);
        Student csStudent2 = new Student("Nico", "23-11456-789", 36000);
        Student csStudent3 = new Student("Gwen", "23-11678-901", 36000);

        Student itStudent1 = new Student("Marco", "23-22123-111", 34000);
        Student itStudent2 = new Student("Jessa", "23-22999-222", 34000);

        Department csDept = new Department("Department of Computer Vision and AI");
        csDept.add(csTeacher);
        csDept.add(csStudent1);
        csDept.add(csStudent2);
        csDept.add(csStudent3);

        Department itDept = new Department("Department of Cloud Systems");
        itDept.add(itTeacher);
        itDept.add(itStudent1);
        itDept.add(itStudent2);

        College techCollege = new College("College of Emerging Technologies");
        techCollege.add(csDept);
        techCollege.add(itDept);

        techCollege.displayDetails();
        System.out.println("\nTotal number of students: " + techCollege.getNumberOfStudents());
        System.out.println("Total budget: ₱" + techCollege.getBudget());
    }
}
