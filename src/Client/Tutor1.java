
package client;

import adt.TreeSet;
import adt.TreeSetInterface;
import entity.Student;
import entity.TutorialGroup;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Tutor1 {
    private TreeSet<Student> students;
    private TreeSet<TutorialGroup> tutGroup;
    Scanner scanner = new Scanner(System.in);

    public Tutor1(TreeSet<Student> students, TreeSet<TutorialGroup> tutGroup) {
        this.students = students;
        this.tutGroup = tutGroup;
    }

    public TutorialGroup displayTutorialGroup(){
        System.out.println("==================================");
        System.out.println("|        Tutorial Groups         | ");
        System.out.println("==================================");

        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        int i = 1;
        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            System.out.println(i++ + ". " + group);
        }

        // Prompt the user to select a tutorial group
        int groupChoice = 0;
        do {
            try {
                System.out.print("\nEnter the tutorial group number > ");
                groupChoice = scanner.nextInt();
                if (groupChoice < 1 || groupChoice > tutGroup.size()) {
                    System.out.println("Invalid input. Please enter a valid tutorial group number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // discard the invalid input
            }
        } while (groupChoice < 1 || groupChoice > tutGroup.size());

        // Get the selected tutorial group
        TutorialGroup selectedGroup = null;
        int count = 1;

        Iterator<TutorialGroup> tutItr1 = tutGroup.getIterator(); //reset iterator

        while (tutItr1.hasNext()) {
            TutorialGroup group = tutItr1.next();
            if (count == groupChoice) {
                selectedGroup = group;
                break;
            }
            count++;
        }
        return selectedGroup;
    }

    public TutorialGroup displayTutorialGroup(TutorialGroup tutorialGroup){
        System.out.println("==================================");
        System.out.println("|        Tutorial Groups         | ");
        System.out.println("==================================");

        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        int i = 1;
        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            if (group != tutorialGroup) {
                System.out.println(i++ + ". " + group);
            }
        }

        // Prompt the user to select a tutorial group
        int groupChoice = 0;
        do {
            try {
                System.out.print("\nEnter the tutorial group number > ");
                groupChoice = scanner.nextInt();
                if (groupChoice < 1 || groupChoice > tutGroup.size()) {
                    System.out.println("Invalid input. Please enter a valid tutorial group number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // discard the invalid input
            }
        } while (groupChoice < 1 || groupChoice > tutGroup.size());

        // Get the selected tutorial group
        TutorialGroup selectedGroup = null;
        int count = 1;

        Iterator<TutorialGroup> tutItr1 = tutGroup.getIterator(); //reset iterator

        while (tutItr1.hasNext()) {
            TutorialGroup group = tutItr1.next();
            if (count == groupChoice) {
                selectedGroup = group;
                break;
            }
            count++;
        }
        return selectedGroup;
    }

    public boolean checkDuplicateStudent(int stdId, String stdName){
        Student stdToFind = new Student(stdId,stdName);
        if (students.contains(stdToFind)) {
            return true;
        }else
            return false;

    }
    public void addStudent(TutorialGroup tutGroup, int stdId, String stdName){
        Student stdToAdd = new Student(stdId,stdName);
        tutGroup.addStudent(stdToAdd);
    }

    public boolean removeStudent(TutorialGroup tutGroup, Student student){
        if (student != null) {
            tutGroup.getStudents().remove(student);
            return true;
        } else {
            return false;
        }
    }
    public void printAllStudents(TutorialGroup tutGroup) {
        System.out.println("=================================================");
        System.out.println("Students in group "+ tutGroup);
        System.out.println("=================================================");
        System.out.println("    Student ID\t\t     StudentName");

        TreeSetInterface<Student> students = tutGroup.getStudents();
        Iterator<Student> studentIterator = students.getIterator();

        int i = 1;
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            System.out.println(i++ +".   " + student.getStudentId() + "\t\t\t" + student.getStudentName());
        }
        System.out.println("=================================================");
    }

    public void findStudentByNameInAllGroups(String studentName) {

        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        boolean found = false;

        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            found = findStudentByName(group, studentName);
            if (found){
                break;
            }
        }

        if (!found) {
            System.out.println("No students found with the name '" + studentName + "'.");
        }
    }

    public boolean findStudentByName(TutorialGroup tutGroup, String studentName) {
        TreeSetInterface<Student> students = tutGroup.getStudents();
        Iterator<Student> studentIterator = students.getIterator();

        boolean found = false;

        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getStudentName().equalsIgnoreCase(studentName)) {
                found = true;
                System.out.println("Found Student In Tutorial Group: " + tutGroup);
                System.out.println("Student ID: " + student.getStudentId() + "\nStudent Name: " + student.getStudentName());
            }
        }

        return found;
    }

    public void findStudentByIdInAllGroups(int studentId){
        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        boolean found = false;

        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            found = findStudentById(group, studentId);
            if (found){
                break;
            }
        }

        if (!found) {
            System.out.println("No students found with ID '" + studentId + "'.");
        }
    }

    public boolean findStudentById(TutorialGroup tutGroup, int studentId){
        TreeSetInterface<Student> students = tutGroup.getStudents();
        Iterator<Student> studentIterator = students.getIterator();

        boolean found = false;

        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getStudentId()==studentId) {
                found = true;
                System.out.println("Found Student In Tutorial Group: " + tutGroup);
                System.out.println("Student ID: " + student.getStudentId() + "\nStudent Name: " + student.getStudentName());
            }
        }

        return found;
    }

    public void filterTutorialGroupByCode(String progCode){
        System.out.println("Tutorial Groups for Code " + progCode + ":");
        boolean found = false;

        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        int i = 1;
        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            if (group.getProgrammeId().equals(progCode)) {
                System.out.println(i++ + ". " + group);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No tutorial groups found for Code " + progCode + ".");
        }
    }

    public void filterTutorialGroupByYear(int year){
        System.out.println("Tutorial Groups for Year " + year + ":\n");
        boolean found = false;

        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        int i = 1;
        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            if (group.getYear() == year) {
                System.out.println(i++ + ". " + group);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No tutorial groups found for Year " + year + ".");
        }
    }

    public void filterTutorialGroupBySem(int sem){
        System.out.println("Tutorial Groups for Semester " + sem + ":");
        boolean found = false;

        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        int i = 1;
        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            if (group.getSemester() == sem) {
                System.out.println(i++ + ". " + group);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No tutorial groups found for Semester " + sem + ".");
        }
    }

    public void filterTutorialGroupByNum(int groupNo){
        System.out.println("Tutorial Groups for Group No. " + groupNo + ":\n");
        boolean found = false;

        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        int i = 1;
        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            if (group.getGroupNo() == groupNo) {
                System.out.println(i++ + ". " + group);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No tutorial groups found for Group " + groupNo + ".");
        }
    }
}

