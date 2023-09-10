package client;

import adt.HashMap;
import entity.Programme;
import adt.HashMapInterface;
import entity.TutorialGroup;

import java.util.Iterator;
import java.util.Scanner;

public class ProgrammeManager {
    private HashMapInterface<String, Programme> p;

    public ProgrammeManager(HashMapInterface<String, Programme> p){
        this.p = p;
    }

    static Scanner scan = new Scanner(System.in);
    public void addProgramme(HashMapInterface<String, Programme> p){
        int newIDR = 0;
        String addProgrammeID = null;

        while (true) {
            String newId = "P" + (p.size() + 1 + newIDR);

            if (!p.containsKey(newId)) {
                addProgrammeID = newId;
                break;
            } else {
                newIDR++;
            }
        }

        System.out.println("Please enter programme code: ");
        String programmeCode = scan.nextLine();

        System.out.println("Please enter programme name: ");
        String programmeName = scan.nextLine();

        System.out.println("Please enter programme description: ");
        String programmeDesc = scan.nextLine();

        System.out.println("Please enter programme programmeLeader: ");
        String programmeLeader = scan.nextLine();

        System.out.println("Please enter programme duration: ");
        int programmeDuration = scan.nextInt();

        Programme programme = new Programme(addProgrammeID, programmeCode, programmeName, programmeDesc, programmeLeader, programmeDuration);
        p.put(programme.getId(), programme);
        Programme a = p.get(addProgrammeID);
        String addCode = a.getCode();
        System.out.println( addCode + " has been added successfully!");
    }

    public String deleteProgramme(HashMapInterface<String, Programme> p){
        System.out.println("Please enter programme ID that you want to delete: ");
        String deleteProgrammeID = scan.next();

        if (p.containsKey(deleteProgrammeID)) {
            p.remove(deleteProgrammeID);
            System.out.println(deleteProgrammeID + " has been successfully deleted! Press Enter to continue.");

        } else {
            System.out.println(deleteProgrammeID + " does not exist in the Programme! ");
        }
        return deleteProgrammeID;
    }

    public void searchProgramme(HashMapInterface<String, Programme> p){
        System.out.println("Please enter programme ID that you want to search: ");
        String searchProgrammeID = scan.nextLine();

        if (p.containsKey(searchProgrammeID)) {
            System.out.println(p.get(searchProgrammeID));
        } else {
            System.out.println(searchProgrammeID + " does not exist in the Programme! ");
        }
    }

    public void displayProgrammeList(HashMapInterface<String, Programme> p) {
        Iterator<HashMap.Entry<String, Programme>> iterator = p.iterator();

        System.out.printf("%-4s %-10s %-30s %-20s %-8s\n", "ID", "Code", "Name", "Programme Leader", "Duration");

        while (iterator.hasNext()) {
            HashMap.Entry<String, Programme> entry = iterator.next();
            Programme prog = entry.getValue();

            String id = entry.getKey();
            String code = prog.getCode();
            String name = prog.getName();
            String programmeLeader = prog.getProgrammeLeader();
            int duration = prog.getDuration();

            System.out.printf("%-4s %-10s %-30s %-20s %-8s\n", id, code, name, programmeLeader, duration);
        }
    }
    public void displayAllProgramme(HashMapInterface<String, Programme> p){
        System.out.println(p);
        System.out.println("");
        System.out.println("Press Enter to continue.");
    }

    public void editProgramme(HashMapInterface<String , Programme> p){
        displayAllProgramme(p);
        System.out.println("Please enter programme ID that you want to edit: ");
        String editProgrammeID = scan.nextLine();
        if (p.containsKey(editProgrammeID)) {
            Programme programme = p.get(editProgrammeID);

            System.out.println("Please enter new programme code: (Press Enter to keep the same)");
            String programmeCode = scan.nextLine();
            if (!programmeCode.isEmpty()) {
                programme.setCode(programmeCode);
            }

            System.out.println("Please enter new programme name: (Press Enter to keep the same)");
            String programmeName = scan.nextLine();
            if (!programmeName.isEmpty()) {
                programme.setName(programmeName);
            }

            System.out.println("Please enter new programme description: (Press Enter to keep the same)");
            String programmeDesc = scan.nextLine();
            if (!programmeDesc.isEmpty()) {
                programme.setDescription(programmeDesc);
            }

            System.out.println("Please enter new programme programme leader: (Press Enter to keep the same)");
            String programmeLeader = scan.nextLine();
            if (!programmeLeader.isEmpty()) {
                programme.setProgrammeLeader(programmeLeader);
            }

            System.out.println("Please enter programme duration: ");
            int programmeDuration = scan.nextInt();
            programme.setDuration(programmeDuration);

            System.out.println(p.get(editProgrammeID));
        } else {
            System.out.println(editProgrammeID + " does not exist in the Programme! ");
        }
    }

    public void displayExistingProgramme(HashMapInterface<String, Programme> p){
        Iterator<HashMap.Entry<String, Programme>> iterator = p.iterator();
        System.out.printf("%-4s : %-4s %-30s","ID" , "Code" , "Name");
        while (iterator.hasNext()){
            HashMap.Entry<String, Programme> entry = iterator.next();
            Programme prog = entry.getValue();
            String existProgCode = prog.getCode();
            String existProgName = prog.getName();
            System.out.printf("\n%-4s : %-4s %-30s",entry.getKey() , existProgCode , existProgName);
        }
    }


}
