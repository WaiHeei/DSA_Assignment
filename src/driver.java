import adt.HashMap;
import adt.HashMapInterface;
import adt.TreeSet;
import adt.TreeSetInterface;
import client.ProgrammeManager;
import client.Tutor1;
import entity.Programme;
import entity.Student;
import entity.TutorialGroup;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

//Name: Ng Wai Heei, Leng Yen Rou
//Student ID: 22WMR04095 , 22WMR04092

public class driver {
    public static void Menu(){
        System.out.println("===========================================");
        System.out.println("|                  Menu                   |");
        System.out.println("===========================================");
        System.out.println("|        1. Manage programme              |");
        System.out.println("|        2. Manage tutorial group         |");
        System.out.println("|        3. Exit                          |");
        System.out.println("===========================================");
    }
    public static void programmeMenu(){
        System.out.println("=====================================================");
        System.out.println("=============== Programme Management ================");
        System.out.println("=====================================================");
        System.out.println("             1.  Add a programme                     ");
        System.out.println("             2.  Delete a programme                  ");
        System.out.println("             3.  Search a programme                  ");
        System.out.println("             4.  Amend a programme                   ");
        System.out.println("             5.  List all programme                  ");
        System.out.println("             6.  Add tutorial Group                  ");
        System.out.println("             7.  Add tutorial group to Programme     ");
        System.out.println("             8.  Remove tutorial group from Programme");
        System.out.println("             9.  Generate Report                     ");
        System.out.println("             0.  Back to Main Menu                   ");
        System.out.println("=====================================================");
    }

    public static void tutMenu() {
        System.out.println("===========================================");
        System.out.println("|                  Menu                   |");
        System.out.println("===========================================");
        System.out.println("|        1. Manage student                |");
        System.out.println("|        2. Search for tutorial group     |");
        System.out.println("|        3. Display summary               |");
        System.out.println("|        4. Exit                          |");
        System.out.println("===========================================");

    }

    public static void manageMenu() {
        System.out.println("================================================");
        System.out.println("|             Manage Tutorial Group            |");
        System.out.println("================================================");
        System.out.println("|       1. Add student to a group              |");
        System.out.println("|       2. Remove student from a group         |");
        System.out.println("|       3. Change tutorial group for a student |");
        System.out.println("|       4. Find a student                      |");
        System.out.println("|       5. List all student in a group         |");
        System.out.println("================================================");

    }
    public static void addStudentMenu() {
        System.out.println("===========================================");
        System.out.println("|              Add a student              |");
        System.out.println("===========================================");
        System.out.println("\n------------New Student Details------------");
    }

    public static void continueMenu(){
        System.out.println("\n==========================================");
        System.out.println("|           1. Continue                   |");
        System.out.println("|           2. Exit to main menu          |");
        System.out.println("===========================================");

    }

    public static void filterMenu(){
        System.out.println("==============================");
        System.out.println("|   Select filter criteria   |");
        System.out.println("==============================");
        System.out.println("|     1. Programme code      |");
        System.out.println("|     2. Year                |");
        System.out.println("|     3. Semester            |");
        System.out.println("|     4. Group               |");
        System.out.println("==============================");
    }

    public static boolean valid = true;
    public static boolean validProgramme = true;
    public static boolean validTutGroup = true;

