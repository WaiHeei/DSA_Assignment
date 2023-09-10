package client;

/*Name : Leng Yen Rou
ID : 220WMR04092*/

import adt.HashMap;
import adt.TreeSet;
import adt.TreeSetInterface;
import entity.Programme;
import entity.Student;
import entity.TutorialGroup;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Tutor1 {
    private TreeSet<Student> students;
    private TreeSet<TutorialGroup> tutGroup;
    private HashMap<String , Programme> programme;
    Scanner scanner = new Scanner(System.in);

    public Tutor1(TreeSet<Student> students, TreeSet<TutorialGroup> tutGroup) {
        this.students = students;
        this.tutGroup = tutGroup;
    }

    public boolean getTutGroup(String programmeId){
        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        int i = 1;

        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            if (group.getProgrammeId().equals(programmeId)) {
                System.out.println("\nTutorial Group Already Exist.");
                return false;
            }
        }
        return true;
    }

    public void removeAllTutorialGroupInProgramme(String deleteProgrammeCode){
        Iterator<TutorialGroup> tutGroupIterator = tutGroup.getIterator();

        if (deleteProgrammeCode != null){
            while (tutGroupIterator.hasNext()) {
                TutorialGroup group = tutGroupIterator.next();
                if (group.getProgrammeId().equals(deleteProgrammeCode)) {
                    tutGroup.remove(group); // Remove the matching tutorial group
                }
            }
        }
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
        System.out.println("    Student ID\t\tStudentName");

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

    public boolean findAllStudentById(TreeSet<Student> students, int studentId){
//        TreeSetInterface<Student> students = tutGroup.getStudents();
        Iterator<Student> studentIterator = students.getIterator();

        boolean found = false;
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getStudentId() == (studentId)) {
                found = true;
            }
        }
        return found;
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

    public int getYearCount(int year){
        int count = 0;
        boolean found = false;
        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            if (group.getYear() == year) {
                count++;
                found = true;
            }
        }
        return count;
    }

    public int getSemCount(int year, int sem){
        int count = 0;
        boolean found = false;
        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            if (group.getYear() == year && group.getSemester() == sem) {
                count++;
                found = true;
            }
        }
        return count;
    }

    public int getGroupCount(int year, int sem, int groupNo){
        int count = 0;
        boolean found = false;
        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        while (tutItr.hasNext()) {
            TutorialGroup group = tutItr.next();
            if (group.getYear() == year && group.getSemester() == sem && group.getGroupNo() == groupNo) {
                count++;
                found = true;
            }
        }
        return count;
    }

    public int getStudentCount(){
        int count = 0;
        boolean found = false;
        Iterator<Student> studentIterator = students.getIterator();

        while (studentIterator.hasNext()) {
            Student std = studentIterator.next();
            count++;
            found = true;
        }
        return count;
    }

    public int getStudentCount(int year){
        int count = 0;
        boolean found = false;
        Iterator<TutorialGroup> tutItr = tutGroup.getIterator();

        while (tutItr.hasNext()){
            TutorialGroup group = tutItr.next();
            if (group.getYear() == year){
                count += group.getStudents().size();
                found = true;
            }
        }
        return count;
    }
}