    public static void main(String[] args) {
        TreeSet<Student> student = new TreeSet<>();
        TreeSet<TutorialGroup> tutGroup = new TreeSet<>();
        HashMapInterface<String, Programme> programmeList = new HashMap<>();

        Tutor1 tutor = new Tutor1(student,tutGroup);
        ProgrammeManager programmeManager = new ProgrammeManager(programmeList);

        //Create data
        Programme programme1 = new Programme("P1", "RSW", "Software Engineering", "Bachelor in Software Engineering", "Dr. Jason Wong", 3);
        Programme programme2 = new Programme("P2", "RDS", "Data Science", "Bachelor in Data Science", "Ts. Lim Shen Huoy", 3);

        programmeList.put(programme1.getId(), programme1);
        programmeList.put(programme2.getId(), programme2);


        Student student1 = new Student(1001, "Jacky Tan");
        Student student2 = new Student(1002, "Sarah Choo");
        Student student3 = new Student(1003, "Carol Lim");
        Student student4 = new Student(1004, "Nicky Chan");
        Student student5 = new Student(1005, "Jessie Tan");
        Student student6 = new Student(1006, "Yvonne Khoo");
        Student student7 = new Student(1007, "Mickey Mouse");
        Student student8 = new Student(1008, "Alice Loo");
        Student student9 = new Student(1009, "Alicia Chen");
        Student student10 = new Student(1010, "Kevin Soh");
        Student student11 = new Student(2001, "Justin Gan");
        Student student12 = new Student(2002, "Yuki Low");
        Student student13 = new Student(2003, "Sasha Soo");
        Student student14 = new Student(2004, "Kelly Yong");
        Student student15 = new Student(2005, "Brandon Sim");
        Student student16 = new Student(2006, "Dexter Goh");
        Student student17 = new Student(2007, "Lisa Lum");
        Student student18 = new Student(2008, "Emily Poh");
        Student student19 = new Student(2009, "Alex Chan");
        Student student20 = new Student(2010, "Amira");
        Student student21 = new Student(3001, "Nurul");
        Student student22 = new Student(3002, "Oxy Ooi");
        Student student23 = new Student(3003, "Selina Lim");
        Student student24 = new Student(3004, "Hebe Tien");
        Student student25 = new Student(3005, "Ella Chen");
        Student student26 = new Student(3006, "Maria");
        Student student27 = new Student(3007, "Munisha");
        Student student28 = new Student(3008, "Michiyo Tan");
        Student student29 = new Student(3009, "Elyn Cheong");
        Student student30 = new Student(3010, "Yannis Tho");

        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        student.add(student6);
        student.add(student7);
        student.add(student8);
        student.add(student9);
        student.add(student10);
        student.add(student11);
        student.add(student12);
        student.add(student13);
        student.add(student14);
        student.add(student15);
        student.add(student16);
        student.add(student17);
        student.add(student18);
        student.add(student19);
        student.add(student20);
        student.add(student21);
        student.add(student22);
        student.add(student23);
        student.add(student24);
        student.add(student25);
        student.add(student26);
        student.add(student27);
        student.add(student28);
        student.add(student29);
        student.add(student30);

        TutorialGroup tutGrp1 = new TutorialGroup("TG1",programmeList.get(programme1.getId()).getCode(), 1, 1, 1);
        TutorialGroup tutGrp2 = new TutorialGroup("TG2",programmeList.get(programme1.getId()).getCode(), 2, 2, 3);
        TutorialGroup tutGrp3 = new TutorialGroup("TG3",programmeList.get(programme1.getId()).getCode(), 3, 1, 2);

        TutorialGroup tutGrp4 = new TutorialGroup("TG4",programmeList.get(programme2.getId()).getCode(), 1, 2, 3);
        TutorialGroup tutGrp5 = new TutorialGroup("TG5",programmeList.get(programme2.getId()).getCode(), 2, 3, 2);
        TutorialGroup tutGrp6 = new TutorialGroup("TG6",programmeList.get(programme2.getId()).getCode(), 3, 1, 1);

        tutGroup.add(tutGrp1);
        tutGroup.add(tutGrp2);
        tutGroup.add(tutGrp3);
        tutGroup.add(tutGrp4);
        tutGroup.add(tutGrp5);
        tutGroup.add(tutGrp6);

        //year 1
        tutGrp1.addStudent(student1);
        tutGrp1.addStudent(student2);
        tutGrp1.addStudent(student3);
        tutGrp1.addStudent(student4);
        tutGrp1.addStudent(student5);

        tutGrp1.addStudent(student6);
        tutGrp1.addStudent(student7);
        tutGrp1.addStudent(student8);
        tutGrp1.addStudent(student9);
        tutGrp1.addStudent(student10);

        //year 2
        tutGrp2.addStudent(student11);
        tutGrp2.addStudent(student12);
        tutGrp2.addStudent(student13);
        tutGrp2.addStudent(student14);
        tutGrp2.addStudent(student15);

        tutGrp5.addStudent(student16);
        tutGrp5.addStudent(student17);
        tutGrp5.addStudent(student18);
        tutGrp5.addStudent(student19);
        tutGrp5.addStudent(student20);

        //year 3
        tutGrp3.addStudent(student21);
        tutGrp3.addStudent(student22);
        tutGrp3.addStudent(student23);
        tutGrp3.addStudent(student24);
        tutGrp3.addStudent(student25);

        tutGrp6.addStudent(student26);
        tutGrp6.addStudent(student27);
        tutGrp6.addStudent(student28);
        tutGrp6.addStudent(student29);
        tutGrp6.addStudent(student30);

        Scanner scanner = new Scanner(System.in);


        boolean validId = false;
        boolean validCtnChoice = false;
        boolean continue1 = false;
        boolean continue2 = false;
        boolean exitToMenu = false;
        boolean continue5 = false;
        int tutMenuChoice = 0;
        int stdId = 0;
        int continueChoice = 0;

        while (valid == true){

            Menu();
            int mainMenuChoice = 0;
            do {
                try {
                    System.out.print("\nEnter your choice > ");
                    mainMenuChoice = scanner.nextInt();
                    if (mainMenuChoice < 1 || mainMenuChoice > 3) {
                        System.out.println("Invalid input. Please enter a number between 1 and 3.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // discard the invalid input
                }
            } while (mainMenuChoice < 1 || mainMenuChoice > 3);

            if (mainMenuChoice == 1){

                do {
                    scanner.nextLine();
                    programmeMenu();
                    System.out.println("Enter your choice > ");
                    String pOption = scanner.next();

                    if (pOption.equals("1")) {
                        programmeManager.addProgramme(programmeList);
                    } else if (pOption.equals("2")) {
                        String pCode = programmeManager.deleteProgramme(programmeList);
                        tutor.removeAllTutorialGroupInProgramme(pCode);
                    } else if (pOption.equals("3")) {
                        programmeManager.searchProgramme(programmeList);
                    } else if (pOption.equals("4")) {
                        scanner.nextLine();
                        programmeManager.editProgramme(programmeList);
                    } else if (pOption.equals("5")) {
                        programmeManager.displayProgrammeList(programmeList);
                    } else if (pOption.equals("6")) {
                        tutor.printAllGroup();
                        System.out.println("Enter year: ");
                        int year = scanner.nextInt();
                        System.out.println("Enter Sem: ");
                        int sem = scanner.nextInt();
                        System.out.println("Enter group: ");
                        int group = scanner.nextInt();
                        tutor.addTutorialGroup(tutGroup,"", year, sem, group );
                        System.out.println("");
                        tutor.printAllGroup();

                    } else if (pOption.equals("7")) {
                        programmeManager.displayExistingProgramme(programmeList);

                        System.out.println("\nEnter programme ID to add tutorial group: ");
                        String addTutID = scanner.next();
                        tutor.checkNull();
                        System.out.println("Enter the Tutorial Group ID to add: ");
                        String tutGroupId = scanner.next();
                        int newTutGrpYear = tutor.getTutGroupYearByID(tutGroupId);
                        int newTutGrpSem = tutor.getTutGroupSemByID(tutGroupId);
                        int newTutGrpNo = tutor.getTutGroupNoByID(tutGroupId);
                        Programme newProgramme = programmeList.get(addTutID);
                        TutorialGroup oldTutGrp = tutor.checkNullGroup();
                        tutGroup.remove(oldTutGrp);
                        String newProgrammeCode = programmeList.get(newProgramme.getId()).getCode();

                        TutorialGroup newTutGrp = new TutorialGroup(tutGroupId, newProgrammeCode,newTutGrpYear, newTutGrpSem, newTutGrpNo);
                        tutGroup.add(newTutGrp);

                        System.out.println("Successfully Added!");

                    }else if (pOption.equals("8")){
                        tutor.printAllGroup();
                        System.out.println("Enter Tutorial Group Id to remove: ");
                        String removeID = scanner.next();
                        if (tutor.checkTutGroup(removeID)) {
                            TutorialGroup removeGroup = tutor.getTutGroupByID(removeID);
                            tutGroup.remove(removeGroup);
                            System.out.println("Successfully removed!");
                        }else {
                            System.out.println("No such tutorial group!");
                        }
                    }else if (pOption.equals("9")){
                        programmeManager.displayAllProgramme(programmeList);


                    }else if(pOption.equals("0")){
                        validProgramme = false;
                    }
                } while (validProgramme);
            } else if (mainMenuChoice == 2) {
                do {
                    tutMenu();
                    do {
                        try {
                            System.out.println("\nEnter your choice > ");
                            tutMenuChoice = scanner.nextInt();
                            if (tutMenuChoice < 1 || tutMenuChoice > 4) {
                                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            scanner.next(); // discard the invalid input
                        }
                    } while (tutMenuChoice < 1 || tutMenuChoice > 4);


                    if (tutMenuChoice == 1) {
                        manageMenu();
                        int manageMenuChoice = 0;
                        do {
                            try {
                                System.out.print("\nEnter your choice > ");
                                manageMenuChoice = scanner.nextInt();
                                if (manageMenuChoice < 1 || manageMenuChoice > 5) {
                                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard the invalid input
                            }
                        } while (manageMenuChoice < 1 || manageMenuChoice > 5);

                        switch (manageMenuChoice) {

                            case 1:   //Add a new student
                                do {
                                    //Display all tutorial group
                                    TutorialGroup selectedGroup = tutor.displayTutorialGroup();

                                    addStudentMenu();

                                    do {
                                        try {
                                            System.out.print("\nStudent ID > ");
                                            stdId = scanner.nextInt();
                                            validId = true;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validId = false;
                                        }
                                    } while (validId == false);

                                    System.out.print("\nStudent Name > ");
                                    scanner.nextLine();
                                    String stdName = scanner.nextLine();

                                    // Check for duplicate student
//                                    boolean duplicateStudent = student.checkDuplicateStudent(stdId,stdName);
                                    Student newStud = new Student(stdId,stdName);
//                                    boolean duplicateStudent = false;
//
//                                    Iterator<Student> stdItr = student.getIterator();
//                                    while (stdItr.hasNext() && duplicateStudent == false){
//                                        duplicateStudent = student.equals(newStud);
//                                    }
                                    boolean duplicateStudent = tutor.findAllStudentById(student,stdId);

                                    if (duplicateStudent == false) {
                                        tutor.addStudent(selectedGroup,stdId, stdName);
//                                        student.add(newStud);
                                        System.out.println("\nStudent added to tutorial group successfully.\n");
                                    } else {
                                        System.out.println("\nDuplicate student detected");
                                        System.out.println("\nAdding Student Unsuccessful.");
                                    }

                                    continueMenu();
                                    do {
                                        try {
                                            System.out.print("\nEnter your choice > ");
                                            continueChoice = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (continueChoice < 1 || continueChoice > 2) {
                                                System.out.println("Invalid input. Please enter number 1 or 2.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    if (continueChoice == 1) {
                                        continue1 = true;
                                    } else {
                                        continue1 = false;
                                        exitToMenu = true;
                                    }
                                } while (continue1 == true);
                                break;

                            case 2:  //Remove a student from group
                                do {
                                    TutorialGroup groupChoice = null;
                                    do {
                                        System.out.println("Select tutorial group : ");
                                        groupChoice = tutor.displayTutorialGroup();

                                        if (!groupChoice.getStudents().isEmpty()){
                                            tutor.printAllStudents(groupChoice);

                                            int stdIndex = 0;
                                            do {
                                                try {
                                                    System.out.print("\nEnter index for student to delete > ");
                                                    stdIndex = scanner.nextInt();
                                                    if (stdIndex < 1 || stdIndex > groupChoice.getStudents().size()) {
                                                        System.out.println("Invalid input. Please enter a valid index number.");
                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Invalid input. Please enter a number.");
                                                    scanner.next(); // discard the invalid input
                                                }
                                            } while (stdIndex < 1 || stdIndex > groupChoice.getStudents().size());

                                            Student studentToDelete = null;
                                            int currentIndex = 1;
                                            Iterator<Student> studentIterator = groupChoice.getStudents().getIterator();

                                            while (studentIterator.hasNext()) {
                                                Student students = studentIterator.next();
                                                if (currentIndex == stdIndex) {
                                                    studentToDelete = students;
                                                    break;
                                                }
                                                currentIndex++;
                                            }

                                            boolean deleteStudent = tutor.removeStudent(groupChoice,studentToDelete);

                                            if (deleteStudent == true){
                                                System.out.println("\nStudent Deleted.\n");
                                            }else {
                                                System.out.println("\nStudent Delete Unsuccessful.\n");
                                            }

                                        }else {
                                            System.out.println("\nNo student in this tutorial group.\n");
                                            continue5 = false;
                                        }
                                    }while (continue5 == true);

                                    continueMenu();
                                    do {
                                        try {
                                            System.out.print("\nEnter your choice > ");
                                            continueChoice = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (continueChoice < 1 || continueChoice > 2) {
                                                System.out.println("Invalid input. Please enter number 1 or 2.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    if (continueChoice == 1) {
                                        continue2 = true;
                                    } else {
                                        continue2 = false;
                                        exitToMenu = true;
                                    }
                                } while (continue2 == true);
                                break;

                            case 3:   //Change tutorial group for a student
                                boolean noStudent = false;
                                do {
                                    System.out.println("Select student from tutorial group : ");
                                    TutorialGroup selectedGroup3 = tutor.displayTutorialGroup();

                                    if (!selectedGroup3.getStudents().isEmpty()){
                                        tutor.printAllStudents(selectedGroup3);
                                        noStudent = false;
                                    }else {
                                        System.out.println("\nNo student in this tutorial group.\n");
                                        noStudent = true;
                                    }

                                    while (noStudent == false){
                                        int stdIndex = 0;
                                        do {
                                            try {
                                                System.out.print("\nEnter index for student to amend > ");
                                                stdIndex = scanner.nextInt();
                                                if (stdIndex < 1 || stdIndex > selectedGroup3.getStudents().size()) {
                                                    System.out.println("Invalid input. Please enter a valid index number.");
                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("Invalid input. Please enter a number.");
                                                scanner.next(); // discard the invalid input
                                            }
                                        } while (stdIndex < 1 || stdIndex > selectedGroup3.getStudents().size());

                                        Student studentToAmend = null;
                                        int currentIndex = 1;
                                        Iterator<Student> studentIterator = selectedGroup3.getStudents().getIterator();

                                        while (studentIterator.hasNext()) {
                                            Student std = studentIterator.next();
                                            if (currentIndex == stdIndex) {
                                                studentToAmend = std;
                                                break;
                                            }
                                            currentIndex++;
                                        }

                                        System.out.println("============================================");
                                        System.out.println("Currently Selected : " + studentToAmend.getStudentId());
                                        System.out.println("============================================");

                                        boolean removeStd = tutor.removeStudent(selectedGroup3, studentToAmend);

                                        System.out.println("\nChange to Tutorial Group : ");

                                        TutorialGroup grpToChange = tutor.displayTutorialGroup(selectedGroup3);

                                        tutor.addStudent(grpToChange, studentToAmend.getStudentId(),studentToAmend.getStudentName());

                                        System.out.println("\nStudent Changed Successful.");
                                        noStudent = true;
                                    }

                                    continueMenu();
                                    do {
                                        try {
                                            System.out.print("\nEnter your choice > ");
                                            continueChoice = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (tutMenuChoice < 1 || tutMenuChoice > 2) {
                                                System.out.println("Invalid input. Please enter number 1 or 2.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    if (continueChoice == 1) {
                                        continue2 = true;
                                    } else {
                                        continue2 = false;
                                        exitToMenu = true;
                                    }
                                }while (continue2 == true);
                                break;

                            case 4:   //Find a student
                                do {
                                    System.out.println("Choose to find student with : ");
                                    System.out.println("1.  Student Name");
                                    System.out.println("2.  Student ID");

                                    int findChoice = 0;
                                    do {
                                        try {
                                            System.out.print("\nEnter your choice > ");
                                            findChoice = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (findChoice < 1 || findChoice > 2) {
                                                System.out.println("Invalid input. Please enter number 1 or 2.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    if (findChoice == 1){
                                        System.out.print("\nEnter Student Name > ");
                                        scanner.nextLine();
                                        String findStdName = scanner.nextLine();

                                        tutor.findStudentByNameInAllGroups(findStdName);

                                    }else {
                                        System.out.print("\nEnter student ID > ");
                                        int findStdId = scanner.nextInt();

                                        tutor.findStudentByIdInAllGroups(findStdId);

                                    }
                                    continueMenu();
                                    do {
                                        try {
                                            System.out.print("\nEnter your choice > ");
                                            continueChoice = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (tutMenuChoice < 1 || tutMenuChoice > 2) {
                                                System.out.println("Invalid input. Please enter number 1 or 2.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    if (continueChoice == 1) {
                                        continue2 = true;
                                    } else {
                                        continue2 = false;
                                        exitToMenu = true;
                                    }
                                } while (continue2 == true);
                                break;

                            case 5:   //List all student in a tutorial group
                                do{
                                    do {
                                        System.out.println("Select tutorial group : ");
                                        TutorialGroup groupChoice = tutor.displayTutorialGroup();

                                        if (!groupChoice.getStudents().isEmpty()){
                                            tutor.printAllStudents(groupChoice);
                                        }else {
                                            System.out.println("\nNo student in this tutorial group.\n");
                                            continue5 = false;
                                        }
                                    }while (continue5 == true);
                                    continueMenu();
                                    do {
                                        try {
                                            System.out.print("\nEnter your choice > ");
                                            continueChoice = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (tutMenuChoice < 1 || tutMenuChoice > 2) {
                                                System.out.println("Invalid input. Please enter number 1 or 2.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    if (continueChoice == 1) {
                                        continue2 = true;
                                    } else {
                                        continue2 = false;
                                        exitToMenu = true;
                                    }
                                } while (continue2 == true);
                                break;
                        }
                    } else if (tutMenuChoice == 2) {
                        filterMenu();

                        int filterChoice = 0;
                        do {
                            try {
                                System.out.print("\nEnter your choice > ");
                                filterChoice = scanner.nextInt();
                                validCtnChoice = true;

                                if (filterChoice < 1 || filterChoice > 4) {
                                    System.out.println("Invalid input. Please enter number 1 to 4.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard the invalid input
                                validCtnChoice = false;
                            }
                        } while (validCtnChoice == false);

                        switch (filterChoice){
                            case 1:  //filter by programme code
                                do {
                                    System.out.print("Enter programme code (RDS/RSW) > ");
                                    String progCode = scanner.next();

                                    tutor.filterTutorialGroupByCode(progCode);

                                    continueMenu();
                                    do {
                                        try {
                                            System.out.print("\nEnter your choice > ");
                                            continueChoice = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (continueChoice < 1 || continueChoice > 2) {
                                                System.out.println("Invalid input. Please enter number 1 or 2.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    if (continueChoice == 1) {
                                        continue2 = true;
                                    } else {
                                        continue2 = false;
                                    }
                                }while (continue2 == true);
                                break;

                            case 2:
                                do {
                                    int yearInput = 0;
                                    do {
                                        try {
                                            System.out.print("Enter year > ");
                                            yearInput = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (yearInput < 1 || yearInput > 4) {
                                                System.out.println("No such year.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    tutor.filterTutorialGroupByYear(yearInput);

                                    continueMenu();
                                    do {
                                        try {
                                            System.out.print("\nEnter your choice > ");
                                            continueChoice = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (continueChoice < 1 || continueChoice > 2) {
                                                System.out.println("Invalid input. Please enter number 1 or 2.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    if (continueChoice == 1) {
                                        continue2 = true;
                                    } else {
                                        continue2 = false;
                                    }
                                }while (continue2 == true);
                                break;

                            case 3:
                                do {
                                    int semInput = 0;
                                    do {
                                        try {
                                            System.out.print("Enter semester > ");
                                            semInput = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (semInput < 1 || semInput > 4) {
                                                System.out.println("No such semester.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    tutor.filterTutorialGroupBySem(semInput);

                                    continueMenu();
                                    do {
                                        try {
                                            System.out.print("\nEnter your choice > ");
                                            continueChoice = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (continueChoice < 1 || continueChoice > 2) {
                                                System.out.println("Invalid input. Please enter number 1 or 2.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    if (continueChoice == 1) {
                                        continue2 = true;
                                    } else {
                                        continue2 = false;
                                    }
                                }while (continue2 == true);
                                break;

                            case 4:
                                do {
                                    int groupInput = 0;
                                    do {
                                        try {
                                            System.out.print("Enter group number > ");
                                            groupInput = scanner.nextInt();
                                            validCtnChoice = true;

                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    tutor.filterTutorialGroupByNum(groupInput);

                                    continueMenu();
                                    do {
                                        try {
                                            System.out.print("\nEnter your choice > ");
                                            continueChoice = scanner.nextInt();
                                            validCtnChoice = true;

                                            if (continueChoice < 1 || continueChoice > 2) {
                                                System.out.println("Invalid input. Please enter number 1 or 2.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                            scanner.next(); // discard the invalid input
                                            validCtnChoice = false;
                                        }
                                    } while (validCtnChoice == false);

                                    if (continueChoice == 1) {
                                        continue2 = true;
                                    } else {
                                        continue2 = false;
                                    }
                                }while (continue2 == true);
                                break;
                        }

                    } else if (tutMenuChoice == 3) {
                        System.out.println("=======================================");
                        System.out.println("|      Tutorial Group     |   Count   |");
                        System.out.println("=======================================");
                        System.out.println("| Year 1 |         |      |     " + tutor.getYearCount(1) + "     |");
                        System.out.println("|        | Sem 1   |      |     " + tutor.getSemCount(1, 1) + "     |");
                        System.out.println("|        |         | G 1  |     " + tutor.getGroupCount(1,1, 1) + "     |");
                        System.out.println("|        |         | G 2  |     "+ tutor.getGroupCount(1,1, 2) + "     |");
                        System.out.println("|        |         | G 3  |     "+ tutor.getGroupCount(1,1, 3) + "     |");
                        System.out.println("|        | Sem 2   |      |     " + tutor.getSemCount(1, 2) + "     |");
                        System.out.println("|        |         | G 1  |     " + tutor.getGroupCount(1,2, 1) + "     |");
                        System.out.println("|        |         | G 2  |     "+ tutor.getGroupCount(1,2, 2) + "     |");
                        System.out.println("|        |         | G 3  |     "+ tutor.getGroupCount(1,2, 3) + "     |");
                        System.out.println("|        | Sem 3   |      |     " + tutor.getSemCount(1, 3) + "     |");
                        System.out.println("|        |         | G 1  |     " + tutor.getGroupCount(1,3, 1) + "     |");
                        System.out.println("|        |         | G 2  |     "+ tutor.getGroupCount(1,3, 2) + "     |");
                        System.out.println("|        |         | G 3  |     "+ tutor.getGroupCount(1,3, 3) + "     |");
                        System.out.println("| Year 2 |         |      |     " + tutor.getYearCount(2) + "     |");
                        System.out.println("|        | Sem 1   |      |     " + tutor.getSemCount(2, 1) + "     |");
                        System.out.println("|        |         | G 1  |     " + tutor.getGroupCount(2,1, 1) + "     |");
                        System.out.println("|        |         | G 2  |     "+ tutor.getGroupCount(2,1, 2) + "     |");
                        System.out.println("|        |         | G 3  |     "+ tutor.getGroupCount(2,1, 3) + "     |");
                        System.out.println("|        | Sem 2   |      |     " + tutor.getSemCount(2, 2) + "     |");
                        System.out.println("|        |         | G 1  |     " + tutor.getGroupCount(2,2, 1) + "     |");
                        System.out.println("|        |         | G 2  |     "+ tutor.getGroupCount(2,2, 2) + "     |");
                        System.out.println("|        |         | G 3  |     "+ tutor.getGroupCount(2,2, 3) + "     |");
                        System.out.println("|        | Sem 3   |      |     " + tutor.getSemCount(2, 3) + "     |");
                        System.out.println("|        |         | G 1  |     " + tutor.getGroupCount(2,3, 1) + "     |");
                        System.out.println("|        |         | G 2  |     "+ tutor.getGroupCount(2,3, 2) + "     |");
                        System.out.println("|        |         | G 3  |     "+ tutor.getGroupCount(2,3, 3) + "     |");
                        System.out.println("| Year 3 |         |      |     " + tutor.getYearCount(3) + "     |");
                        System.out.println("|        | Sem 1   |      |     " + tutor.getSemCount(3, 1) + "     |");
                        System.out.println("|        |         | G 1  |     " + tutor.getGroupCount(3,1, 1) + "     |");
                        System.out.println("|        |         | G 2  |     "+ tutor.getGroupCount(3,1, 2) + "     |");
                        System.out.println("|        |         | G 3  |     "+ tutor.getGroupCount(3,1, 3) + "     |");
                        System.out.println("|        | Sem 2   |      |     " + tutor.getSemCount(3, 2) + "     |");
                        System.out.println("|        |         | G 1  |     " + tutor.getGroupCount(3,2, 1) + "     |");
                        System.out.println("|        |         | G 2  |     "+ tutor.getGroupCount(3,2, 2) + "     |");
                        System.out.println("|        |         | G 3  |     "+ tutor.getGroupCount(3,2, 3) + "     |");
                        System.out.println("|        | Sem 3   |      |     " + tutor.getSemCount(3, 3) + "     |");
                        System.out.println("|        |         | G 1  |     " + tutor.getGroupCount(3,3, 1) + "     |");
                        System.out.println("|        |         | G 2  |     "+ tutor.getGroupCount(3,3, 2) + "     |");
                        System.out.println("|        |         | G 3  |     "+ tutor.getGroupCount(3,3, 3) + "     |");
                        System.out.println("|-------------------------------------|");

                    } else if (tutMenuChoice == 4) {
                        validTutGroup = false;
                    }
                }while (validTutGroup );

            }else if(mainMenuChoice == 3){
                valid = false;
            }

        }



    }




}




